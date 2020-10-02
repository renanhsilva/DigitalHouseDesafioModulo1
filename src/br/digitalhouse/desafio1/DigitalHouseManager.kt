package br.digitalhouse.desafio1

class DigitalHouseManager() {

    val listaDeAlunos = mutableMapOf<Int, Aluno>()
    val listaDeProfessores = mutableMapOf<Int, Professor>()
    val listaDeCursos = mutableMapOf<Int, Curso>()
    val listaDeMatriculas = mutableListOf<Matricula>()


    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int ){
        if (listaDeCursos[codigoCurso] == null){
            listaDeCursos[codigoCurso] = Curso(nome,codigoCurso,null,null,quantidadeMaximaDeAlunos)
            println("Curso ${nome} adicionado com sucesso aos cursos!")
        }else{
            println("Curso já existente!")
        }
    }

    fun excluirCurso(codigoCurso: Int){
        if (listaDeCursos.remove(codigoCurso) != null){
            println("Curso ${listaDeCursos[codigoCurso]} removido com sucesso dos cursos!")
        }else{
            println("Curso não encontrado!")
        }
    }

    fun registrarProfessorAdjunto(nome: String ,sobrenome: String ,codigoProfessor: Int, quantidadeDeHoras: Int){
        if (listaDeProfessores[codigoProfessor] == null) {
            listaDeProfessores[codigoProfessor] = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, 0, codigoProfessor)
            println("Professor Adjunto ${nome}  ${sobrenome} adicionado com sucesso!")
        }else{
            println("Professor Adjunto já existente!")
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        if (listaDeProfessores[codigoProfessor] == null){
            listaDeProfessores[codigoProfessor] = ProfessorTitular(especialidade,nome,sobrenome,0,codigoProfessor)
            println("Professor Titular ${nome}  ${sobrenome} adicionado com sucesso!")
        }else{
            println("Professor Titular já existente!")
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        if (listaDeProfessores.remove(codigoProfessor) != null){
            println("Curso ${listaDeCursos[codigoProfessor]} removido com sucesso dos cursos!")
        }else{
            println("Curso não encontrado!")
        }

    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int){
        listaDeAlunos[codigoAluno] = Aluno(codigoAluno,nome,sobrenome)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val aluno = listaDeAlunos[codigoAluno]
        val curso = listaDeCursos[codigoCurso]
        when{
            aluno == null -> println("Aluno não encontrado")
            curso == null -> println("Curso não encontrado")
            else -> curso.adicionarUmAluno(aluno)
        }
    }

    fun alocarProfessores(codigoCurso: Int,codigoProfessorTitular:  Int, codigoProfessorAdjunto:Int){
        val professorTitular = listaDeProfessores[codigoProfessorTitular]
        if (professorTitular == null) println("Professor Titular nao encontrado")
        val professorAdjunto = listaDeProfessores[codigoProfessorAdjunto]
        if (professorTitular == null) println("Professor Adjunto não encontrado")
        val curso = listaDeCursos[codigoCurso]
        if (curso != null) {
            curso.professorTitular = professorTitular as ProfessorTitular?
            curso.professorAdjunto = professorAdjunto as ProfessorAdjunto?
        }else{
            println("Curso não encontrado")
        }
    }

    fun verdados(){
        println(listaDeAlunos)
        println(listaDeCursos)
        println(listaDeMatriculas)
        println(listaDeProfessores)
    }

}
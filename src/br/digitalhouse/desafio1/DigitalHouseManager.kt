package br.digitalhouse.desafio1

class DigitalHouseManager(var listaDeAlunos: MutableMap<Int, Aluno> = mutableMapOf(),
                          var listaDeProfessores: MutableMap<Int, Professor> = mutableMapOf(),
                          var listaDeCursos: MutableMap<Int, Curso> = mutableMapOf(),
                          var listaDeMatriculas: MutableList<Matricula>) {

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int ){
       listaDeCursos[codigoCurso] = Curso(nome,codigoCurso,null,null,quantidadeMaximaDeAlunos,null)

    }

    fun excluirCurso(codigoCurso: Int){
        listaDeCursos.remove(codigoCurso)
    }

    fun registrarProfessorAdjunto(nome: String ,sobrenome: String ,codigoProfessor: Int, quantidadeDeHoras: Int){
        ProfessorAdjunto(quantidadeDeHoras,nome,sobrenome,0,codigoProfessor)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        ProfessorTitular(especialidade,nome,sobrenome,0,codigoProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int){
        listaDeProfessores.remove(codigoProfessor)
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno:Int){
        Aluno(nome,sobrenome,codigoAluno)
    }

//    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) //Acrescentei o "Curso" no nome da função
//        val aluno = listaDeAlunos.containsKey(c)
}
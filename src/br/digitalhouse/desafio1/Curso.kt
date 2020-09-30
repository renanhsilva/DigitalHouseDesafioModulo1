package br.digitalhouse.desafio1

class Curso(val nome: String, val codCurso: Int, val professorTitular: ProfessorTitular, val professorAdjunto: ProfessorAdjunto, val qtdmaxAlunos: Int, val aluno: Aluno, val listaAluno: MutableList<Aluno>) {

    fun adicionarUmAluno(umAluno: Aluno): Boolean{ //Adiciona aluno do curso (Requerimento da parte H)
        if (listaAluno.size == qtdmaxAlunos){
            println("Limite de alunos excedido no curso")
            return false
        }else{
            listaAluno.add(umAluno)
            println("Aluno {${umAluno.nome} adicionado ao curso")
            return true
        }
    }

    fun excluirAluno(umAluno: Aluno) = listaAluno.remove(umAluno) //Remover aluno do curso (Requerimento da parte H)
}
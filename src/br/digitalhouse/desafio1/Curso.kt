package br.digitalhouse.desafio1

class Curso(val nome: String,
            val codCurso: Int,
            var professorTitular: ProfessorTitular? = null,
            var professorAdjunto: ProfessorAdjunto? = null,
            val qtdmaxAlunos: Int) {

    val listaAluno = mutableListOf<Aluno>()


    fun adicionarUmAluno(umAluno: Aluno): Boolean{ //Adiciona aluno do curso (Requerimento da parte H)
        if (listaAluno.size == qtdmaxAlunos){
            println("Limite de alunos excedido no curso")
            return false
        }else{
            listaAluno.add(umAluno)
            println("Aluno ${umAluno.nome} adicionado ao curso ${nome}")
            return true
        }
    }

    fun excluirAluno(umAluno: Aluno) = listaAluno.remove(umAluno) //Remover aluno do curso (Requerimento da parte H)

    override fun toString(): String {
        return "Curso: $nome, Codigo: $codCurso, Professor Titular: $professorTitular, Professor Adjunto: $professorAdjunto, " +
                "Quantidade máxima de aluno: $qtdmaxAlunos e lista de aluno: $listaAluno \n"
    }
}
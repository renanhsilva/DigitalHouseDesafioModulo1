package br.digitalhouse.desafio1

class Aluno(val codAluno: Int,
            val nome: String,
            val sobrenome: String
             ) {

    override fun toString(): String {
        return "Aluno: $nome $sobrenome, Codigo: $codAluno \n"
    }
}
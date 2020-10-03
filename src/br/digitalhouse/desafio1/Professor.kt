package br.digitalhouse.desafio1

open class Professor(val nome: String,
                     val sobrenome: String,
                     val tempoDeCasa: Int,
                     val codProfessor: Int) {

    override fun toString(): String {
        return "Nome: $nome, Sobrenome: $sobrenome, Tempo de Casa: $tempoDeCasa, Código Professor: $codProfessor \n"
    }
}
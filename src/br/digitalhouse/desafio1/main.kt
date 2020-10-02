package br.digitalhouse.desafio1

fun main(){

    val aluno1 = Aluno("Renan","Silva",1)
    val aluno2 = Aluno("Gustavo","Santos",2)
    val aluno3 = Aluno("Liz","Siso",3)

    val listaAluno = mutableListOf<Aluno>()

    val professor1 = ProfessorTitular("Kotlin","Carlos","Adão",1,1)
    val professor2 = ProfessorAdjunto(20,"Vitoria","Gonçalves",5,2)

    val curso1 = Curso("Desenvolvimento em Kotlin",2,professor1,professor2,10,listaAluno)

    val gerencia = DigitalHouseManager()

    gerencia.matricularAluno(3,2)




}

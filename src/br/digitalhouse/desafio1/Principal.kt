package br.digitalhouse.desafio1

class Principal {

    fun main(){

        val digitalHouseManager = DigitalHouseManager()

        //registrando professores titulares
        digitalHouseManager.registrarProfessorTitular("Carlos","Adão",1, "Kotlin")
        digitalHouseManager.registrarProfessorTitular("João","Carlos",2,"POO")

        //registrando professores adjuntos
        digitalHouseManager.registrarProfessorAdjunto("Vitoria","Gonçalves",3,0)
        digitalHouseManager.registrarProfessorAdjunto("Jessica","Silva", 4, 0)

        //registrando cursos

        digitalHouseManager.registrarCurso("Full Stack",2001,3)
        digitalHouseManager.registrarCurso("Android",2002,2)


        //alocando professores no curso
        digitalHouseManager.alocarProfessores(2001,10,3)
        digitalHouseManager.alocarProfessores(2002,2,4)

        //matriculando os alunos
        digitalHouseManager.matricularAluno("Renan","Silva",1)
        digitalHouseManager.matricularAluno("Bianca","Monelly",2)
        digitalHouseManager.matricularAluno("Kleber","Santos",3)
        digitalHouseManager.matricularAluno("Pablo","Almeida",4)
        digitalHouseManager.matricularAluno("Alex","Queiroz",5)

        //alocando alunos nos cursos

        digitalHouseManager.matricularAluno(1,2001)
        digitalHouseManager.matricularAluno(2,2001)
        digitalHouseManager.matricularAluno(3,2002)
        digitalHouseManager.matricularAluno(4,2002)
        digitalHouseManager.matricularAluno(5,2002)

    }
}
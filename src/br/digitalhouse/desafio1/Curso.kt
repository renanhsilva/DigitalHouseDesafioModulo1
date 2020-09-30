package br.digitalhouse.desafio1

class Curso(val nome: String, val codCurso: Int, val professorTitular: ProfessorTitular, val professorAdjunto: ProfessorAdjunto, val qtdmaxAlunos: Int, val aluno: Aluno, val listaAluno: MutableList<Aluno>) {

}
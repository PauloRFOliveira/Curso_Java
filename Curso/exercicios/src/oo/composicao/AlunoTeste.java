package oo.composicao;

public class AlunoTeste
{
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Lucas");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2022");
        Curso curso3 = new Curso("React Native");

        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso2.addAluno(aluno1);
        curso2.addAluno(aluno3);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);

        for (Aluno aluno: curso1.alunos)
        {
            System.out.println("Estou matriculado no curso " + curso1.nome +" e meu nome e " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.fazCurso("Java Completo"));
        System.out.println(aluno2.fazCurso("Web 2022"));

        System.out.println(curso2.alunos);
    }
}

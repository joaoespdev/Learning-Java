package dev.jao.projeto3;

public class AlunoTestar {

    public static void main(String [] args) {

        Aluno aluno1 = new Aluno();

        //aluno1.nome = "Fernanda";

        aluno1.setNome("Fernanda");

        System.out.println(aluno1.getNome());

        //aluno1.idade = 500;

        aluno1.setIdade(500);
    }
}

// Entender porque utilizamos modificadores de acesso e utilizamos métodos get e set por segurança:
// https://www.youtube.com/watch?v=_5iyl5lcoJY
// Lembrar que a IDE faz get e set dos atributos que você quiser, sem precisar escrever na mão.
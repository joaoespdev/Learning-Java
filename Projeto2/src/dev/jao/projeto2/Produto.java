package dev.jao.projeto2;

public class Produto {
    //atributos
    String nome;
    String marca;
    float valor;

    //construtores
    Produto(){ // É interessante o construtor padrão permanecer assim, caso queira criar um objeto sem nenhum parâmetro.

    }

    Produto(String nome){
        this.nome = nome;
    }

    Produto (String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Produto (String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

}

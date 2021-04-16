package br.com.zup.Agenda.models;

import java.util.Objects;

public class Telefone {

    private String nome; // definição de atributo;
    private String telefone; // definição de atributo;

        public Telefone() {
        } //Constructor vazio criado.

    //os getter/setter serem chamados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override // sobrescever
    public boolean equals(Object o) {//método de verificação.
        if (this == o) return true;// se for exatamente 0 ele vai retornar verdadeiro.
        if (o == null || getClass() != o.getClass()) return false;// se for realmente nulo, ele vai retornar falso.
        Telefone telefone1 = (Telefone) o;// Objeto definido.
        return Objects.equals(nome, telefone1.nome) && Objects.equals(telefone, telefone1.telefone);
    }//Estou verificando se os conteúdos dos objetos.

}
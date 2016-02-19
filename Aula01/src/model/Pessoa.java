package model;

import java.util.ArrayList;
import java.util.List;


public class Pessoa {
    
    private int id;
    private String nome;
    private String tel;
    private List<Contato> contatos;

    public Pessoa() {
        id = 0;
        nome = new String();
        tel = new String();
        contatos = new ArrayList<>();
    }

    public Pessoa(int id, String nome, String tel, List<Contato> contatos) {
        this.id = id;
        this.nome = nome;
        this.tel = tel;
        this.contatos = contatos;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }
    
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    
    public void removerContato(int posicao) {
        contatos.remove(posicao);
    }
    
}

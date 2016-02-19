package model;

public class Contato {

    private int id;
    private String nome;
    private String ddd;
    private String tel;
    private String operadora;

    public Contato() {
        nome = new String();
        ddd = new String();
        tel = new String();
        operadora = new String();
    }

    public Contato(int id, String nome, String ddd, String tel, String operadora) {
        this.id = id;
        this.nome = nome;
        this.ddd = ddd;
        this.tel = tel;
        this.operadora = operadora;
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

    public String getddd() {
        return ddd;
    }

    public void setddd(String ddd) {
        this.ddd = ddd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

}

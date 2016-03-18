package br.pro.luciene.exemplomvc.model;

/**
 *
 * @author Lucas Basseti
 */
public class Usuario {
    
    private int Id;
    private String login;
    private String senha;

    public Usuario() {
        login = new String();
        senha = new String();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}

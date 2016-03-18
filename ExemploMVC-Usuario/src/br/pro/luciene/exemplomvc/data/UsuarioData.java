package br.pro.luciene.exemplomvc.data;

import br.pro.luciene.exemplomvc.model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Lucas Basseti
 */
public class UsuarioData {
    
    public UsuarioData() throws Exception {

    }
    
    public boolean incluir(Usuario usuario) throws Exception {
        String sql = "INSERT INTO TbUsuarios VALUES (sidusuario.nextval, ?, ?) ";
        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
        ps.setString(1, usuario.getLogin());
        ps.setString(2, usuario.getSenha());
        
        return ps.executeUpdate() > 0;
    }
    
    public ArrayList<Usuario> pesquisar(String campo, String pesquisa) throws Exception {
        ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
        String sql = "SELECT * FROM TbUsuarios ";
        
        if (campo.equals("Id"))
            sql += "WHERE IdUsuario = "+ pesquisa.trim();
        else 
        if (campo.equals("Login"))
            sql += "WHERE Login LIKE '"+ pesquisa.trim() +"%' ";
        
        PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            Usuario usuario = new Usuario();
            usuario.setId(rs.getInt("IdUsuario"));
            usuario.setLogin(rs.getString("Login"));
            usuario.setSenha(rs.getString("Senha"));
            listaUsuarios.add(usuario);
        }
        
        return listaUsuarios;
    }
    
}

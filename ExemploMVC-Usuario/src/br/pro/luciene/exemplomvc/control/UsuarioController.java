package br.pro.luciene.exemplomvc.control;

import br.pro.luciene.exemplomvc.data.UsuarioData;
import br.pro.luciene.exemplomvc.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Lucas Basseti
 */
public class UsuarioController {
    
    private UsuarioData DAO;

    public UsuarioController() throws Exception {
        this.DAO = new UsuarioData();
    }
    
    
    
    public boolean incluir(Usuario usuario) throws Exception {
        return DAO.incluir(usuario);
    }
    
    public ArrayList<Usuario> pesquisar(String campo, String pesquisa) throws Exception {
        return DAO.pesquisar(campo, pesquisa);
    }
}

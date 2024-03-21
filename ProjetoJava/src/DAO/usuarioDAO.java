package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entity.usuario;

public class usuarioDAO {
    public  void cadastrarUsuario(usuario usuario) {
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL, ENDERECO, NUMERO_TELEFONE) VALUES (?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getEndereco());
            ps.setString(6, usuario.getNumeroTelefone());

            ps.execute();
            ps.close();

        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
}

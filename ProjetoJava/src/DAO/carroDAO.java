package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entity.carro;

public class carroDAO {
     public  void cadastrarCarro(carro carro) {
        String sql = "INSERT INTO CARROS (MODELO, MARCA, ANO, CAPACIDADE, TIPO_TRANSMISSAO, PRECO_ALUGUEL, DISPONIVEL) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        try {
            ps = conexao.getConexao().prepareStatement(sql);
            ps.setString(1, carro.getModelo());
            ps.setString(2, carro.getMarca());
            ps.setInt(3, carro.getAno());
            ps.setInt(4, carro.getCapacidade());
            ps.setString(5, carro.getTipoTransmissao());
            ps.setInt(6, carro.getPrecoAluguel());
            ps.setBoolean(7, carro.getDisponivel());

            ps.execute();
            ps.close();

        } catch (SQLException e) { 
            e.printStackTrace();
        }
    }
}

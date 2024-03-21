import DAO.usuarioDAO;
import entity.usuario;
// import DAO.carroDAO;
// import entity.carro;

public class App {
    public static void main(String[] args) throws Exception {
        
        usuario u = new usuario();
        u.setNome("Leo");
        u.setLogin("leo");
        u.setSenha("7653");
        u.setEmail("leo@gmail.com");
        u.setEndereco("Joao Cernach, 20, sei la");
        u.setNumeroTelefone("18999999999");

        new usuarioDAO().cadastrarUsuario(u);

        // carro c = new carro();
        // c.setModelo("Fastback");
        // c.setMarca("FIAT");
        // c.setAno(2020);
        // c.setCapacidade(5);
        // c.setTipoTransmissao("Automatico");
        // c.setPrecoAluguel(160);
        // c.setDisponivel(false);

        // new carroDAO().cadastrarCarro(c);
    }
}
 
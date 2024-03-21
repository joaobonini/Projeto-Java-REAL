package entity;

public class usuario {
    private int codigo;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String endereco;
    private String numero_telefone;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco= endereco;
    }

    public String getNumeroTelefone() {
        return numero_telefone;
    }

    public void setNumeroTelefone(String numero_telefone) {
        this.numero_telefone = numero_telefone;
    }
}

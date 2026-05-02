package model;

public class Requisicao {
    public String usuario;
    public String token;
    public String permissao;
    public boolean dadosValidos;

    public Requisicao(String usuario, String token, String permissao, boolean dadosValidos) {
        this.usuario = usuario;
        this.token = token;
        this.permissao = permissao;
        this.dadosValidos = dadosValidos;
    }
}
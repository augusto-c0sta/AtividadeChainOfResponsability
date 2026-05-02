package app;

import middleware.*;
import model.Requisicao;

public class Main {

    public static void main(String[] args) {

        Middleware auth = new AuthMiddleware();
        Middleware permissao = new PermissaoMiddleware();
        Middleware validacao = new ValidacaoMiddleware();
        Middleware log = new LogMiddleware();
        Middleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("=== CENÁRIO 1 ===");
        auth.processar(new Requisicao("admin", "valido", "ADMIN", true));

        System.out.println("\n=== CENÁRIO 2 ===");
        auth.processar(new Requisicao("admin", "invalido", "ADMIN", true));

        System.out.println("\n=== CENÁRIO 3 ===");
        auth.processar(new Requisicao("user", "valido", "USER", true));

        System.out.println("\n=== CENÁRIO 4 ===");
        auth.processar(new Requisicao("admin", "valido", "ADMIN", false));
    }
}
package middleware;

import model.Requisicao;

public class AuthMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!"valido".equals(req.token)) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }
        return proximo(req);
    }
}
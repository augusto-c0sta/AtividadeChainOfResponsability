package middleware;

import model.Requisicao;

public class PermissaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!"ADMIN".equals(req.permissao)) {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
        return proximo(req);
    }
}
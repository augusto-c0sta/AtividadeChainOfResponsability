package middleware;

import model.Requisicao;

public class ValidacaoMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if (!req.dadosValidos) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
        return proximo(req);
    }
}
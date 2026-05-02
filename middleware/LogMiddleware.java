package middleware;

import model.Requisicao;

public class LogMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");
        return proximo(req);
    }
}
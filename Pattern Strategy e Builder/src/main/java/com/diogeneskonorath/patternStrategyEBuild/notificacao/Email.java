package com.diogeneskonorath.patternStrategyEBuild.notificacao;

public class Email implements Notificacao {
    @Override
    public String enviarMensagem(String mensagem) {
        return "[EMAIL]"+ mensagem;
    }
}

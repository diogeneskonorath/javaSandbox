package com.diogeneskonorath.patternStrategyEBuild.notificacao;

public class SMS implements Notificacao {
    @Override
    public String enviarMensagem(String mensagem) {
        return  "[SMS]" + mensagem;
    }
}

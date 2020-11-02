package com.diogeneskonorath.patternStrategyEBuild;

import com.diogeneskonorath.patternStrategyEBuild.notificacao.Notificacao;
import com.diogeneskonorath.patternStrategyEBuild.notificacao.NotificacaoBuilder;
import com.diogeneskonorath.patternStrategyEBuild.notificacao.NotificacaoFactory;

public class SistemaMensagem {
    private NotificacaoBuilder notificacaoBuilder;

    public SistemaMensagem() {
        notificacaoBuilder = new NotificacaoBuilder();
    }

    public String notificacao(Cliente cliente){
        String mensagem = notificacaoBuilder
                .escreveMsg("HELLO")
                .paraCliente(cliente)
                .build();

        Notificacao notificacao = NotificacaoFactory.tipoMensagem(cliente);
        return notificacao.enviarMensagem(mensagem);
    }
}

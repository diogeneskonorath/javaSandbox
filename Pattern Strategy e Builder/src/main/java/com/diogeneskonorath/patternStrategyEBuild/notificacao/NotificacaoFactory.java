package com.diogeneskonorath.patternStrategyEBuild.notificacao;

import com.diogeneskonorath.patternStrategyEBuild.Cliente;

public class NotificacaoFactory {
    public static Notificacao tipoMensagem(Cliente cliente){
        NotificacaoBuilder notificacaoBuilder = new NotificacaoBuilder();
        if (notificacaoBuilder.temTelefone())
            return new SMS();
        else
            return new Email();
    }
}

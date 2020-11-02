package com.diogeneskonorath.patternStrategyEBuild.notificacao;

import com.diogeneskonorath.patternStrategyEBuild.Cliente;

import java.util.Optional;

public class NotificacaoBuilder {
        private String mensagem, nomeCliente;
        Cliente cliente;

    public boolean temTelefone(){
        return Optional.ofNullable(cliente.getTelefone()).isPresent();
    }

        public NotificacaoBuilder escreveMsg(String mensagem){
            this.mensagem = mensagem;
            return this;
        }
        public NotificacaoBuilder paraCliente(Cliente cliente){
            this.nomeCliente = cliente.getNome();
            return this;
        }
        public String build(){
            return mensagem+" "+nomeCliente;
        }
}

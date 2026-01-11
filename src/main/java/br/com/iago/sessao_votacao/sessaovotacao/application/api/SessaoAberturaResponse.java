package br.com.iago.sessao_votacao.sessaovotacao.application.api;

import br.com.iago.sessao_votacao.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class SessaoAberturaResponse {
    private UUID idSessao;

    public SessaoAberturaResponse(SessaoVotacao sessaoVotacao) {
    this.idSessao = sessaoVotacao.getId();
    }
}

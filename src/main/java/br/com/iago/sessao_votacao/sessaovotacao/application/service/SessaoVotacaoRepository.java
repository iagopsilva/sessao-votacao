package br.com.iago.sessao_votacao.sessaovotacao.application.service;

import br.com.iago.sessao_votacao.sessaovotacao.domain.SessaoVotacao;

public interface SessaoVotacaoRepository {
    SessaoVotacao salva(SessaoVotacao sessaoVotacao);
}

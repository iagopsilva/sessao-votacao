package br.com.iago.sessao_votacao.sessaovotacao.application.service;

import br.com.iago.sessao_votacao.sessaovotacao.application.api.SessaoAberturaRequest;
import br.com.iago.sessao_votacao.sessaovotacao.application.api.SessaoAberturaResponse;

public interface SessaoVotacaoService {
    SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest);
}

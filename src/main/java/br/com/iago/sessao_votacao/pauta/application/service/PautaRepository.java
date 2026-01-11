package br.com.iago.sessao_votacao.pauta.application.service;

import br.com.iago.sessao_votacao.pauta.domain.Pauta;

public interface PautaRepository {
    Pauta salva(Pauta pauta);
}

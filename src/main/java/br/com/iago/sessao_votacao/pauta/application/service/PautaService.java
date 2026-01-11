package br.com.iago.sessao_votacao.pauta.application.service;

import br.com.iago.sessao_votacao.pauta.application.api.NovaPautaRequest;
import br.com.iago.sessao_votacao.pauta.application.api.PautaCadastradaResponse;

public interface PautaService {
    PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta);
}

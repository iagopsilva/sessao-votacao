package br.com.iago.sessao_votacao.pauta.application.service;

import br.com.iago.sessao_votacao.pauta.application.api.NovaPautaRequest;
import br.com.iago.sessao_votacao.pauta.application.api.PautaCadastradaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

//Entende as regras do seu negócio (Prazos, validações, cálculos)
@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaApplicationService - cadastraPauta");
        log.info("[nova Pauta] {}", novaPauta);
        log.info("[finaliza] PautaApplicationService - cadastraPauta");
        return null;
    }
}

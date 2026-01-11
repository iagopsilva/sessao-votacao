package br.com.iago.sessao_votacao.pauta.application.service;

import br.com.iago.sessao_votacao.pauta.application.api.NovaPautaRequest;
import br.com.iago.sessao_votacao.pauta.application.api.PautaCadastradaResponse;
import br.com.iago.sessao_votacao.pauta.domain.Pauta;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

//Entende as regras do seu negócio (Prazos, validações, cálculos)
@Service
@RequiredArgsConstructor
@Log4j2
public class PautaApplicationService implements PautaService {
    private final PautaRepository pautaRepository;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaApplicationService - cadastraPauta");
        log.info("[nova Pauta] {}", novaPauta);
        Pauta pauta = pautaRepository.salva(new Pauta(novaPauta));
        log.info("[finaliza] PautaApplicationService - cadastraPauta");
        //Evitar usar Builder aqui porque ele acaba vazando encapsulamento
        return new PautaCadastradaResponse(pauta);
    }
}

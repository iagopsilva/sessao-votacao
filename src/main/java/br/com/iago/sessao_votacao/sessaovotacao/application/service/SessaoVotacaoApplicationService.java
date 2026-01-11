package br.com.iago.sessao_votacao.sessaovotacao.application.service;

import br.com.iago.sessao_votacao.pauta.application.api.PautaCadastradaResponse;
import br.com.iago.sessao_votacao.pauta.application.service.PautaRepository;
import br.com.iago.sessao_votacao.pauta.domain.Pauta;
import br.com.iago.sessao_votacao.sessaovotacao.application.api.SessaoAberturaRequest;
import br.com.iago.sessao_votacao.sessaovotacao.application.api.SessaoAberturaResponse;
import br.com.iago.sessao_votacao.sessaovotacao.domain.SessaoVotacao;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoApplicationService implements SessaoVotacaoService {
    private final SessaoVotacaoRepository sessaoVotacaoRepository;

    @Override
    public SessaoAberturaResponse abreSessao(SessaoAberturaRequest sessaoAberturaRequest) {
        log.info("[inicia] SessaoVotacaoApplicationService - abreSessao");
        SessaoVotacao sessaoVotacao = sessaoVotacaoRepository.salva(new SessaoVotacao(sessaoAberturaRequest));
        log.info("[finaliza] SessaoVotacaoApplicationService - abreSessao");
        return new SessaoAberturaResponse(sessaoVotacao);
    }
}

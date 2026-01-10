package br.com.iago.sessao_votacao.pauta.application.api;

import br.com.iago.sessao_votacao.pauta.application.service.PautaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Porta de entrada de sua aplicação
@RestController
/*gerar automaticamente um construtor para todos os campos que você
marcou como final (Injeção de Dependências por Construtor)*/
@RequiredArgsConstructor
/*Serve para você conseguir visualizar o que você está fazendo no seu
código */
@Log4j2
//Endereço ou rota que o usuário ou sistema deve digitar para acessar os métodos daquela classe
@RequestMapping("/pauta")
public class PautaController implements PautaAPI {
    private final PautaService pausaService;

    @Override
    public PautaCadastradaResponse cadastraPauta(NovaPautaRequest novaPauta) {
        log.info("[inicia] PautaController - cadastraPauta");
        PautaCadastradaResponse pautaCadastrada = pausaService.cadastraPauta(novaPauta);
        log.info("[finaliza] PautaController - cadastraPauta");
        return pautaCadastrada;
    }
}

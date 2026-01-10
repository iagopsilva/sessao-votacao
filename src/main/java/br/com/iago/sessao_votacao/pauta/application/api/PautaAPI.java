package br.com.iago.sessao_votacao.pauta.application.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Porta de entrada de sua aplicação
@RestController
@RequestMapping("/pauta")
public interface PautaAPI {
    @PostMapping
    //O que Retorna - o que faz - (o que recebe)
    PautaCadastradaResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}

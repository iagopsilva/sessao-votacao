package br.com.iago.sessao_votacao.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Porta de entrada de sua aplicação
@RestController
//Endereço ou rota que o usuário ou sistema deve digitar para acessar
// os métodos daquela classe
@RequestMapping("/pauta")
public interface PautaAPI {
    //nova instância de entidade criada (código 201)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    //O que Retorna - o que faz - (o que recebe)
    PautaCadastradaResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}

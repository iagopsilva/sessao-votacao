package br.com.iago.sessao_votacao.pauta.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
//retornará o nome da classe, atributos e seus valores inputados. Por
//exemplo: NovaPautaRquest(titulo=Novo Título, descricao=Nova Descricao,
//idAssociadoAutor= 550e8400-e29b-41d4-a716-446655440000)) ao invés do
//endereço de memória.
@ToString
public class NovaPautaRequest {
    //Não é nulo + maior que zero + Não contem apenas espaços em branco
    @NotBlank
    private String titulo;
    @NotBlank
    private String descricao;
    @NotNull
    private UUID idAssociadoAutor;
}

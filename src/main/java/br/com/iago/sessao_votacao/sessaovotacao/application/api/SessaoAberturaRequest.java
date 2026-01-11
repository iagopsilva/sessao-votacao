package br.com.iago.sessao_votacao.sessaovotacao.application.api;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;
import java.util.UUID;

@Getter
@ToString
public class SessaoAberturaRequest {
    @NotNull
    private UUID idPauta;
    private Integer tempoDuracao;

    //Se a caixa estiver ocupada, você vê o objeto lá dentro.
    //Se a caixa estiver vazia, ela continua sendo uma "caixa", e não um
    // "nada" (null). Isso evita que o seu sistema quebre ao tentar abrir
    // algo que não existe
    public Optional<Integer> getTempoDuracao(){
        //Não lança o NullPointerException
        return Optional.ofNullable(this.tempoDuracao);
    }
}

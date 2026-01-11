package br.com.iago.sessao_votacao.pauta.domain;

import br.com.iago.sessao_votacao.pauta.application.api.NovaPautaRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

//Metodo público que pega o valor de uma variável privada da classe
/*Por segurança, no Java, deixamos os atributos privados e precisamos
do metodo getAtributo() para acessar esse valor*/
//Graças ao Lombok não necessário escrever o metodo na mão
@Getter
/*  na hora de debugar ou ler logs, Lombok cria um metodo
que imprime o nome da classe e o valor de cada um dos seus atributos */
@ToString
//Quer dizer que essa classe representa uma tabela no meu BD
//Cada instância desse objeto representa uma linha (registro) no meu BD
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Pauta {
    //UUID -> garante de o id seja único, string de 36 caracteres (32 hexadecimais e 4 hifens)
    //exemplo: 550e8400-e29b-41d4-a716-446655440000
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;

    public Pauta(NovaPautaRequest novaPauta) {
        this.titulo = novaPauta.getTitulo();
        this.descricao = novaPauta.getDescricao();
        this.idAssociadoAutor = novaPauta.getIdAssociadoAutor();
        this.dataCriacao = LocalDateTime.now();
    }
}

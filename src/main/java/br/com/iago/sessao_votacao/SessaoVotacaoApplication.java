package br.com.iago.sessao_votacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//Porta de entrada de sua aplicação
@RestController
//Endereço ou rota que o usuário ou sistema deve digitar para acessar os métodos daquela classe
@RequestMapping("/")
public class SessaoVotacaoApplication {

    @GetMapping
    public String testeHome(){
        return "Teste home sessao-votacao";
    }

	public static void main(String[] args) {
		SpringApplication.run(SessaoVotacaoApplication.class, args);
	}

}

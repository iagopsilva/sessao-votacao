package br.com.iago.sessao_votacao.sessaovotacao.infra;

import br.com.iago.sessao_votacao.sessaovotacao.domain.SessaoVotacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SessaoVotacaoSpringDataJPARepository extends JpaRepository<SessaoVotacao, UUID> {

}

package br.com.iago.sessao_votacao.pauta.infra;

import br.com.iago.sessao_votacao.pauta.domain.Pauta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PautaSpringDataJPARepository extends JpaRepository <Pauta, UUID> {
}

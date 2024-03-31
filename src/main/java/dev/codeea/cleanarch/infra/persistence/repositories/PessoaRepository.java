package dev.codeea.cleanarch.infra.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.codeea.cleanarch.infra.persistence.entities.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {

    PessoaEntity findByCpfCnpj(String cpjCnpj);

}

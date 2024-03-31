package dev.codeea.cleanarch.infra.mappers;

import org.springframework.stereotype.Component;

import dev.codeea.cleanarch.core.entities.Pessoa;
import dev.codeea.cleanarch.infra.persistence.entities.PessoaEntity;

@Component
public class PessoaEntityMapper {
    public PessoaEntity toEntity(Pessoa pessoa) {
        return new PessoaEntity(
                pessoa.pessoaId(),
                pessoa.nome(),
                pessoa.email(),
                pessoa.cpjCnpj(),
                pessoa.tipoPessoa());
    }

    public Pessoa toDomain(PessoaEntity pessoaEntity) {
        return new Pessoa(
                pessoaEntity.getId(),
                pessoaEntity.getNome(),
                pessoaEntity.getEmail(),
                pessoaEntity.getCpfCnpj(),
                pessoaEntity.getTipoPessoa());
    }
}

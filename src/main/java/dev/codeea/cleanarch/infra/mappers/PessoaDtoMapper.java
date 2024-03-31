package dev.codeea.cleanarch.infra.mappers;

import org.springframework.stereotype.Component;

import dev.codeea.cleanarch.core.entities.Pessoa;
import dev.codeea.cleanarch.infra.dtos.PessoaDto;

@Component
public class PessoaDtoMapper {
    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(
                pessoa.nome(),
                pessoa.email(),
                pessoa.cpjCnpj(),
                pessoa.tipoPessoa());

    }

    public Pessoa toDomain(PessoaDto pessoaDto) {
        return new Pessoa(
                null,
                pessoaDto.nome(),
                pessoaDto.email(),
                pessoaDto.cpfCnpj(),
                pessoaDto.tipoPessoa());
    }
}

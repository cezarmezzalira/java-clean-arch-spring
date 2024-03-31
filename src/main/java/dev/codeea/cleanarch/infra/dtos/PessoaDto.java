package dev.codeea.cleanarch.infra.dtos;

import dev.codeea.cleanarch.core.entities.EnumTipoPessoa;

public record PessoaDto(
        String nome,
        String email,
        String cpfCnpj,
        EnumTipoPessoa tipoPessoa) {

}

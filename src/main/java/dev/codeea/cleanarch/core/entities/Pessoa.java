package dev.codeea.cleanarch.core.entities;

public record Pessoa(
        Long pessoaId,
        String nome,
        String email,
        String cpjCnpj,
        EnumTipoPessoa tipoPessoa) {

}

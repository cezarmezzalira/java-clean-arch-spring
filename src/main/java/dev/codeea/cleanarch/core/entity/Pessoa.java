package dev.codeea.cleanarch.core.entity;

public record Pessoa(
        Long pessoaId,
        String nome,
        String cpjCnpj,
        EnumTipoPessoa tipoPessoa) {

}

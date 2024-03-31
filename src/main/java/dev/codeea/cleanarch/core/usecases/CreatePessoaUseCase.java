package dev.codeea.cleanarch.core.usecases;

import dev.codeea.cleanarch.core.entity.Pessoa;

public interface CreatePessoaUseCase {
    public Pessoa execute(Pessoa pessoa);
}

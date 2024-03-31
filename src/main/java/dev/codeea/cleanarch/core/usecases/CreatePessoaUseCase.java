package dev.codeea.cleanarch.core.usecases;

import dev.codeea.cleanarch.core.entities.Pessoa;

public interface CreatePessoaUseCase {
    public Pessoa execute(Pessoa pessoa);
}

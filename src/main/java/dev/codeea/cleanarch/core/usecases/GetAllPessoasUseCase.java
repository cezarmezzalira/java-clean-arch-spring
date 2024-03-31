package dev.codeea.cleanarch.core.usecases;

import java.util.List;

import dev.codeea.cleanarch.core.entities.Pessoa;

public interface GetAllPessoasUseCase {
    public List<Pessoa> execute();
}

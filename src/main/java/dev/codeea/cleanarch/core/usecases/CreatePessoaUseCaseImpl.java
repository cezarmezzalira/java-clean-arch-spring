package dev.codeea.cleanarch.core.usecases;

import dev.codeea.cleanarch.core.entity.Pessoa;
import dev.codeea.cleanarch.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase {
    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.createPessoa(pessoa);
    }

}

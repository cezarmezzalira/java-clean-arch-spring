package dev.codeea.cleanarch.core.usecases;

import dev.codeea.cleanarch.core.entities.Pessoa;
import dev.codeea.cleanarch.core.exceptions.BusinessException;
import dev.codeea.cleanarch.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase {
    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa pessoaExistente = pessoaGateway.findCpfCnpj(pessoa.cpjCnpj());

        if (pessoaExistente != null) {
            throw new BusinessException("Já existe uma pessoa com CPF/CNPJ cadastrado");
        }
        return pessoaGateway.createPessoa(pessoa);
    }

}

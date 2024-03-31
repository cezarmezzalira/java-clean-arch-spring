package dev.codeea.cleanarch.core.usecases;

import java.util.List;

import dev.codeea.cleanarch.core.entities.Pessoa;
import dev.codeea.cleanarch.core.gateways.PessoaGateway;

public class GetAllPessoasUseCaseImpl   implements GetAllPessoasUseCase{

    private final PessoaGateway pessoaGateway;



    public GetAllPessoasUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public List<Pessoa> execute() {
        return pessoaGateway.findAll();
    }

}

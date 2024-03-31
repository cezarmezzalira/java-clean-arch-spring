package dev.codeea.cleanarch.core.gateways;

import java.util.List;

import dev.codeea.cleanarch.core.entities.Pessoa;

public interface PessoaGateway {
    Pessoa createPessoa(Pessoa pessoa);

    Pessoa findCpfCnpj(String cpjCnpj);

    List<Pessoa> findAll();
}

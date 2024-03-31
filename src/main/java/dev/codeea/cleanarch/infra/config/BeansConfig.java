package dev.codeea.cleanarch.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.codeea.cleanarch.core.gateways.PessoaGateway;
import dev.codeea.cleanarch.core.usecases.CreatePessoaUseCase;
import dev.codeea.cleanarch.core.usecases.CreatePessoaUseCaseImpl;
import dev.codeea.cleanarch.core.usecases.GetAllPessoasUseCase;
import dev.codeea.cleanarch.core.usecases.GetAllPessoasUseCaseImpl;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }

    @Bean
    public GetAllPessoasUseCase getAllPessoasUseCase(PessoaGateway pessoaGateway) {
        return new GetAllPessoasUseCaseImpl(pessoaGateway);
    }
}

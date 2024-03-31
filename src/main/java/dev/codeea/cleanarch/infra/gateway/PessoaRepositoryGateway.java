package dev.codeea.cleanarch.infra.gateway;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import dev.codeea.cleanarch.core.entities.Pessoa;
import dev.codeea.cleanarch.core.gateways.PessoaGateway;
import dev.codeea.cleanarch.infra.mappers.PessoaEntityMapper;
import dev.codeea.cleanarch.infra.persistence.repositories.PessoaRepository;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PessoaRepositoryGateway implements PessoaGateway {
    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        var pessoaEntity = this.pessoaEntityMapper.toEntity(pessoa);
        var pessoaCreated = this.pessoaRepository.save(pessoaEntity);
        return this.pessoaEntityMapper.toDomain(pessoaCreated);
    }

    @Override
    public Pessoa findCpfCnpj(String cpjCnpj) {
        var pessoaEntity = this.pessoaRepository.findByCpfCnpj(cpjCnpj);
        if (pessoaEntity == null)
            return null;
        return this.pessoaEntityMapper.toDomain(pessoaEntity);
    }

    @Override
    public List<Pessoa> findAll() {
        var listAllPessoasEntity = this.pessoaRepository.findAll();
        var listAllPessoas = listAllPessoasEntity
                .stream()
                .map(pessoaEntityMapper::toDomain)
                .toList();
        return listAllPessoas;
    }

}

package dev.codeea.cleanarch.infra.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.codeea.cleanarch.core.usecases.CreatePessoaUseCase;
import dev.codeea.cleanarch.core.usecases.GetAllPessoasUseCase;
import dev.codeea.cleanarch.infra.dtos.PessoaDto;
import dev.codeea.cleanarch.infra.mappers.PessoaDtoMapper;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final GetAllPessoasUseCase getAllPessoasUseCase;
    private final PessoaDtoMapper pessoaMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        var pessoa = this.createPessoaUseCase.execute(pessoaMapper.toDomain(pessoaDto));
        return pessoaMapper.toDto(pessoa);
    }

    @GetMapping
    public List<PessoaDto> getPessoas() {
        var pessoas = this.getAllPessoasUseCase.execute();
        return pessoas
                .stream()
                .map(pessoaMapper::toDto)
                .collect(Collectors.toList());
    }

}

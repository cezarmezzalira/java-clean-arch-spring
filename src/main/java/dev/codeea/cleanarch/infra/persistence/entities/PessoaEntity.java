package dev.codeea.cleanarch.infra.persistence.entities;

import dev.codeea.cleanarch.core.entities.EnumTipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "pessoas")
public class PessoaEntity {

    @Id
    @GeneratedValue()
    private Long id;
    private String nome;
    private String email;
    private String cpfCnpj;
    @Enumerated(EnumType.STRING)
    private EnumTipoPessoa tipoPessoa;

}

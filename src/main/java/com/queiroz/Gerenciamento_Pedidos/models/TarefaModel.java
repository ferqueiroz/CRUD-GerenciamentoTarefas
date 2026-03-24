package com.queiroz.Gerenciamento_Pedidos.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "Tarefa")
@Table(name = "tb_tarefa")
public class TarefaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRF_ID")
    private Long id;
    @Column(name = "TRF_DESCRICAO")
    private String descricao;
    @Column(name = "TRF_DATAVENCIMENTO")
    private LocalDate dataVencimento;
    @Column(name = "TRF_CONCLUIDA")
    private Boolean conclusao;

    public TarefaModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Boolean getConclusao() {
        return conclusao;
    }

    public void setConclusao(Boolean conclusao) {
        this.conclusao = conclusao;
    }
}

package univesp.projetointegrador.Model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="exemplares")
public class Exemplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 300, nullable = false)
    private String titulo;

    @Column(length = 300)
    private String autor;

    @Column(name = "ano_edicao")
    private Integer anoEdicao;

    @Column(name = "num_paginas")
    private Integer numPaginas;

    @Column(length = 8000, nullable = false)
    private String resumo;

    @Column(length = 300)
    private String editora;

    @Column(name = "assunto_tema", length = 300, nullable = false)
    private String assuntoTema;

    @Column(length = 300)
    private String lingua;

    @Column(name = "qtd_emprestimos", nullable = false)
    private Integer qtdEmprestimos = 0;

    @Column(nullable = false)
    private Boolean emprestado = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(Integer anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAssuntoTema() {
        return assuntoTema;
    }

    public void setAssuntoTema(String assuntoTema) {
        this.assuntoTema = assuntoTema;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public Integer getQtdEmprestimos() {
        return qtdEmprestimos;
    }

    public void setQtdEmprestimos(Integer qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }

    public Boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }
}

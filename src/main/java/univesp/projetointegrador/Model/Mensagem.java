package univesp.projetointegrador.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="mensagens")
public class Mensagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("data_hora_registro")
    private Timestamp dataHoraRegistro;
    @JsonProperty("assunto")
    private String assunto;
    @JsonProperty("mensagem")
    private String mensagem;
    @JsonProperty("usuario_id")
    private int usuarioId;
    @JsonProperty("exibir")
    private boolean exibir;


    public Long id() {
        return id;
    }

    public Mensagem setId(Long id) {
        this.id = id;
        return this;
    }

    public Timestamp dataHoraRegistro() {
        return dataHoraRegistro;
    }

    public Mensagem setDataHoraRegistro(Timestamp dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    public String assunto() {
        return assunto;
    }

    public Mensagem setAssunto(String assunto) {
        this.assunto = assunto;
        return this;
    }

    public String mensagem() {
        return mensagem;
    }

    public Mensagem setMensagem(String mensagem) {
        this.mensagem = mensagem;
        return this;
    }

    public int usuarioId() {
        return usuarioId;
    }

    public Mensagem setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
        return this;
    }

    public boolean exibir() {
        return exibir;
    }

    public Mensagem setExibir(boolean exibir) {
        this.exibir = exibir;
        return this;
    }
}
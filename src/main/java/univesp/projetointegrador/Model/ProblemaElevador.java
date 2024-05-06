package univesp.projetointegrador.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name="problemas_elevadores")
public class ProblemaElevador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("usuario_id")
    private int usuarioId;
    @JsonProperty("data_hora_registro")
    private Timestamp dataHoraRegistro;
    @JsonProperty("bloco")
    private String bloco;
    @JsonProperty("andar")
    private int andar;
    @JsonProperty("tipo_elevador")
    private String tipoElevador;
    @JsonProperty("descricao_problema")
    private String descricaoProblema;
    @JsonProperty("problema_solucionado")
    private boolean problemaSolucionado;
    @JsonProperty("exibir")
    private boolean exibir;

    public Long id() {
        return id;
    }

    public ProblemaElevador setId(Long id) {
        this.id = id;
        return this;
    }


    public int usuarioId() {
        return usuarioId;
    }

    public ProblemaElevador setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
        return this;
    }

    public Timestamp dataHoraRegistro() {
        return dataHoraRegistro;
    }

    public ProblemaElevador setDataHoraRegistro(Timestamp dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    public String bloco() {
        return bloco;
    }

    public ProblemaElevador setBloco(String bloco) {
        this.bloco = bloco;
        return this;
    }

    public int andar() {
        return andar;
    }

    public ProblemaElevador setAndar(int andar) {
        this.andar = andar;
        return this;
    }

    public String tipoElevador() {
        return tipoElevador;
    }

    public ProblemaElevador setTipoElevador(String tipoElevador) {
        this.tipoElevador = tipoElevador;
        return this;
    }

    public String descricaoProblema() {
        return descricaoProblema;
    }

    public ProblemaElevador setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
        return this;
    }

    public boolean problemaSolucionado() {
        return problemaSolucionado;
    }

    public ProblemaElevador setProblemaSolucionado(boolean problemaSolucionado) {
        this.problemaSolucionado = problemaSolucionado;
        return this;
    }

    public boolean exibir() {
        return exibir;
    }

    public ProblemaElevador setExibir(boolean exibir) {
        this.exibir = exibir;
        return this;
    }
}

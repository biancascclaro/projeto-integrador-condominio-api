package univesp.projetointegrador.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="anuncios")
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("data_hora_registro")
    private Timestamp dataHoraRegistro;
    @JsonProperty("nome_empresa")
    private String nomeEmpresa;
    @JsonProperty("categoria_id")
    private int categoriaId;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("site")
    private String site;
    @JsonProperty("redes_sociais")
    private String redesSociais;
    @JsonProperty("descricao")
    private String descricao;
    @JsonProperty("avaliacao_usuario")
    private int avaliacaoUsuario;
    @JsonProperty("usuario_id")
    private int usuarioId;


    public Long id() {
        return id;
    }

    public Anuncio setId(Long id) {
        this.id = id;
        return this;
    }

    public Timestamp dataHoraRegistro() {
        return dataHoraRegistro;
    }

    public Anuncio setDataHoraRegistro(Timestamp dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    public String nomeEmpresa() {
        return nomeEmpresa;
    }

    public Anuncio setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        return this;
    }

    public int categoriaId() {
        return categoriaId;
    }

    public Anuncio setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
        return this;
    }

    public String telefone() {
        return telefone;
    }

    public Anuncio setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String email() {
        return email;
    }

    public Anuncio setEmail(String email) {
        this.email = email;
        return this;
    }

    public String site() {
        return site;
    }

    public Anuncio setSite(String site) {
        this.site = site;
        return this;
    }

    public String redesSociais() {
        return redesSociais;
    }

    public Anuncio setRedesSociais(String redesSociais) {
        this.redesSociais = redesSociais;
        return this;
    }

    public String descricao() {
        return descricao;
    }

    public Anuncio setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public int avaliacaoUsuario() {
        return avaliacaoUsuario;
    }

    public Anuncio setAvaliacaoId(int avaliacaoUsuario) {
        this.avaliacaoUsuario = avaliacaoUsuario;
        return this;
    }

    public int usuarioId() {
        return usuarioId;
    }

    public Anuncio setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
        return this;
    }
}
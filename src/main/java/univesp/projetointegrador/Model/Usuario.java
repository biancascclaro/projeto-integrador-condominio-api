package univesp.projetointegrador.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;
    @JsonProperty("data_hora_registro")
    private Timestamp dataHoraRegistro;
    @JsonProperty("CPF")
    private String CPF;
    @JsonProperty("nome_usuario")
    private String nomeUsuario;
    @JsonProperty("bloco")
    private String bloco;
    @JsonProperty("apto")
    private String apto;
    @JsonProperty("telefone")
    private String telefone;
    @JsonProperty("email")
    private String email;
    @JsonProperty("perfil")
    private String perfil;
    @JsonProperty("status_usuario")
    private boolean statusUsuario;
    @JsonProperty("senha")
    private String senha;

    public int id() {
        return id;
    }

    public Usuario setId(int id) {
        this.id = id;
        return this;
    }

    public Timestamp dataHoraRegistro() {
        return dataHoraRegistro;
    }

    public Usuario setDataHoraRegistro(Timestamp dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
        return this;
    }

    public String cpf() {
        return CPF;
    }

    public Usuario setCPF(String CPF) {
        this.CPF = CPF;
        return this;
    }

    public String nomeUsuario() {
        return nomeUsuario;
    }

    public Usuario setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        return this;
    }

    public String bloco() {
        return bloco;
    }

    public Usuario setBloco(String bloco) {
        this.bloco = bloco;
        return this;
    }

    public String apto() {
        return apto;
    }

    public Usuario setApto(String apto) {
        this.apto = apto;
        return this;
    }

    public String telefone() {
        return telefone;
    }

    public Usuario setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public String email() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
    }

    public String perfil() {
        return perfil;
    }

    public Usuario setPerfil(String perfil) {
        this.perfil = perfil;
        return this;
    }

    public boolean statusUsuario() {
        return statusUsuario;
    }

    public Usuario setStatusUsuario(boolean statusUsuario) {
        this.statusUsuario = statusUsuario;
        return this;
    }

    public String senha() {
        return senha;
    }

    public Usuario setSenha(String senha) {
        this.senha = senha;
        return this;
    }
}

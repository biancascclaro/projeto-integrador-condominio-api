package univesp.projetointegrador.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="avaliacao")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;
    @JsonProperty("avaliacao")
    private String avaliacao;

    public Long id() {
        return id;
    }

    public Avaliacao setId(Long id) {
        this.id = id;
        return this;
    }
    public String avaliacao() {
        return avaliacao;
    }

    public Avaliacao setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
        return this;
    }
}
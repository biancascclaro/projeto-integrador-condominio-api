package univesp.projetointegrador.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import univesp.projetointegrador.Model.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
}

package br.com.etec.vinicius.cursoApi.repository;

;
import br.com.etec.vinicius.cursoApi.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}

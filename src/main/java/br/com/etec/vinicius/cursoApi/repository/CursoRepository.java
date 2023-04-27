package br.com.etec.vinicius.cursoApi.repository;

import br.com.etec.vinicius.cursoApi.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}

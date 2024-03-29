package br.com.etec.vinicius.cursoApi.repository;

import br.com.etec.vinicius.cursoApi.model.Aluno;
import br.com.etec.vinicius.cursoApi.repository.aluno.AlunoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>, AlunoRepositoryQuery {
}

package br.com.etec.vinicius.cursoApi.repository.curso;

import br.com.etec.vinicius.cursoApi.model.Curso;
import br.com.etec.vinicius.cursoApi.repository.filter.CursoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CursoReposirotyImpl implements CursoRepositoryQuery{
    @Override
    public Page<Curso> filtrar(CursoFilter cursoFilter, Pageable pageable) {
        return null;
    }
}

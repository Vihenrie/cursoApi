package br.com.etec.vinicius.cursoApi.repository.aluno;

import br.com.etec.vinicius.cursoApi.repository.filter.AlunoFilter;
import br.com.etec.vinicius.cursoApi.repository.projections.AlunoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AlunoRepositoryQuery {
    public Page<AlunoDTO> filtrar(AlunoFilter alunoFilter, Pageable pageable);
}

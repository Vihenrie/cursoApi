package br.com.etec.vinicius.cursoApi.repository.cidade;

import br.com.etec.vinicius.cursoApi.model.Cidade;
import br.com.etec.vinicius.cursoApi.repository.filter.CidadeFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CidadeRepositoryQuery {

    public Page<Cidade> Filtrar(CidadeFilter cidadeFilter, Pageable pageable);

}

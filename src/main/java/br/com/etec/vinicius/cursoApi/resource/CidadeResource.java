package br.com.etec.vinicius.cursoApi.resource;

import br.com.etec.vinicius.cursoApi.model.Cidade;
import br.com.etec.vinicius.cursoApi.repository.CidadeRepository;
import br.com.etec.vinicius.cursoApi.repository.filter.CidadeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

    @Autowired
    CidadeRepository cidadeRepository;

    @GetMapping()
    public Page<Cidade> pesquisar(CidadeFilter cidadeFilter, Pageable pageable) {
        return cidadeRepository.Filtrar(cidadeFilter, pageable);
    }

    @RequestMapping("/todos")
    public List<Cidade> ListarTodasCidades() {
        return cidadeRepository.findAll();
    }
}

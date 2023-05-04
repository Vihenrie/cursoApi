package br.com.etec.vinicius.cursoApi.resource;

import br.com.etec.vinicius.cursoApi.model.Cidade;
import br.com.etec.vinicius.cursoApi.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
public class CidadeResource {

    @Autowired
    private CidadeRepository cidadeRepository;

    @RequestMapping("/todos")
    public List<Cidade> ListarTodasCidades() {
        return cidadeRepository.findAll();
    }
}

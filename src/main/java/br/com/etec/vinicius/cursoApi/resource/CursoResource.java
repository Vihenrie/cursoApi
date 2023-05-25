package br.com.etec.vinicius.cursoApi.resource;

import br.com.etec.vinicius.cursoApi.model.Curso;
import br.com.etec.vinicius.cursoApi.repository.CursoRepository;
import br.com.etec.vinicius.cursoApi.repository.filter.CursoFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoResource {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping()
    public Page<Curso> pesquisar(CursoFilter cursoFilter, Pageable pageable) {
        return cursoRepository.Filtrar(cursoFilter, pageable);
    }


    @RequestMapping("/todos")
    public List<Curso> ListarTodosCursos() {
        return cursoRepository.findAll();
    }
}

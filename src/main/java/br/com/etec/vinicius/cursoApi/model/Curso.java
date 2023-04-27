package br.com.etec.vinicius.cursoApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idCurso;
    private String nomecurso;

    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<Aluno> alunocurso = new ArrayList<>();

    public Integer getId() {
        return idCurso;
    }

    public void setId(Integer id) {
        this.idCurso = idCurso;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public List<Aluno> getAlunocurso() {
        return alunocurso;
    }

    public void setAlunocurso(List<Aluno> alunocurso) {
        this.alunocurso = alunocurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return idCurso.equals(curso.idCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }
}

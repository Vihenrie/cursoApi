package br.com.etec.vinicius.cursoApi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCidade;
    private String nomecidade;
    private String uf;

    @OneToMany(mappedBy = "cidade")
    @JsonIgnore
    private List<Aluno> alunoscidade = new ArrayList<>();

    public List<Aluno> getAlunoscidade() {
        return alunoscidade;
    }

    public void setAlunoscidade(List<Aluno> alunoscidade) {
        this.alunoscidade = alunoscidade;
    }

    public int getId() {
        return idCidade;
    }

    public void setId(int id) {
        this.idCidade = idCidade;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return idCidade == cidade.idCidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCidade);
    }
}

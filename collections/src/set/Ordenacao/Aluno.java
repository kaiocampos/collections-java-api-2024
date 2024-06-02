package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    //Atributo
    private String nome;
    private long matrícula;
    private Double media;

    public Aluno(String nome, long matrícula, Double media) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatrícula() {
        return matrícula;
    }

    public Double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matrícula=" + matrícula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matrícula == aluno.matrícula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matrícula);
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }
}

class ComparatorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro la : livroList){
                if (la.getAnoPublicacao() >= anoInicial && la.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(la);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro lt : livroList){
                if (lt.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = lt;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("titulo1","kaio",1987);
        catalogoLivros.adicionarLivros("titulo2","samara",1989);
        catalogoLivros.adicionarLivros("titulo3","miguel",2013);
        catalogoLivros.adicionarLivros("titulo1","kaio",1989);
        catalogoLivros.adicionarLivros("titulo1","kaio",2013);

        System.out.println(catalogoLivros.pesquisarPorAutor("kaio"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo1"));


    }

}


































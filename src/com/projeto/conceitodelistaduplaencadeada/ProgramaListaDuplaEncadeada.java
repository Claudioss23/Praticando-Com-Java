package com.projeto.conceitodelistaduplaencadeada;

public class ProgramaListaDuplaEncadeada {
    public static void main(String[] args) {

        ListaDuplaEncadeada<String> minhaListaDuplaEncadeada = new ListaDuplaEncadeada<>();

        minhaListaDuplaEncadeada.add("c1");
        minhaListaDuplaEncadeada.add("c2");
        minhaListaDuplaEncadeada.add("c3");
        minhaListaDuplaEncadeada.add("c4");
        minhaListaDuplaEncadeada.add("c5");
        minhaListaDuplaEncadeada.add("c6");
        minhaListaDuplaEncadeada.add("c7");

        System.out.println(minhaListaDuplaEncadeada);
        System.out.println(minhaListaDuplaEncadeada.size());

        minhaListaDuplaEncadeada.remove(3);

        System.out.println(minhaListaDuplaEncadeada);
        System.out.println(minhaListaDuplaEncadeada.size());

        minhaListaDuplaEncadeada.add(3,"99");

        System.out.println(minhaListaDuplaEncadeada);
        System.out.println(minhaListaDuplaEncadeada.size());
    }
}

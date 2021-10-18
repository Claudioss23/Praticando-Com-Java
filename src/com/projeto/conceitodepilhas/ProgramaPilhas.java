package com.projeto.conceitodepilhas;

public class ProgramaPilhas {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new Nopilha(1));
        minhaPilha.push(new Nopilha(2));
        minhaPilha.push(new Nopilha(3));
        minhaPilha.push(new Nopilha(4));
        minhaPilha.push(new Nopilha(5));
        minhaPilha.push(new Nopilha(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop() + "\n");

        System.out.println(minhaPilha);

        minhaPilha.push(new Nopilha(99));
        System.out.println(minhaPilha);
    }
}

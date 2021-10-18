package com.projeto.conceitodepilhas;

public class Nopilha {

    private int dado;
    private Nopilha refNo = null;

    public Nopilha() {
    }

    public Nopilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Nopilha getRefNo() {
        return refNo;
    }

    public void setRefNo(Nopilha reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "Nopilha{" +
                "dado=" + dado +
                '}';
    }
}

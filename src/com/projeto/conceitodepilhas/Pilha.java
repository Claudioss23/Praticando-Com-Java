package com.projeto.conceitodepilhas;

public class Pilha {

    private Nopilha refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(Nopilha novoNo){
        Nopilha refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public Nopilha pop(){
        if (!isEmpty()){
            Nopilha noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;
        }
        return null;
    }

    public Nopilha top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

        return refNoEntradaPilha == null;
    }

    @Override
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-------------\n";

        Nopilha noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}

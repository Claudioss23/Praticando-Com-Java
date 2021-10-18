package com.projeto.conceitodefilas;

public class Nofila<T> {

    private T object;
    private Nofila<T> refNo;

    public Nofila() {
    }

    public Nofila(T object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Nofila<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(Nofila<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Nofila{" +
                "object=" + object +
                '}';
    }
}

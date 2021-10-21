package estruturadedados.conceitodefilas;

public class Fila<T> {

    private Nofila<T> refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        Nofila novoNo = new Nofila(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if (!isEmpty()){
            Nofila primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if (!isEmpty()){
            Nofila primeiroNo = refNoEntradaFila;
            Nofila noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Nofila noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true) {
                stringRetorno += "[No{objeto= " + noAuxiliar.getObject() + "}]\n";

                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}

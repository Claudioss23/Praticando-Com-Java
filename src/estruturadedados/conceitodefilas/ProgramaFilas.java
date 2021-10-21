package estruturadedados.conceitodefilas;

public class ProgramaFilas {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila + "\n");

        System.out.println(minhaFila.dequeue() + "\n");

        System.out.println(minhaFila + "\n");

        minhaFila.enqueue("Último");

        System.out.println(minhaFila + "\n");

        System.out.println(minhaFila.first() + "\n");
    }
}

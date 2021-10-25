package estruturadedados.conceitodequeues;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramaCarroQueue {
    public static void main(String[] args) {

        Queue<CarroQueue> queueCarros = new LinkedList<>();

        queueCarros.add(new CarroQueue("Ford"));
        queueCarros.add(new CarroQueue("Chevrolet"));
        queueCarros.add(new CarroQueue("Fiat"));

        System.out.println(queueCarros.add(new CarroQueue("Peugeot")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.offer(new CarroQueue("Renault")));
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());
    }
}

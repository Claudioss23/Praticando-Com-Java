package estruturadedados.conceitodestacks;

import java.util.Stack;

public class ProgramaCarroStack {
    public static void main(String[] args) {

        Stack<CarroStack> stackCarros = new Stack<>();

        stackCarros.push(new CarroStack("Ford"));
        stackCarros.push(new CarroStack("Chevrolet"));
        stackCarros.push(new CarroStack("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());
    }
}

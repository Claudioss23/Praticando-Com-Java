package estruturadedados.conceitodestacks;

import java.util.Stack;

public class ProgramaCarroStackExercicio {
    public static void main(String[] args) {

        Stack<CarroStack> stackCarros = new Stack<>();

        for(int i = 1; i <= 30; i++) {
            stackCarros.push(new CarroStack("Ford " + i));
        }

        System.out.println(stackCarros);
    }
}

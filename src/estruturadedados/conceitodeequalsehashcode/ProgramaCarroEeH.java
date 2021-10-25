package estruturadedados.conceitodeequalsehashcode;

import java.util.ArrayList;
import java.util.List;

public class ProgramaCarroEeH {
    public static void main(String[] args) {

        List<CarroEeH> listaCarrosEeH = new ArrayList<>();

        listaCarrosEeH.add(new CarroEeH("Ford"));
        listaCarrosEeH.add(new CarroEeH("Chevrolet"));
        listaCarrosEeH.add(new CarroEeH("Volkswagen"));

        System.out.println(listaCarrosEeH.contains(new CarroEeH("Ford")));
        System.out.println(new CarroEeH("Ford").hashCode());
        System.out.println(new CarroEeH("Ford1").hashCode());

        CarroEeH carroEeH1 = new CarroEeH("Ford");
        CarroEeH carroEeH2 = new CarroEeH("Chevrolet");

        System.out.println(carroEeH1.equals(carroEeH2));
    }
}

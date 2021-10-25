package estruturadedados.conceitodesets;

import java.util.Objects;

public class CarroSet implements Comparable<CarroSet> {

    String marca;

    public CarroSet(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarroSet carroEeH = (CarroSet) o;
        return Objects.equals(marca, carroEeH.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(CarroSet o) {
//        if(this.marca.length() < o.marca.length()) {
//            return -1;
//        }else if(this.marca.length() > o.marca.length()) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(CarroSet o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}

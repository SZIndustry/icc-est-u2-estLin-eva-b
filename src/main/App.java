package main;

import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<String> cola = new Queue<>();

        cola.add("Maria");
        cola.add("Juan");
        cola.add("Roberto");

        LogicaClasificacion invertir = new LogicaClasificacion();
        invertir.invertirColaNombres(cola);

        LogicaClasificacion numeros = new LogicaClasificacion();
        Queue<Integer> cola1 = new Queue<Integer>();
        Queue<Integer> cola2 = new Queue<Integer>();
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);
        cola2.add(2);
        cola2.add(4);
        cola2.add(6);
        cola2.add(8);
        numeros.intercalarColas(cola1, cola2);

    }
}

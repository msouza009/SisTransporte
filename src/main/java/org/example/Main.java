package org.example;

import java.io.CharArrayReader;

public class Main {
    public static void main(String[] args) {

        Transporte bicicleta = new Bicicleta();
        Transporte carro = new Carro();


        executarCalculo(bicicleta, 12.5 );
        executarCalculo(carro, 89.3 );
    }

    public static void executarCalculo(Transporte t, double distancia){
        t.calcularTrajeto(distancia);
    }


}
package org.example;

import java.io.CharArrayReader;

public class Main {
    public static void main(String[] args) {

        Transporte bicicleta = new Bicicleta();
        Transporte carro = new Carro();
        Transporte foguete = new Foguete();


        executarCalculo(bicicleta, 12.5 );
        executarCalculo(carro, 89.3 );
        executarCalculo(foguete, 100);
    }

    public static void executarCalculo(Transporte t, double distancia){
        t.calcularTrajeto(distancia);
    }


}
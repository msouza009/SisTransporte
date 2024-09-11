package org.example;

public class Foguete implements Transporte{

    @Override
    public void calcularTrajeto(double distancia) {
        double tempo = distancia * 0.01;
        System.out.println("O tempo gasto de foguete é = " + tempo);
    }
}

package org.example;

public class Bicicleta implements Transporte{

    private int rodas;
    private String marca;
    private int marchas;

    @Override
    public void calcularTrajeto(double distancia) {
        double tempo = distancia * 1.25;
        System.out.println("O tempo gasto de bike = " + tempo);
    }
}

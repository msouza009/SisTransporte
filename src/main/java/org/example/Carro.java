package org.example;

public class Carro implements Transporte{
    private int potencia;
    private String modelo;
    private String ano;

    @Override
    public void calcularTrajeto(double distancia) {
        double tempo = distancia * 0.47;
        System.out.println("O tempo gasto de carro é = " + tempo);
    }
}

package com.mateopa;

/**
 * Esta clase crea un círculo con un radio.
 */
public class Circulo {
    /**
     * Esto es la coordenada x del círculo.
     */
    private int x;
    /**
     * Esto es la coordenada y del círculo.
     */
    private int y;
    /**
     * Esto es el radio del círculo.
     */
    private double radio;

    /**
     * Esto crea un círculo con las coordenadas y el radio.
     * @param valorX esto es la coordenada x del círculo
     * @param valorY esto es la coordenada y del círculo
     * @param valorRadio esto es el radio del círculo
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Esto establece la coordenada x del círculo.
     * @param valorX esto es la coordenada x del círculo
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Esto devuelve la coordenada x del círculo.
     * @return esto es la coordenada x del círculo
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Esto establece la coordenada y del círculo.
     * @param valorY esto es la coordenada y del círculo
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Esto devuelve la coordenada y del círculo.
     * @return esto es la coordenada y del círculo
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Esto establece el radio del círculo.
     * @param valorRadio esto es el radio del círculo
     */
    public void establecerRadio(double valorRadio) {
        radio = (valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Esto devuelve el radio del círculo.
     * @return esto es el radio del círculo
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Esto devuelve el diámetro del círculo.
     * @return esto es el diámetro del círculo
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Esto devuelve la circunferencia del círculo.
     * @return esto es la circunferencia del círculo
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Esto devuelve el área del círculo.
     * @return esto es el área del círculo
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    /**
     * Esto devuelve la posicion x e y del circulo y su radio.
     * @return esto es la posicion x e y del circulo y su radio.
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
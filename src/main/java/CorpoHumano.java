package main.java;
import java.util.Scanner;
 
public class CorpoHumano {
 
    private double massa;
    private double volume;
    private double densidade;
    private double altura;
    public CorpoHumano(double massa, double volume, double altura, double densidade) {
        this.massa = massa;
        this.volume = volume;
        this.altura = altura;
        this.densidade = densidade;
    }
    public double getAltura() {
        return altura;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public double getMassa() {
        return massa;
    }
 
    public void setMassa(double massa) {
        this.massa = massa;
    }
 
    public double getVolume() {
        return volume;
    }
 
    public void setVolume(double volume) {
        this.volume = volume;
    }
 
    public double getDensidade() {
        return densidade;
    }
 
    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }
 
    public double calcularIMC() {
        return massa / (altura * altura);
    }
}
//1 O atributo massa é privado, portanto não pode ser acessado diretamente fora da classe.

//2 Agora o código compila e executa normalmente. O atributo massa se tornou público, então pode ser acessado fora da classe.

//3 O código não compila se houver alguma chamada externa a esse método. O método se tornou privado, portanto só pode ser usado dentro da própria classe, impedindo o uso do setter.

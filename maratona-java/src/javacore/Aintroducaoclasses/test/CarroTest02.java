package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Chevrolet Cruze";
        carro.modelo = "Cruze LTZ";
        carro.ano = 2012;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);
    }
}

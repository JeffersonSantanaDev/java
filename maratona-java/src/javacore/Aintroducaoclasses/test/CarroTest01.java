package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevrolet Cruze";
        carro1.modelo = "TURBO LTZ";
        carro1.ano = 2017;

        carro2.nome = "Fusca Bala";
        carro2.modelo = "Sport";
        carro2.ano = 1969;

        carro2 = carro1;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2:"); // \n pula uma linha
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
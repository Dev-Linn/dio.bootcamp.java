package application;

import entities.ParametrosInvalidosException;
import entities.Validador;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parametro 1: ");
        int parametroUm = sc.nextInt();
        System.out.print("parametro2");
        int parametroDois = sc.nextInt();


        try {
            Validador.validarParametros(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }



    sc.close();
    }
}

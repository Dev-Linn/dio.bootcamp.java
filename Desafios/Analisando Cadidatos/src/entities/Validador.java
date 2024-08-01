package entities;

import entities.ParametrosInvalidosException;

public class Validador {

    public static void validarParametros(int parametroUm, int parametroDois) {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O parâmetro 'parametroUm' não pode ser maior que 'parametroDois'.");
        }
    }
}

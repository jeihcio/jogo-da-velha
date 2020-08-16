/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.jogo.da.velha.controller.motor;

import github.jogo.da.velha.model.pecas;

/**
 *
 * @author Jeihcio
 */
public class utils {

    public static boolean verificarCasas(pecas[] casas, int[] posicoes) {
        boolean isIguais = (casas[posicoes[0]] == casas[posicoes[1]])
                && (casas[posicoes[1]] == casas[posicoes[2]]);

        boolean isNulas = (casas[posicoes[0]] == null);

        return (isIguais && !isNulas);
    }
}

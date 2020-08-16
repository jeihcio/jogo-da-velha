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
class colunas {

    private boolean verificarCasas(pecas[] casas, int[] posicoes) {
        boolean isIguais = (casas[posicoes[0]] == casas[posicoes[1]])
                && (casas[posicoes[1]] == casas[posicoes[2]]);

        boolean isNulas = (casas[posicoes[0]] == null);
        
        return (isIguais && !isNulas);
    }

    private boolean primeiraColuna(pecas[] casas) {
        return verificarCasas(casas, new int[]{
            0, 3, 6
        });
    }

    private boolean segundaColuna(pecas[] casas) {
        return verificarCasas(casas, new int[]{
            1, 4, 7
        });
    }

    private boolean terceiraColuna(pecas[] casas) {
        return verificarCasas(casas, new int[]{
            2, 5, 8
        });
    }

    public boolean isVencedor(pecas[] casas) {
        return (primeiraColuna(casas) || segundaColuna(casas) || terceiraColuna(casas));
    }

}

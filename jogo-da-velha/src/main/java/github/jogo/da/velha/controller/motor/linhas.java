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
public class linhas {

    private int[] casasVencedoras;

    private void setPecasVencedoras(int peca1, int peca2, int peca3) {
        casasVencedoras = new int[3];
        casasVencedoras[0] = peca1;
        casasVencedoras[1] = peca2;
        casasVencedoras[2] = peca3;
    }

    private boolean primeiraLinha(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            0, 1, 2
        })) {
            setPecasVencedoras(0, 1, 2);
            return true;
        }

        return false;
    }

    private boolean segundaLinha(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            3, 4, 5
        })) {
            setPecasVencedoras(3, 4, 5);
            return true;
        }

        return false;
    }

    private boolean terceiraLinha(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            6, 7, 8
        })) {
            setPecasVencedoras(6, 7, 8);
            return true;
        }

        return false;
    }

    public int[] getCasasVencedoras() {
        return casasVencedoras;
    }

    public boolean isVencedor(pecas[] casas) {
        casasVencedoras = new int[0];
        return (primeiraLinha(casas) || segundaLinha(casas) || terceiraLinha(casas));
    }
}

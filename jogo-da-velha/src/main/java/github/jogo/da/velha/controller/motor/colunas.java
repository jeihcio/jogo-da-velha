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
public class colunas {

    private int[] casasVencedoras;

    private void setPecasVencedoras(int peca1, int peca2, int peca3) {
        casasVencedoras = new int[3];
        casasVencedoras[0] = peca1;
        casasVencedoras[1] = peca2;
        casasVencedoras[2] = peca3;
    }

    private boolean primeiraColuna(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            0, 3, 6
        })) {
            setPecasVencedoras(0, 3, 6);
            return true;
        }

        return false;
    }

    private boolean segundaColuna(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            1, 4, 7
        })) {
            setPecasVencedoras(1, 4, 7);
            return true;
        }

        return false;
    }

    private boolean terceiraColuna(pecas[] casas) {
        if (utils.verificarCasas(casas, new int[]{
            2, 5, 8
        })) {
            setPecasVencedoras(2, 5, 8);
            return true;
        }

        return false;
    }

    public int[] getCasasVencedoras() {
        return casasVencedoras;
    }

    public boolean isVencedor(pecas[] casas) {
        casasVencedoras = new int[0];
        return (primeiraColuna(casas) || segundaColuna(casas) || terceiraColuna(casas));
    }

}

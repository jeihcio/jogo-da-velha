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
public class motor {

    private colunas colunas;
    private linhas linhas;
    private diagonal diagonal;
    private int[] casasVencedoras = new int[3];

    public motor() {
        colunas = new colunas();
        linhas = new linhas();
        diagonal = new diagonal();
    }

    public int[] getCasasVencedoras() {
        casasVencedoras = null;

        if (linhas.getCasasVencedoras().length > 0) {
            casasVencedoras = linhas.getCasasVencedoras();

        } else if (colunas.getCasasVencedoras().length > 0) {
            casasVencedoras = colunas.getCasasVencedoras();

        } else if (diagonal.getCasasVencedoras().length > 0) {
            casasVencedoras = diagonal.getCasasVencedoras();

        }

        return casasVencedoras;
    }

    public boolean isVencedor(pecas[] casas) {
        return (linhas.isVencedor(casas)
                || colunas.isVencedor(casas)
                || diagonal.isVencedor(casas));
    }

}

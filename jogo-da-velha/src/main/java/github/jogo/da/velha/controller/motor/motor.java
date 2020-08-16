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

    public motor() {
        colunas = new colunas();
        linhas = new linhas();
        diagonal = new diagonal();
    }

    public boolean isVencedor(pecas[] casas) {
        return (linhas.isVencedor(casas)
                || colunas.isVencedor(casas)
                || diagonal.isVencedor(casas));
    }

}

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
public class diagonal {

    private boolean primeiraDiagonal(pecas[] casas) {
        return utils.verificarCasas(casas, new int[]{
            0, 4, 8
        });
    }

    private boolean segundaDiagonal(pecas[] casas) {
        return utils.verificarCasas(casas, new int[]{
            2, 4, 6
        });
    }

    public boolean isVencedor(pecas[] casas) {
        return (primeiraDiagonal(casas) || segundaDiagonal(casas));
    }
}

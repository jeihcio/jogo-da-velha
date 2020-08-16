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

    private boolean primeiraLinha(pecas[] casas) {
        return utils.verificarCasas(casas, new int[]{
            0, 1, 2
        });
    }

    private boolean segundaLinha(pecas[] casas) {
        return utils.verificarCasas(casas, new int[]{
            3, 4, 5
        });
    }

    private boolean terceiraLinha(pecas[] casas) {
        return utils.verificarCasas(casas, new int[]{
            6, 7, 8
        });
    }

    public boolean isVencedor(pecas[] casas) {
        return (primeiraLinha(casas) || segundaLinha(casas) || terceiraLinha(casas));
    }
}

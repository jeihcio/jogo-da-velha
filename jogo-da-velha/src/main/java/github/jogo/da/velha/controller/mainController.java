/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.jogo.da.velha.controller;

import github.jogo.da.velha.controller.motor.motor;
import github.jogo.da.velha.model.pecas;
import javax.swing.JButton;

/**
 *
 * @author Jeihcio
 */
public class mainController {
    
    private pecas[] casas;
    private pecas pecaAtual;
    private pecas vencedor;
    private boolean isFimJogo;
    private motor motor;

    public mainController() {
        motor = new motor();
        pecaAtual = pecas.X;
        casas = new pecas[9];
        vencedor = null;
        isFimJogo = false;
    }

    private String PegarEAlterarPecaAtual() {
        if (pecaAtual == pecas.X) {
            pecaAtual = pecas.O;
            return "X";
        } else {
            pecaAtual = pecas.X;
        }
        return "O";
    }

    private void setPecaNaCasa(String nomeBotao) {
        int indiceCasa = Integer.parseInt(nomeBotao);
        casas[indiceCasa] = pecaAtual;
    }

    private boolean isTodasCasasPreenchidas() {
        for (int i = 0; i < casas.length; i++) {
            if (casas[i] == null) {
                return false;
            }
        }

        return true;
    }

    public void setPecaBotao(JButton botao, String numeracaoBotao) {
        setPecaNaCasa(numeracaoBotao);
        botao.setText(PegarEAlterarPecaAtual());
    }

    public boolean isVencedor() {
        return motor.isVencedor(casas);
    }

    public boolean isFimJogo() {

        if (isVencedor()) {
            return true;
        }

        if (isTodasCasasPreenchidas()) {
            return true;
        }

        return false;
    }
}

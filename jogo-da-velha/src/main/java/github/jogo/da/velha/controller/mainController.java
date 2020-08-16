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
    private motor motor;

    public mainController() {
        motor = new motor();
        limparJogo();
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

    private boolean isVencedor() {
        return motor.isVencedor(casas);
    }

    public void setPecaBotao(JButton botao, String numeracaoBotao) {
        setPecaNaCasa(numeracaoBotao);
        botao.setText(PegarEAlterarPecaAtual());
    }

    public void limparJogo() {
        pecaAtual = pecas.X;
        casas = new pecas[9];
        vencedor = null;
    }

    public int[] getCasasVencedoras() {
        return motor.getCasasVencedoras();
    }

    public String getTextVencedor() {
        if (motor.getCasasVencedoras() == null) {
            return "Jogo empatado!";
        } else {
            pecas pecaVencedora = casas[motor.getCasasVencedoras()[0]];
            return String.format("O %s venceu!", String.valueOf(pecaVencedora));
        }
    }

    public boolean isFimJogo() {

        if (isVencedor() || isTodasCasasPreenchidas()) {
            return true;
        }

        return false;
    }
}

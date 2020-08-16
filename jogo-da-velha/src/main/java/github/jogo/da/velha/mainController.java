/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github.jogo.da.velha;

/**
 *
 * @author Jeihcio
 */
public class mainController {

    private enum pecas {
        X, O
    };

    private pecas[] casas;
    private pecas pecaAtual;
    private pecas vencedor;

    public mainController() {
        pecaAtual = pecas.X;
        casas = new pecas[9];
        vencedor = null;
    }

    public String PegarEAlterarPecaAtual() {
        if (pecaAtual == pecas.X) {
            pecaAtual = pecas.O;
            return "X";
        } else {
            pecaAtual = pecas.X;
        }
        return "O";
    }

    public void setPecaNaCasa(String nomeBotao) {
        int indiceCasa = Integer.parseInt(nomeBotao);
        casas[indiceCasa] = pecaAtual;
    }

    private boolean isTodasCasasPreenchidas() {
        for (int i = 0; i < casas.length; i++) {
            if (casas[i].equals(null)) {
                return false;
            }
        }

        return true;
    }

    public boolean isFimJogo() {
        if (isTodasCasasPreenchidas()) {
            return true;
        }

        return false;
    }
}

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

    public mainController() {
        pecaAtual = pecas.X;
        casas = new pecas[9];
    }

    public String getPecaAtual() {
        if (pecaAtual == pecas.X) {
            pecaAtual = pecas.O;
            return "X";
        } else {
            pecaAtual = pecas.X;
        }
        return "O";
    }
}

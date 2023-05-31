package logic;

import logic.PairsLogic.Symbol;

public class FakeGUI implements GUIConnector {

    @Override
    public void showCard(int[] pos, Symbol symbol) {
    }

    @Override
    public void hideCard(int[] pos) {
    }

    @Override
    public void setCurrentPlayer(String name) {
    }

    @Override
    public void onGameEnd(String winnerName) {
    }


}

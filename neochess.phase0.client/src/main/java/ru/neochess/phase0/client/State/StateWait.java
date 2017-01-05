package ru.neochess.phase0.client.State;

import ru.neochess.phase0.client.ChessBoard;

/**
 * Created by TiJi on 03.12.16.
 */
public class StateWait extends State  implements ClientState {

    @Override
    public void sendMove(String line) {

    }

    @Override
    public void receiveMove(ChessBoard chessboard, String line) {
        chessboard.decodeBoard(line);
        chessboard.repaint();
        wrapper.setCurrent(new StateMove());
    }

    @Override
    public void receiveState() {

    }

    @Override
    public void sendState() {

    }

    @Override
    public void recieveColor( char color) {

    }

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * ParitialSolution provides at least the functionality which is required
 * for the use in searching for solutions of the game in a search tree.
 * It can store a game situation (Board) and a sequence of mooves.
 */
public class PartialSolution {
    /* TODO */
    /* Add object variables, constructors, methods as required and desired.      */
    public Board playingfield;
    private LinkedList<Move> moveLinkedList;

    public PartialSolution(Board board){
        this.playingfield=board;
        moveLinkedList = new LinkedList<>();
    }

    public PartialSolution(PartialSolution p){
        this.playingfield = new Board(p.playingfield);
        moveLinkedList = new LinkedList<>();
        moveLinkedList.addAll(p.moveSequence());



    }

    public void doMove(Move move){

        playingfield.doMove(move);
        moveLinkedList.add(move);
    }

    /**
     * Return the sequence of moves which resulted in this partial solution.
     *
     * @return The sequence of moves.
     */
    public LinkedList<Move> moveSequence() {
        /* TODO */
        LinkedList<Move> returnThis= new LinkedList<>();
        returnThis.addAll(moveLinkedList);
        return  returnThis;
    }

    @Override
    public String toString() {
        String str = "";
        int lastRobot = -1;
        for (Move move : moveSequence()) {
            if (lastRobot == move.iRobot) {
                str += " -> " + move.endPosition;
            } else {
                if (lastRobot != -1) {
                    str += ", ";
                }
                str += "R" + move.iRobot + " -> " + move.endPosition;
            }
            lastRobot = move.iRobot;
        }
        return str;
    }
}


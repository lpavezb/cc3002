package visitor;

import library.*;

import java.util.ArrayList;

public class GameVisitor extends Visitor{
    private ArrayList<Game> games = new ArrayList<>();

    @Override
    public void visitGame(Game game){ games.add(game); }

    public ArrayList<Game> getGames(){ return games; }
}

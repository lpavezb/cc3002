package game;

public class Scissor implements Hand{

    @Override
    public int play(Hand v) {
        return v.playWith(this);
    }

    @Override
    public int playWith(Rock r) {
        return 1;
    }

    @Override
    public int playWith(Paper p) {
        return -1;
    }

    @Override
    public int playWith(Scissor s) {
        return 0;
    }
}

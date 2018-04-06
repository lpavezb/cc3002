package game;

public interface Hand {
    public int play(Hand v);
    public int playWith(Rock r);
    public int playWith(Paper p);
    public int playWith(Scissor s);
}

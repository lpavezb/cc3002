package test;

import game.*;
import game.Scissor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CachipunTest {
    private Hand p;
    private Hand s;
    private Hand r;

    @Before
    public void setUp(){
        p = new Paper();
        s = new Scissor();
        r = new Rock();
    }

    @Test
    public void PaperVsScissor() {
        int res1 = p.play(s);
        int res2 = s.play(p);
        assertEquals(-1, res1,0.01);
        assertEquals(1,res2,0.01);
    }

    @Test
    public void PaperVsRock() {
        int res1 = p.play(r);
        int res2 = r.play(p);
        assertEquals(1, res1,0.01);
        assertEquals(-1,res2,0.01);
    }

    @Test
    public void RockVsSsissor() {
        int res1 = r.play(s);
        int res2 = s.play(r);
        assertEquals(1, res1,0.01);
        assertEquals(-1,res2,0.01);
    }

    @Test
    public void Tie() {
        int res1 = p.play(p);
        int res2 = s.play(s);
        int res3 = r.play(r);
        int[] test = {0, 0, 0};
        int[] res = {res1,res2,res3};

        assertArrayEquals(test,res);
    }

}

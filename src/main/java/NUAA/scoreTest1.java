package NUAA;

import org.junit.Test;
import org.junit.Assert;

public class scoreTest1 {

    @Test
    public void checttest1() {
        score score1 = new score();
        score1.setS(101);
        score1.check(score1.s);

        score1.setS(90);
        boolean result = score1.check(score1.s);
        Assert.assertEquals("error!",result,true);
    }

    @Test
    public void scoretest(){
        score score2= new score();
        char result;
        score2.setS(91);
        result = score2.Score(score2.s);
        Assert.assertEquals("error!",result,'A');

        score2.setS(81);
        result = score2.Score(score2.s);
        Assert.assertEquals("error!",result,'B');

        score2.setS(71);
        result = score2.Score(score2.s);
        Assert.assertEquals("error!",result,'C');

        score2.setS(61);
        result = score2.Score(score2.s);
        Assert.assertEquals("error!",result,'D');
    }

    @Test
    public void maintest(){
        score score3= new score();
        score3.main(score3.s);
    }
}
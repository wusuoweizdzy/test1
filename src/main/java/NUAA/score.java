package NUAA;

import org.apache.commons.lang3.RandomUtils;
public class score {
    public int s = RandomUtils.nextInt()%101;

    public void setS(int s) {
        this.s = s;
    }

    public boolean check(int scores){
        try {
            if(scores>=100 && scores<=0){
                throw new OutofBoundException("out of bound");
            }
        } catch (OutofBoundException e) {
            e.printStackTrace();
        }
        return true;
    }

    public char Score(int scores){
        char level;
        if (scores > 90) {
            level = 'A';
        } else if (scores> 80) {
            level = 'B';
        } else if (scores> 70) {
            level = 'C';
        } else {
            level = 'D';
        }
        return level;
    }

    public static void main(int score2) {
        score score1 = new score();
        score1.setS(score2);
        if(score1.check(score1.s)==true){
            System.out.println(score1.s);
            System.out.println(score1.Score(score1.s));
        }
    }

    class OutofBoundException extends Exception{
        public OutofBoundException(){

        }
        public OutofBoundException(String str){
            super(str);
        }
    }
}

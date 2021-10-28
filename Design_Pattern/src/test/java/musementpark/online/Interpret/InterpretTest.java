package musementpark.online.Interpret;

import static org.junit.jupiter.api.Assertions.*;

class InterpretTest {
    public static void main(String[] args) {
        Interpret myInterpret=new Interpret();
        Double res = myInterpret.calculate("100*0.5*10+100*0.8*2");
        String temp="5";
        System.out.println(res);
    }


}
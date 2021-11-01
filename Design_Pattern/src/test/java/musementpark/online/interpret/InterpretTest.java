package musementpark.online.interpret;

import org.junit.jupiter.api.Test;

class InterpretTest {
    @Test
    public void InterpretTest() {
        Interpret myInterpret=new Interpret();
        Double res = myInterpret.calculate("100*0.5*10+100*0.8*2");
        String temp="5";
        System.out.println(res);
    }


}
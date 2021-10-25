package musementpark.online.Interpret;

import static org.junit.jupiter.api.Assertions.*;

class DividerAndGetSingleTest {
    public static void main(String[] args) {
        DividerAndGetSingle myDivider = new DividerAndGetSingle("200/0.8/0.7");
        myDivider.interpret();
        System.out.println("原票价是:"+myDivider.getFullPrice());
        System.out.println("儿童折扣是:"+myDivider.getChildDiscount());
        System.out.println("老年人折扣是:"+myDivider.getElderDiscount());

    }

}
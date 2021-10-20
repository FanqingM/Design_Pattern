//package musementpark.offline.entertainment.decorator;
//
//import org.junit.jupiter.api.Test;
//
//class DecoratorTest {
//    @Test
//    public void DecoratorTest1() {
//        Facility aBattercake = new FacilityOriginal();
//        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
//    }
//    @Test
//    public void DecoratorTest2() {
//        Facility aBattercake = new FacilityOriginal();
//        aBattercake = new FenceDecorator(aBattercake);
//        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
//    }
//    @Test
//    public void DecoratorTest3() {
//        Facility aBattercake = new FacilityOriginal();
//        aBattercake = new FenceDecorator(aBattercake);
//        aBattercake = new FenceDecorator(aBattercake);
//        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
//    }
//
//}
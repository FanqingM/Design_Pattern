package musementpark.offline.entertainment.specification;

import static org.junit.jupiter.api.Assertions.*;

class SpecificationTest {
    public static void main(String[] args) {
        Visitor[] visitors = {
                new Visitor("mfq", 12,120),
                new Visitor("yxb" , 13,125)
        };
        ISpecification specification1 = new AgeLessSpec(20).and(new WeightLessSpec(124));
        specification1.isSatisfiedBy(visitors[0]);
        specification1.isSatisfiedBy(visitors[1]);
    }
}
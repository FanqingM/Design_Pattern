package musementpark.offline.entertainment.specification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecificationTest {
    @Test
    public void SpecificationTest() {
        Visitor[] visitors = {
                new Visitor("mfq", 18,120),
                new Visitor("yxb" , 19,200)
        };
        ISpecification specification1 = new AgeLessSpec(20).and(new WeightLessSpec(124));
        specification1.isSatisfiedBy(visitors[0]);
        specification1.isSatisfiedBy(visitors[1]);
    }
}
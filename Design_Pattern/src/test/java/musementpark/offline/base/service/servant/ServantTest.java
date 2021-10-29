package musementpark.offline.base.service.servant;

import org.junit.jupiter.api.Test;

/**
 author: hzs
 description:雇工模式测试类
 */
public class ServantTest {
    /**
      雇工模式测试
     */
    @Test
    public void servantTest(){
        Servant servant = new Servant();

        CleaningServiced cleaningServiced = new CleaningServiced();
        servant.service(cleaningServiced);
        assert cleaningServiced.getServiced();

        FoodServiced foodServiced = new FoodServiced();
        servant.service(foodServiced);
        assert foodServiced.getServiced();

        MedicalServiced medicalServiced = new MedicalServiced();
        servant.service(medicalServiced);
        assert medicalServiced.getServiced();

    }
}

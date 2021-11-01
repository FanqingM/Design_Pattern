package musementpark.base.servant;

import musementpark.offline.base.servant.CleaningServiced;
import musementpark.offline.base.servant.FoodServiced;
import musementpark.offline.base.servant.MedicalServiced;
import musementpark.offline.base.servant.Servant;
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
    public void ServantTest(){
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

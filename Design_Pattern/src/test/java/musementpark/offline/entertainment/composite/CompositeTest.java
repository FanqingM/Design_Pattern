package musementpark.offline.entertainment.composite;

import musementpark.offline.entertainment.Construct;
import org.junit.jupiter.api.Test;

class CompositeTest {
    @Test
    //对于客户端而言，操作的都是组件对象。
    public void compositeTest() {
        Construct construct = new Construct();
        construct.ConstructEntertainment();
    }
}
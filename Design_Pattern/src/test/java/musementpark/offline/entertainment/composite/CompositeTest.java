package musementpark.offline.entertainment.composite;

import org.junit.jupiter.api.Test;
import musementpark.offline.entertainment.Construct;

class CompositeTest {
    @Test
    //对于客户端而言，操作的都是组件对象。
    public void compositeTest() {
        Construct entertainment = new Construct();
        Component root = entertainment.ConstrucEntermainment();
        root.printStruct("");
    }
}
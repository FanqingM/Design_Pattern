package musementpark.offline.entertainment.list.composite;

import org.junit.jupiter.api.Test;
import musementpark.offline.entertainment.Construct;
import musementpark.offline.entertainment.list.*;
import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {
    @Test
    //对于客户端而言，操作的都是组件对象。
    public void compositeTest() {
        Construct entermainment = new Construct();
        Component root = entermainment.ConstrucEntermainment();
        root.printStruct("");
    }
}
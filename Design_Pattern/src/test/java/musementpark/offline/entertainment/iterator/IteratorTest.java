package musementpark.offline.entertainment.iterator;

import musementpark.offline.entertainment.Construct;
import musementpark.util.Print;
import musementpark.util.PrintInfo;
import org.junit.jupiter.api.Test;

import musementpark.offline.entertainment.composite.*;

class IteratorTest {
    @Test
    public void IteratorTest() {
        EntertainmentList entertainmentList = new EntertainmentList();
        Construct construct = new Construct();
        entertainmentList = construct.ConstructEntertainmentList();
        //以上构造需要迭代器便利的数据结构
        //下面用迭代器进行遍历
        for(Iterator iter = entertainmentList.getIterator(); iter.hasNext();){
            Component c = (Component) iter.next();
            Print.print(
                    new PrintInfo(
                            "Iterator",
                            String.valueOf(System.identityHashCode(this)),
                            "Iterator",
                            c.getName()
                    )
            );
        }
    }
}
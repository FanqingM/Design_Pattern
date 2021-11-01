package musementpark.offline.base.manage.convert;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class ClarkCard {
    public String id;
    public String name;

    public ClarkCard(String id, String name){
            this.id = id;
            this.name = name;
    }
    public void checkClarkCard(){
        Print.print(
                new PrintInfo(
                        "Clark",
                        String.valueOf(System.identityHashCode(this)),
                        "checkClarkCard",
                        "职工卡上姓名是："+name+",工作ID是："+id
                )
        );
    }

}

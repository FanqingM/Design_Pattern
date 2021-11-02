package musementpark.offline.management.convert;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class Clark {
    public String name;
    public String id;
    public String office;
    public String home;

    public Clark(String name, String id, String office, String home){
        this.name = name;
        this.id = id;
        this.office = office;
        this.home = home;
    }

    public void checkClark(){
        Print.print(
                new PrintInfo(
                        "Clark",
                        String.valueOf(System.identityHashCode(this)),
                        "checkClark",
                        "该职工姓名是："+name+",工作ID是："+id+",办公室在"+office+",家庭地址是："+home
                )
        );
    }

}

package musementpark.online.AbstractFactory;

/**
 * author: DannyXSC
 * description: Gift类继承Item类，表示礼品
 */
public abstract class Gift extends Item{
    /**
     * description: 构造函数
     * @param name String
     */
    public Gift(String name) {
        super(name);
    }
}

package musementpark.online.abstractFactory;

/**
 * author: DannyXSC
 * description: Item抽象类，表示物品，派生出Gift类与SouvenirMedal类
 */
public abstract class Item {
    public String name;

    /**
     * 构造函数
     * @param name String
     */
    public Item(String name) {
        this.name = name;
    }
}

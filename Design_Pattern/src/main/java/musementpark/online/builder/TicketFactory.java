package musementpark.online.builder;

/**
 * author: PandaLYZ
 * description:该类是一个关于门票的工厂类，在设计模式方面应用了单例模式，作用是生成不同类别的票
 */
public class TicketFactory {
    private int _fullPrice;
    private double _childDiscount;
    private double _elderDiscount;

    /**
     * description:set方法通过builder对成员变量进行赋值
     * @param builder Builder类型的参数
     */
    private void set(Builder builder)
    {
        this._fullPrice=builder._fullPrice;
        this._childDiscount= builder._childDiscount;
        this._elderDiscount=builder._elderDiscount;
    }
    /**
     * author: PandaLYZ
     * description:该类是一个静态内部类，由于门票种类比较多，因此此处采用建造者模式通过不同参数来灵活赋值，初始化不同身份的门票价格
     */
    public static class Builder{
        private int _fullPrice;
        private double _childDiscount;
        private double _elderDiscount;

        /**
         * description:构造函数，初始化 _fullPrice 变量
         * @param price 总价
         */
        Builder(int price)
        {
            _fullPrice=price;
        }

        /**
         * description:该方法初始化_childDiscount 变量
         * @param cDiscount 儿童的折扣
         * @return 返回一个Builder类型的对象
         */
        public Builder set_childDiscount(double cDiscount)
        {
            _childDiscount=cDiscount;
            return this;
        }
        /**
         * description:该方法初始化_elderDiscount 变量
         * @param eDiscount 老年人的折扣
         * @return 返回一个Builder类型的引用
         */
        public Builder set_elderDiscount(double eDiscount)
        {
            _elderDiscount=eDiscount;
            return this;
        }

        /**
         * description: build方法是将builder对象内部初始化后的各个变量赋值给工厂的唯一实例_singleton
         * @return 返回一个TickerFactory类型的引用
         */
        public TicketFactory build()
        {
            _singleton.set(this);
            return _singleton;
        }
    }


    //ban

    /**
     * description: TicketFactory的构造函数，因为是单例模式，所以为私有构造
     */
    private TicketFactory(){};
    private static final TicketFactory _singleton = new TicketFactory();

    /**
     * description: 该方法供外部调用，返回工厂的唯一实例
     * @return 返回唯一对象_singleton
     */
    public TicketFactory getInstance()
    {
        return _singleton;
    }

    /**
     * description:该方法的作用是根据传进来的参数返回一个对应类型的票的对象
     * @param type 身份种类
     * @return 返回Ticket类型的引用，具体是继承Ticket类的某一个子类的实例
     */
    public Ticket getTicket(String type)
    {
        switch (type.toUpperCase()) {
            case "CHILD":
                return new ChildTicket(_fullPrice,_childDiscount);
            case "ADULT":
                return new AdultTicket(_fullPrice);
            case "ELDER":
                return new ElderTicket(_fullPrice,_elderDiscount);
            default:
                return null;
        }
    }
}

package musementpark.offline.entertainment.decorator;
/*
被装饰者和装饰者的共同接口
 */
//这个后面应该是Component
public abstract class Facility {
    protected abstract String getDesc();
    protected abstract int cost();
}
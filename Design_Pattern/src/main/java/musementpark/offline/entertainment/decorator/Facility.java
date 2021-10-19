package musementpark.offline.entertainment.decorator;
/*
被装饰者和装饰者的共同接口
 */
public abstract class Facility {
    protected abstract String getDesc();
    protected abstract int cost();
}
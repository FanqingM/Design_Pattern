package musementpark.offline.entertainment.command;

import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.memento.Memento;
import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author：FanqingM
 * description：命令的接受方，是Component的子类
 */
public class Entertainment extends Component{
    //应该是private
    private String name;
    public Integer light = 0;
    public Integer isOpen = 0;
    public Integer volume = 0;
    public Component component;

    /**
     * 构造函数
     * @param component
     */
    public Entertainment(Component component) {
        this.component = component;
    }

    /**
     * 设置音量
     * @param volume
     */
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    /**
     * 设置开关
     * @param isOpen
     */
    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * 设置灯光
     * @param light
     */
    public void setLight(Integer light) {
        this.light = light;
    }

    /**
     * 打开开关
     */
    public void open() {
        this.isOpen = 1;
        Print.print(
                new PrintInfo(
                        "Entertainment",
                        String.valueOf(System.identityHashCode(this)),
                        "open",
                        "打开电源"
                )
        );
    }

    /**
     * 关闭开关
     */
    public void close() {
        this.isOpen = 0;
        Print.print(
                new PrintInfo(
                        "Entertainment",
                        String.valueOf(System.identityHashCode(this)),
                        "close",
                        "关闭电源"
                )
        );
    }

    /**
     * 增大音量
     */
    public void volumeUp() {
        this.volume++;
        Print.print(
                new PrintInfo(
                        "Entertainment",
                        String.valueOf(System.identityHashCode(this)),
                        "volumeUp",
                        "增大音量"
                )
        );
    }

    /**
     * 增大灯光
     */
    public void lightUp() {
        this.light++;
        Print.print(
                new PrintInfo(
                        "Entertainment",
                        String.valueOf(System.identityHashCode(this)),
                        "lightUp",
                        "增强灯光"
                )
        );
    }

    /**
     * 浅拷贝函数
     * @return
     */
    private Entertainment copy() {

        Entertainment entertainment = new Entertainment(this.component);
        entertainment.light = this.light;
        entertainment.volume = this.volume;
        entertainment.isOpen = this.isOpen;
        return entertainment;
    }

    /**
     * 存档
     * @return
     */
    public Memento createMemento() {
        Entertainment entertainment = this.copy();
        return new Memento(entertainment,this.light,this.isOpen,this.volume);
    }

    public void undo() {

        System.out.println("撤销操作，等待实现");
    }

//    @Override
//    public void accept(Visitor visitor) {
//
//    }
}

package musementpark.offline.entertainment.command.decorator;

import musementpark.offline.base.security.composite.Component;
import musementpark.offline.base.security.composite.Leaf;
import musementpark.offline.entertainment.command.Entertainment;
import musementpark.offline.entertainment.memento.Memento;

public class CommandDecorator {
    public Component component;
    //应该是private
    private String name;
    public Integer light = 0;
    public Integer isOpen = 0;
    public Integer volume = 0;

    public CommandDecorator(Component component) {
        this.component = component;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public void open() {
        this.isOpen = 1;
        System.out.println("打开电源!");
    }
    public void close() {
        this.isOpen = 0;
        System.out.println("关闭电源!");
    }
    public void volumeUp() {
        this.volume++;
        System.out.println("增大音量!");
    }
    public void lightUp() {
        this.light++;
        System.out.println("增强灯光!");
    }
    private Entertainment copy() {

        Entertainment entertainment = new Entertainment("娱乐设施");
        entertainment.light = this.light;
        entertainment.volume = this.volume;
        entertainment.isOpen = this.isOpen;
        return entertainment;
    }
    public Memento createMemento() {
        Entertainment entertainment = this.copy();
        return new Memento(entertainment,this.light,this.isOpen,this.volume);
    }
    public void undo() {

        System.out.println("撤销操作，等待实现");
    }
}

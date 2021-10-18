package musementpark.offline.entertainment.memento;

import musementpark.offline.entertainment.command.Entertainment;

//利用备忘录模式实现命令模式中的undo操作和redo
public class Memento {
    //保存状态
    //应该是private
    public Entertainment entermainment;
    public Integer light;
    public Integer isOpen;
    public Integer volume;

    public Memento() {
        ;
    }
    public Memento(Entertainment entermainment, Integer light, Integer isOpen, Integer volume)
    {
        this.entermainment = entermainment;
        this.light = light;
        this.isOpen = isOpen;
        this.volume = volume;
    }
    // 在某一时刻，编辑器之前的状态可以使用备忘录对象来恢复。
    public void restore() {
        this.entermainment.setIsOpen(this.isOpen);
        this.entermainment.setLight(this.light);
        this.entermainment.setVolume(this.volume);
    }
    public Entertainment getState() {
        return this.entermainment;
    }
}

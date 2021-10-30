package musementpark.offline.entertainment.memento;

import musementpark.offline.entertainment.command.Entertainment;

/**
 * author：FanqingM
 * description：备忘录元素类，与命令模式自然结合，实现命令模式中存档命令。
 */
public class Memento {
    //保存状态
    //应该是private
    public Entertainment entermainment;
    public Integer light;
    public Integer isOpen;
    public Integer volume;

    /**
     * 构造函数
     */
    public Memento() {
        ;
    }

    /**
     * 构造函数
     * @param entermainment
     * @param light
     * @param isOpen
     * @param volume
     */
    public Memento(Entertainment entermainment, Integer light, Integer isOpen, Integer volume)
    {
        this.entermainment = entermainment;
        this.light = light;
        this.isOpen = isOpen;
        this.volume = volume;
    }

    /**
     * 存档到备忘录中的一个元素
     */
    // 在某一时刻，编辑器之前的状态可以使用备忘录对象来恢复。
    public void restore() {
        this.entermainment.setIsOpen(this.isOpen);
        this.entermainment.setLight(this.light);
        this.entermainment.setVolume(this.volume);
    }

    /**
     * 从备忘录元素中获取保存的状态
     * @return
     */
    public Entertainment getState() {
        return this.entermainment;
    }
}

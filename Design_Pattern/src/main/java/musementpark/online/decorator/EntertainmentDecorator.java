package musementpark.online.decorator;

import musementpark.offline.entertainment.composite.Component;
import musementpark.offline.entertainment.visitor.Visitor;
import musementpark.online.singletonFlyweight.OnlineEntertainment;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class EntertainmentDecorator extends Component {
    protected Component component;
    protected String _EntertainmentName;
    protected boolean _OperatingState;
    protected Hashtable<String, Boolean> _Authority;
    protected Hashtable<String, Integer> _WaitingTime;
    // strategy 指向自己的array
    protected List<OnlineEntertainment> _OnlineEntertainments;

    /**
     * 构造函数
     * @param component
     */
    public EntertainmentDecorator(Component component) {
        this.component = component;
        _Authority = new Hashtable<String, Boolean>();
        _EntertainmentName = component.getName();
        _OperatingState = false;
        _OnlineEntertainments = new ArrayList<>();
    }

    /**
     * 接受访问
     * @param visitor
     */
    public void accept(Visitor visitor) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }


    /**
     * 添加子节点
     * @param child
     */
    public void addChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 移除子节点
     * @param child
     */
    public void removeChild(Component child){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 获取指定索引位置的子节点
     * @param index
     * @return
     */
    public Component getChildren(int index){
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    /**
     * 得到该节点名字
     * @return
     */
    @Override
    public String getName() {
        return this.component.getName();
    }
    /*
     * 观察者 修改权限
     * @param 无
     * */
    protected void UpdateAllAuthority() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_Authority(_Authority.get(onlineEntertainment.get_TouristType()));
        }
    }

    /*
     * 观察者 修改等候时间
     * @param 无
     * */
    protected void UpdateAllWaitingTime() {
        for (OnlineEntertainment onlineEntertainment : _OnlineEntertainments) {
            onlineEntertainment.set_WaitingTime(_WaitingTime.get(onlineEntertainment.get_TouristType()));
        }
    }

    /*
     * 移除观察者
     * @param 无
     * */
    public void RemoveEntertainment() {
    }

    ;

    /*
     * 新增观察者
     * @param 无
     * */
    public void AddEntertainment() {
    }

    ;

    /*
     * 获取娱乐设施名
     * @param 无
     * */
    public String get_EntertainmentName() {
        return _EntertainmentName;
    }

    /*
     * 策略模式 新增观察者
     * @param 线上娱乐设施对象
     * */
    public void addEntertainments(OnlineEntertainment entertainment) {
        _OnlineEntertainments.add(entertainment);
    }

    /*
     * 获取操作状态
     * @param 无
     * */
    public boolean get_OperatingState() {
        return _OperatingState;
    }

    /*
     * 设置娱乐设置状态
     * @param 无
     * */
    public void set_OperatingState(boolean OperatingState) {
        _OperatingState = OperatingState;
    }

    /*
     * 新增权限列表
     * @param 无
     * */
    public void add_Authority(String AuthorityType, Boolean TimeAndAuthority) {
        _Authority.put(AuthorityType, TimeAndAuthority);
        UpdateAllAuthority();
    }

    /*
     * 设置权限列表
     * @param 权限哈希表
     * */
    public void set_Authority(Hashtable<String, Boolean> authority) {
        _Authority = authority;
        UpdateAllAuthority();
    }

    /*
     * 设置等候时间列表
     * @param 等候时间哈希表
     * */
    public void set_WaitingTime(Hashtable<String, Integer> waitingTime) {
        _WaitingTime = waitingTime;
        UpdateAllWaitingTime();
    }

    /*
     * 获取对应游客状态的权限
     * @param 无
     * */
    public Hashtable<String, Boolean> get_Authority() {
        return _Authority;
    }
}

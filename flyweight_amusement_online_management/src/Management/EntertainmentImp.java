package Management;

import java.util.Date;
import java.util.Hashtable;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 12:20
 * @description: 实际娱乐设施类
 */
public class EntertainmentImp {
    private String _EntertainmentName;
    private boolean _OperatingState;
    private Date _WorkingStartTime;
    private Date _WorkingEndTime;
    private int _ElseInfo; // other information
    protected Hashtable<String, Boolean> _Authority;
    protected int _WaitingTime;

    EntertainmentImp(String name) {
        _Authority = new Hashtable<String, Boolean>();
        _EntertainmentName = name;
        _OperatingState = false;
        _WaitingTime = -1;
    }

    public String get_EntertainmentName() {
        return _EntertainmentName;
    }

    public boolean get_OperatingState() {
        return _OperatingState;
    }

    public void set_OperatingState(boolean OperatingState) {
        _OperatingState = OperatingState;
    }

    public void set_WaitingTime(int WaitingTime) {
        _WaitingTime = WaitingTime;
    }

    // 供管理员调用
    public void add_Authority(String AuthorityType, Boolean TimeAndAuthority) {
        // 错误处理 待添加
        _Authority.put(AuthorityType, TimeAndAuthority);
    }

    public void set_Authority(String AuthorityType, Boolean TimeAndAuthority) {
        // 错误处理 待添加
        _Authority.remove(AuthorityType);
        _Authority.put(AuthorityType, TimeAndAuthority);
    }
}

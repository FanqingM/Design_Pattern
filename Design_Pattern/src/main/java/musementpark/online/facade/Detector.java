package musementpark.online.facade;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
 * author: PandaLYZ
 * description:该类为Detector类，其是在游乐设施运作前具体执行调用检修相关方法的类
 */
public class Detector {
    /**
     * description: 该方法调用了运维检修系统对外提供的接口，完成检修工作
     * @param device AmusementDevice类型，传入某一具体游乐设施
     */
    public void detect(AmusementDevice device)
    {
        Print.print(new PrintInfo(
                "Detector",
                String.valueOf(System.identityHashCode(this)),
                "detect",
                "正在检修"+device.getClass().getSimpleName()
        ));
        OperationAndMaintain_UI ui = OperationAndMaintain_UI.getInstance();
        ui.doMaintenance();
    }
}

package musementpark.online.Facade1;

public class Detector {
    public void detect(AmusementDevice device)
    {
        System.out.println("正在检修"+device.getClass().getSimpleName());
    }
}

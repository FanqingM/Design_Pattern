package musementpark.online.Facade2;

import static org.junit.jupiter.api.Assertions.*;

class OperationAndMaintain_UITest {
    public static void main(String[] args) {
        OperationAndMaintain_UI ui = OperationAndMaintain_UI.getInstance();
        ui.doMaintenance();
    }
}
package Management;

import java.io.IOException;

/**
 * @author: Yxxxb
 * @date: 2021/10/16 14:31
 * @description:
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String[] entertainmentList = new String[]{"旋转木马", "大摆锤", "旋转木马"};
        SingleTypeTourist singleTypeTourist = new SingleTypeTourist(entertainmentList, "vip", 15);
        singleTypeTourist.show();
    }
}

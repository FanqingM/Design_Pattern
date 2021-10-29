package musementpark.offline.entertainment.memento;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * author：FanqingM
 * description：备忘录类，与宏命令模式结合，实现存档。这里是一个备忘录栈，元素是Memeto类
 */
public class MementoStack {
    private Stack<Memento> mementoStack = new Stack<Memento>();

    /**
     * 将存档状态压栈
     * @param memento
     */
    public void add(Memento memento){
        Print.print(
                new PrintInfo(
                        "MementoStack",
                        String.valueOf(System.identityHashCode(this)),
                        "add",
                        "存档到备忘录"
                )
        );
        mementoStack.add(memento);
    }

    /**
     * 获得最近存档
     * @return
     */
    public Memento get(){
        if(mementoStack.peek() == null) {
            System.out.println("无上次状态");
            return null;
        }
        else {
            Print.print(
                    new PrintInfo(
                            "MementoStack",
                            String.valueOf(System.identityHashCode(this)),
                            "get",
                            "从备忘录中取出上次存档"
                    )
            );
            return mementoStack.pop();
        }
    }
}

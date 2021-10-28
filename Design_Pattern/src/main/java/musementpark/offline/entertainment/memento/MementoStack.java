package musementpark.offline.entertainment.memento;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MementoStack {
    private Stack<Memento> mementoStack = new Stack<Memento>();

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

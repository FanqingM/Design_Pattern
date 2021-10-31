package musementpark.offline.entertainment.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MementoStack {
    private Stack<Memento> mementoStack = new Stack<Memento>();

    public void add(Memento memento){
        mementoStack.add(memento);
    }

    public Memento get(){
        if(mementoStack.peek() == null) {
            System.out.println("无上次状态");
            return null;
        }
        else {
            return mementoStack.pop();
        }
    }
}

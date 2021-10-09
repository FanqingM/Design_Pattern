package online;

import java.util.ArrayList;
import java.util.Iterator;

public class Data implements Cloneable,Iterable {
//    private ArrayList<Ticket> _ticketList=new ArrayList<>();
    private ArrayList<Visitor> _visitorList=new ArrayList<>();
    public void addVisitor(Visitor visitor)
    {
        _visitorList.add(visitor);
    }

//    public void addTicket(Ticket ticket)
//    {
//        _ticketList.add(ticket);
//    }

    @Override
    public Object clone() {
        Data date = null;
        try{
            date = (Data)super.clone();
//            date._ticketList=(ArrayList)this._ticketList.clone();
            date._visitorList=(ArrayList)this._visitorList.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }
    private class Itr implements Iterator{
        private int index=0;

        @Override
        public boolean hasNext() {
            return index < _visitorList.size();
        }

        @Override
        public Object next() {
            return _visitorList.get(index++);
        }
    }
}

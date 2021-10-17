package musementpark.offline.entertainment.list.iterator;

import musementpark.offline.entertainment.list.composite.Component;

/*
author: FanqingM
description: 基于composite中的实现，重写iterator，展示商品列表
 */
public class EntertainmentList implements Container {
    //设商品列表最多有一百个，否则屏幕一页展示不完
    public Component []components = new Component[100];
    public int length = 0;
    @Override
    public Iterator getIterator() {
        return new SuitTreeIterator();
    }
    private class SuitTreeIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return components[index++];
            }
            return null;
        }
    }
}

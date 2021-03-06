package musementpark.offline.entertainment.iterator;

import musementpark.offline.entertainment.composite.Component;

/**
 * author: FanqingM
 * description: 基于composite中的实现，重写iterator，展示商品列表
 */

public class EntertainmentList implements Container {
    //设商品列表最多有一百个，否则屏幕一页展示不完
    public Component []components = new Component[100];
    public int length = 0;

    /**
     * 获取当前容器迭代器
     * @return
     */
    @Override
    public Iterator getIterator() {
        return new EntertainmentIterator();
    }

    /**
     * 迭代器类
     */
    private class EntertainmentIterator implements Iterator {

        int index;

        /**
         * 监测是否存在下一个元素
         * @return
         */
        @Override
        public boolean hasNext() {
            if(index < length){
                return true;
            }
            return false;
        }

        /**
         * 获得下一个元素
         * @return
         */
        @Override
        public Component next() {
            if(this.hasNext()){
                return components[index++];
            }
            return null;
        }
    }
}

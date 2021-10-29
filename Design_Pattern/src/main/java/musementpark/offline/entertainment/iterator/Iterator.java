package musementpark.offline.entertainment.iterator;

import musementpark.offline.entertainment.composite.Component;

/*
author: FanqingM
description: Iterator接口
 */
public interface Iterator {
    public boolean hasNext();
    public Component next();
}

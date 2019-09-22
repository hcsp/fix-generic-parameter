package com.github.hcsp.generics;

import java.util.List;

public interface OrderProcessService {
    // 将一堆订单发送到远程的订单处理服务
    //      ┏┛ ┻━━━━━┛ ┻┓
    //      ┃　　　　　　 ┃
    //      ┃　　　━　　　┃
    //      ┃　┳┛　  ┗┳　┃
    //      ┃　　　　　　 ┃
    //      ┃　　　┻　　　┃
    //      ┃　　　　　　 ┃ 这个方法的参数实际上是List<Order>
    //      ┗━┓　　　┏━━━┛ 但是不知道哪个SB写成了List<Object>
    //        ┃　　　┃     因为已经发布出去被全公司调用了，所以没法改
    //        ┃　　　┃     <- 我现在的心情参见左边这头动物
    //        ┃　　　┗━━━━━━━━━┓
    //        ┃　　　　　　　    ┣┓
    //        ┃　　　　         ┏┛
    //        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
    //          ┃ ┫ ┫   ┃ ┫ ┫
    //          ┗━┻━┛   ┗━┻━┛
    void sendOrders(List<Object> orders);
}

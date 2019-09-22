package com.github.hcsp.generics;

import java.util.List;

public interface OrderDao {
    // 从数据库加载一批订单
    List<Order> getAllOrders();
}

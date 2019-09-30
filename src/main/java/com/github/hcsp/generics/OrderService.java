package com.github.hcsp.generics;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.List;

public class OrderService {
    private final OrderDao orderDao;
    private final OrderProcessService orderProcessService;

    @Inject
    public OrderService(OrderDao orderDao, OrderProcessService orderProcessService) {
        this.orderDao = orderDao;
        this.orderProcessService = orderProcessService;
    }

    // 请改正这里的编译错误
    public void processOrders() {
        List<Order> orders = orderDao.getAllOrders();
        //方案1-将orders设置为不可修改的.
//        orderProcessService.sendOrders(Collections.unmodifiableList(orders));
        //方案2-将orders转换为实现了List接口的类型例如ArrayList、LinkList
        orderProcessService.sendOrders(new LinkedList<>(orders));
    }
}

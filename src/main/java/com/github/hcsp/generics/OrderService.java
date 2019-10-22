package com.github.hcsp.generics;

import javax.inject.Inject;
import java.util.ArrayList;
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
        List<Object> objects = new ArrayList<>(orders);
        orderProcessService.sendOrders(objects);
    }
}

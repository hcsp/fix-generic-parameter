package com.github.hcsp.generics;

import java.util.List;
import javax.inject.Inject;

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
        List orders = orderDao.getAllOrders();
        orderProcessService.sendOrders(orders);
    }
}

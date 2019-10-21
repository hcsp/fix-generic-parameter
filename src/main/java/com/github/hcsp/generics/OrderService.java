package com.github.hcsp.generics;

import java.util.List;
import java.util.stream.Collectors;
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
        List<Order> orders = orderDao.getAllOrders();
        List<Object> list = orders.stream().map(x -> (Object) x).collect(Collectors.toList());
        orderProcessService.sendOrders(list);
    }
}

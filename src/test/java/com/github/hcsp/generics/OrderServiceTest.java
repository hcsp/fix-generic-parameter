package com.github.hcsp.generics;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class OrderServiceTest {
    @Test
    public void test() {
        OrderDao orderDao = Mockito.mock(OrderDao.class);
        OrderProcessService orderProcessService = Mockito.mock(OrderProcessService.class);

        List<Order> orders = Arrays.asList(new Order(1, "ABC"));

        OrderService service = new OrderService(orderDao, orderProcessService);
        Mockito.when(orderDao.getAllOrders()).thenReturn(orders);

        service.processOrders();
        Mockito.verify(orderProcessService).sendOrders((List) orders);
    }
}

package com.ecommerce.controller;

import com.ecommerce.model.Order;
import com.ecommerce.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/client/{clientId}")
    public List<Order> getClientOrders(@PathVariable Integer clientId) {
        return orderService.getClientOrders(clientId);
    }

    @PatchMapping("/{orderId}")
    public Order updateOrderStatus(@PathVariable Integer orderId, @RequestParam String status) {
        return orderService.updateOrderStatus(orderId, status);
    }
}
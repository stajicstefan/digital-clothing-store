package com.example.digitalclothingstore.controller;

import com.example.digitalclothingstore.model.OrderItem;
import com.example.digitalclothingstore.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orderItems")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public String getAllOrderItems(Model model) {
        List<OrderItem> orderItems = orderItemService.getAllOrderItems();
        model.addAttribute("orderItems", orderItems);
        return "orderItems";
    }

    @GetMapping("/new")
    public String createOrderItemForm(Model model) {
        model.addAttribute("orderItem", new OrderItem());
        return "create_orderItem";
    }

    @PostMapping
    public String saveOrderItem(@ModelAttribute OrderItem orderItem) {
        orderItemService.saveOrderItem(orderItem);
        return "redirect:/orderItems";
    }

    @GetMapping("/delete/{id}")
    public String deleteOrderItem(@PathVariable Long id) {
        orderItemService.deleteOrderItem(id);
        return "redirect:/orderItems";
    }
}

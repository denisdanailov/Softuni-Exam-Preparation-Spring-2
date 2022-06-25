package com.example.coffeeshop_db.web;

import com.example.coffeeshop_db.model.CategoryTypeEnum;
import com.example.coffeeshop_db.model.dtos.OrderDTO;
import com.example.coffeeshop_db.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @ModelAttribute(value = "orderDTO")
    public OrderDTO orderDTO() {
        return new OrderDTO();
    }

    @GetMapping("/order-add")
    public String orders(Model model) {

        model.addAttribute("categories", CategoryTypeEnum.values());

        return "order-add";
    }

    @PostMapping("/order-add")
    public String addOrder(@Valid OrderDTO orderDTO,
                           BindingResult bindingResult,
                           RedirectAttributes redirectAttributes) {

        System.out.println(orderDTO);

        if (bindingResult.hasErrors() || !orderService.addOrder(orderDTO)) {
            redirectAttributes.addFlashAttribute("orderDTO", orderDTO);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.orderDTO", bindingResult);

            return "redirect:/order-add";

        }

        return "/home";
    }
}



package com.fenix.api;

import com.fenix.domain.OrderEntity;
import com.fenix.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public OrderEntity create(@RequestBody OrderEntity o) {
        return service.create(o);
    }

    @GetMapping("/{id}")
    public OrderEntity get(@PathVariable UUID id) {
        return service.get(id);
    }

    @GetMapping
    public List<OrderEntity> list() {
        return service.list();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}

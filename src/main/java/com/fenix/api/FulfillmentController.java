
package com.fenix.api;

import com.fenix.domain.FulfillmentEntity;
import com.fenix.service.FulfillmentService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/orders/{orderId}/fulfillments")
public class FulfillmentController {

    private final FulfillmentService service;

    public FulfillmentController(FulfillmentService service) {
        this.service = service;
    }

    @PostMapping
    public FulfillmentEntity create(@PathVariable UUID orderId, @RequestBody FulfillmentEntity f) {
        f.setOrderId(orderId);
        return service.create(f);
    }

    @GetMapping("/{id}")
    public FulfillmentEntity get(@PathVariable UUID id) {
        return service.get(id);
    }

    @GetMapping
    public List<FulfillmentEntity> list() {
        return service.list();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}

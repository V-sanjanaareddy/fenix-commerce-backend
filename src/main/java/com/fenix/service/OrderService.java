
package com.fenix.service;

import com.fenix.domain.OrderEntity;
import com.fenix.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class OrderService {

    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public OrderEntity create(OrderEntity o) {
        return repo.save(o);
    }

    public OrderEntity get(UUID id) {
        return repo.findById(id).orElseThrow();
    }

    public List<OrderEntity> list() {
        return repo.findAll();
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}

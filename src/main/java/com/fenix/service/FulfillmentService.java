
package com.fenix.service;

import com.fenix.domain.FulfillmentEntity;
import com.fenix.repository.FulfillmentRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class FulfillmentService {

    private final FulfillmentRepository repo;

    public FulfillmentService(FulfillmentRepository repo) {
        this.repo = repo;
    }

    public FulfillmentEntity create(FulfillmentEntity f) {
        return repo.save(f);
    }

    public FulfillmentEntity get(UUID id) {
        return repo.findById(id).orElseThrow();
    }

    public List<FulfillmentEntity> list() {
        return repo.findAll();
    }

    public void delete(UUID id) {
        repo.deleteById(id);
    }
}

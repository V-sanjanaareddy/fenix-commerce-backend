
package com.fenix.repository;

import com.fenix.domain.FulfillmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface FulfillmentRepository extends JpaRepository<FulfillmentEntity, UUID> {}

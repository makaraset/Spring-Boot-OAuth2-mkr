package com.sbf.paymentgateway.repayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbf.paymentgateway.repayment.model.Group;

/**
 * Gives to JPA the ability to communicate with database
 */
@Repository
public interface GroupRepository extends JpaRepository<Group, Long>{
    // Todo add the custom search query
}

package com.sbf.paymentgateway.repayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sbf.paymentgateway.repayment.model.Account;
import com.sbf.paymentgateway.repayment.model.Role;

/**
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("SELECT a FROM Role a WHERE a.code = :code")
    Role findByCode(@Param("code") String code);

}

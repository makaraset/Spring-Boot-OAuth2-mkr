package com.sbf.paymentgateway.repayment.service;

import com.sbf.paymentgateway.repayment.model.Role;

/**
 * Created by christospapidas on 25012016--.
 */
public interface RoleService {

    Role findById(Long id);

    Role findByCode(String code);

}

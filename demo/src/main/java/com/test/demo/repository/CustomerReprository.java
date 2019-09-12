package com.test.demo.repository;

import com.test.demo.core.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/12 11:08
 */
public interface CustomerReprository extends JpaRepository<Customer,Integer> {
    Customer getCustomerByCustomerId(Integer customerId);

}

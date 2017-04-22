package com.test.repository;

import com.test.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Qiaoyy on 2017/4/18.
 */
public interface CustomerRepository extends JpaRepository<CustomerEntity ,Integer> {
}

package com.exaple.helloboot.repository;


import com.exaple.helloboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    public List<Customer> findByName(String name);
    public List<Customer> findByPhone(String phone);
//    //like검색도 가능
//    public List<Customer> findByNameLike(String keyword);


}

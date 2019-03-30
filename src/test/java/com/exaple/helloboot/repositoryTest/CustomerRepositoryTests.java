package com.exaple.helloboot.repositoryTest;
import com.exaple.helloboot.entity.Customer;
import com.exaple.helloboot.repository.CustomerRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testCustomerRepository(){
        Customer customer = Customer.builder().name("크리스").phone("010-1224-1225").build();
        Customer save = customerRepository.save(customer);

        List<Customer> customerList = customerRepository.findAll();

        Customer chris = customerList.get(0);
        assertThat(chris.getName(), is("크리스"));
        assertThat(chris.getPhone(), is("010-1224-1225"));
    }

    @After
    public void deleteAll() {
        customerRepository.deleteAll();
    }

}

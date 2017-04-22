package com.test.controller;

import com.test.model.CustomerEntity;
import com.test.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Qiaoyy on 2017/4/10.
 */
@Controller
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
    @RequestMapping(value = "/customer/customers", method = RequestMethod.GET)//value:请求地址
    public String getCustomers(ModelMap modelMap) {
        List<CustomerEntity> customerList = customerRepository.findAll();
        // 将所有记录传递给要返回的jsp页面，放在customerList当中
        modelMap.addAttribute("customerList", customerList);
        return "customer/customers"; // 转到 customer/customers.jsp页面
    }
    @RequestMapping(value = "/customer/customers/show/{id}", method = RequestMethod.GET)
    public String showCustomer(@PathVariable("id") Integer customerId, ModelMap modelMap) {

        // 找到customerId所表示的用户
        CustomerEntity customerEntity = customerRepository.findOne(customerId);

        // 传递给请求页面
        modelMap.addAttribute("customer", customerEntity);
        return "customer/customerDetail";
    }
    @RequestMapping(value = "/customer/customers/add", method = RequestMethod.GET)//value:请求地址
    public String addCustomer() {
        // 转到 admin/addUser.jsp页面
        return "customer/addCustomer";
    }
    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/customer/customers/addP", method = RequestMethod.POST)
    public String addCustomerPost(@ModelAttribute("role") CustomerEntity customerEntity) {
        // 注意此处，post请求传递过来的是一个RoleEntity对象，里面包含了该用户的信息
        customerRepository.saveAndFlush(customerEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/customer/customers";
    }

}

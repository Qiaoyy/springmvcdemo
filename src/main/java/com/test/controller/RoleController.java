package com.test.controller;

import com.test.model.RoleEntity;
import com.test.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Qiaoyy on 2017/3/29.
 */
@Controller
public class RoleController {
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping(value = "/admin/roles", method = RequestMethod.GET)
    public String getRoles(ModelMap modelMap) {
        // 查询role表中所有记录
        List<RoleEntity> roleList = roleRepository.findAll();

        // 将所有记录传递给要返回的jsp页面，放在roleList当中
       modelMap.addAttribute("roleList", roleList);

        // 返回pages目录下的admin/roles.jsp页面
        return "admin/roles";
    }
    // post请求，处理添加用户请求，并重定向到用户管理页面
    @RequestMapping(value = "/admin/roles/addP", method = RequestMethod.POST)
    public String addRolePost(@ModelAttribute("role") RoleEntity roleEntity) {
        // 注意此处，post请求传递过来的是一个RoleEntity对象，里面包含了该用户的信息
        // 通过@ModelAttribute()注解可以获取传递过来的'role'，并创建这个对象

        // 数据库中添加一个用户，该步暂时不会刷新缓存
        //roleRepository.save(roleEntity);

        // 数据库中添加一个用户，并立即刷新缓存
        roleRepository.saveAndFlush(roleEntity);

        // 重定向到用户管理页面，方法为 redirect:url
        return "redirect:/admin/roles";
    }
    // 更新用户信息 页面
    @RequestMapping(value = "/admin/roles/update/{id}", method = RequestMethod.GET)
    public String updateRole(@PathVariable("id") Integer roleId, ModelMap modelMap) {

        // 找到roleId所表示的用户
        RoleEntity roleEntity = roleRepository.findOne(roleId);
        // 传递给请求页面
        modelMap.addAttribute("role", roleEntity);
        return "admin/updateRole";
    }

    // 更新用户信息 操作
    @RequestMapping(value = "/admin/roles/updateP", method = RequestMethod.POST)
    public String updateRolePost(@ModelAttribute("roleP") RoleEntity role) {
        // 更新用户信息
        roleRepository.updateRole(role.getRoleName(),role.getRoleId());
        roleRepository.flush(); // 刷新缓冲区
        return "redirect:/admin/roles";
    }
}

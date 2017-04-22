package com.test.repository;

import com.test.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qiaoyy on 2017/3/29.
 */
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update RoleEntity role set role.roleName=:qroleName where role.roleId=:qroleId")
    public void updateRole(@Param("qroleName") String rolename,@Param("qroleId") Integer roleId);
}

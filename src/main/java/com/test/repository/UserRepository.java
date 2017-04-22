package com.test.repository;

import com.test.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Qiaoyy on 2017/3/27.
 */
/*
    在 JpaRepository 中，定义了几个简化的操作数据库的方法：
    （1） findAll()：查找表中所有记录；
    （2）findOne(Integer id)：按 id 来查找某一条记录；
    （3）findByXXX(Object xxx)：在这里 XXX 是一个字段名，根据该字段的值开查找所有记录；
    （4）save() 和 delete()：添加一条记录以及删除一条记录。

 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Modifying      // 说明该方法是修改操作 使用 @Modifying 进行修饰. 以通知 SpringData， 这是一个 UPDATE 或 DELETE 操作
    @Transactional  // 说明该方法是事务性操作,方法里面对数据库操作，如果失败则spring负责回滚操作，成功提交操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update UserEntity us set us.userName=:quserName, us.userPassword=:quserPassword, us.roleByRoleId.roleId=:qroleId where us.userId=:qId")
    public void updateUser(@Param("quserName") String userName, @Param("quserPassword") String quserPassword,
                           @Param("qroleId") int qroleId, @Param("qId") int qId);

    @Query("select u.userPassword from UserEntity u where u.userName=:quserName")
    public String validateUser(@Param("quserName") String userName);

}
package com.test.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Qiaoyy on 2017/4/21.
 */
@Entity
@Table(name = "role", schema = "test", catalog = "")
public class RoleEntity {
    private int roleId;
    private String roleName;
    private Collection<UserEntity> usersByRoleId;

    @Id
    @Column(name = "role_id", nullable = false)
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name", nullable = true, length = 10)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleEntity that = (RoleEntity) o;

        if (roleId != that.roleId) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "roleByRoleId")
    public Collection<UserEntity> getUsersByRoleId() {
        return usersByRoleId;
    }

    public void setUsersByRoleId(Collection<UserEntity> usersByRoleId) {
        this.usersByRoleId = usersByRoleId;
    }
}

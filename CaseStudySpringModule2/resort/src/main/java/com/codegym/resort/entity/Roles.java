//package com.codegym.resort.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Set;
//
//@Entity
//@Table(name = "roles")
//public class Roles implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_role", nullable = false)
//    private Long idRole;
//
//    @Column(name = "role_name", nullable = false)
//    private String roleName;
//
//    @ManyToMany(mappedBy = "roles")
//    private Set<UserAccounts> UserAccounts;
//
//    public Long getIdRole() {
//        return idRole;
//    }
//
//    public void setIdRole(Long idRole) {
//        this.idRole = idRole;
//    }
//
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
//    }
//
//    public Set<UserAccounts> getUserAccounts() {
//        return UserAccounts;
//    }
//
//    public void setUserAccounts(Set<UserAccounts> userAccounts) {
//        UserAccounts = userAccounts;
//    }
//}

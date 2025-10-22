package com.delta.organization.company_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "department")
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne
    @JoinColumn(name = "department_type_id")
    private DepartmentType departmentType;
    @ManyToOne
    @JoinColumn(name = "town_id")
    private Town town;
    @OneToMany(mappedBy = "department")
    private List<User> userList;
    @OneToMany(mappedBy = "childDepartment")
    private List<DepartmentHierarchy> childrenHierarchyList;
    @OneToMany(mappedBy = "parentDepartment")
    private List<DepartmentHierarchy> parentHierarchyList;
    @Column(name = "address_detail")
    private String addressDetail;
    @Column(name = "active")
    private boolean isActive;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

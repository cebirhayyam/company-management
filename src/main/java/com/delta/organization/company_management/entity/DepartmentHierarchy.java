package com.delta.organization.company_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "department_hierarchy")
@Getter
@Setter
public class DepartmentHierarchy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "child_department_id")
    private Department childDepartment;
    @ManyToOne
    @JoinColumn(name = "parent_department_id")
    private Department parentDepartment;
}

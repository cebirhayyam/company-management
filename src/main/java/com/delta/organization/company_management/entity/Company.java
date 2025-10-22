package com.delta.organization.company_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "company")
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "short_name")
    private String shortName;
    @ManyToOne
    @JoinColumn(name = "company_type_id")
    private CompanyType companyType;
    @ManyToOne
    @JoinColumn(name = "town_id")
    private Town town;
    @OneToMany(mappedBy = "company")
    private List<Department> departmentList;
    @Column(name = "address_detail")
    private String addressDetail;
    @Column(name = "active")
    private boolean isActive;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}

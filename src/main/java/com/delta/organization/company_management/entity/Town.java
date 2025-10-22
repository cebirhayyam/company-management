package com.delta.organization.company_management.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "town")
@Getter
@Setter
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
    @OneToMany(mappedBy = "town")
    private List<Company> companyList;
    @OneToMany(mappedBy = "town")
    private List<Department> departmentList;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}

package com.example.entity;

import jakarta.persistence.*;

import java.util.Set;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Bank_Branch")
public class BankBranch {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String city;

  @ManyToMany(cascade = {CascadeType.ALL})
  @JoinTable(
      name = "branch_services",
      joinColumns = {@JoinColumn(name = "branch_id")},
      inverseJoinColumns = {@JoinColumn(name = "service_id")})
  private Set<BankService> bankServices;
}

package com.example.abouelhijafatma.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String email ;
    private String pwd ;
    private String firstname ;
    private String lastname ;
    @Enumerated(EnumType.STRING)
    private Role role ;
    @ManyToMany
    private List<Project> projectlist;
    @OneToMany
    private List<Project> projects;



}

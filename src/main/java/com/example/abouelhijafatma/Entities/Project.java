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
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    @ManyToMany(mappedBy = "projectlist")
    private List<User> user;
    @OneToMany(mappedBy = "project", cascade = CascadeType.PERSIST)
    private List<Sprint> sprint;
}

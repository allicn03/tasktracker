package org.perscholas.tasktracker.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;

@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
@Table(name="users")

public class User
{
    @Id
    @GeneratedValue
    Long id;

    String username;
    String password;

    @ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="users")
    Set<Budget> budgets = new TreeSet<>();

}

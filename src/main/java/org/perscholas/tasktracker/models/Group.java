package org.perscholas.tasktracker.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

@Entity
@Table(name="groups")

public class Group
{
    @Id
    @GeneratedValue
    Long id;

    String name;

    @ManyToOne
    Budget budget;

    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="group")
    Set<Category> categories = new TreeSet<>();
}
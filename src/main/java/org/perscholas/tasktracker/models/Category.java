package org.perscholas.tasktracker.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity

public class Category
{
    @Id @GeneratedValue
    Long id;

    BigDecimal budget;
    String name;
    Date startDate;
    Date endDate;

    @ManyToOne
    Group group;

    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY, mappedBy="category")
    Set<Transaction> transactions = new TreeSet<>();
}
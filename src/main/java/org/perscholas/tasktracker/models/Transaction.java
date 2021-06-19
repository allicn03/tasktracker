package org.perscholas.tasktracker.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity

public class Transaction
{
    @Id
    @GeneratedValue
    private Long id;

    private Date date;
    private BigDecimal total;
    private String type;
    private String note;

    @ManyToOne
    private Category category;

}
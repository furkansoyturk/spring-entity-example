package com.example.entity.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Test {

    @Id
    private Long id;

    private String name;

}

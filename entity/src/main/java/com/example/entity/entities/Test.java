package com.example.entity.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Test {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    private String name;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Test test = (Test) o;
        return id != null && Objects.equals(id, test.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

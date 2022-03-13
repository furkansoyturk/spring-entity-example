package com.example.entity.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity(name = "Tag")
@Table(name = "tag")
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Tag extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    @Column(name = "version")
    private  Integer version;

    @Column(name = "tag_name")
    private String tagName;

}

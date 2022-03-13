package com.example.entity.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Post")
@Table(name = "post")
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Post extends BaseEntity implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Version
    @Column(name = "version")
    private  Integer version;

    @Column(name = "content")
    private String content;
}

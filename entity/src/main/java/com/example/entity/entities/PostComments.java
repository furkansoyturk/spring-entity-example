package com.example.entity.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "PostComments")
@Table(name = "post_comments")
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class PostComments extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    @Column(name = "version")
    private  Integer version;

    @Column(name = "comment_text")
    private String commentText;

    @ManyToOne
    @JoinColumn(name = "commented_by")
    private User user;

    @CreationTimestamp
    @Column(name = "comment_date_time")
    private LocalDateTime commentDateTime;
}

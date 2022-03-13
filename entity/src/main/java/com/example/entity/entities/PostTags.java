package com.example.entity.entities;

import com.example.entity.idClasses.PostTagId;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "post_tags")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@IdClass(PostTagId.class)
public class PostTags implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "post_id")
    private Post post;
//    private long postId;

    @Id
    @OneToOne
    @JoinColumn(name = "tag_id")
    private Tag tag;

}

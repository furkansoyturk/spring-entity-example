package com.example.entity.idClasses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class PostTagId implements Serializable {

    Long post_id;
    Long tag_id;

    public PostTagId(){

    }

    public PostTagId(Long postId, Long tagId){
        this.post_id = postId;
        this.tag_id = tagId;
    }

}

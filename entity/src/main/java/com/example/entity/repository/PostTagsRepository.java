package com.example.entity.repository;

import com.example.entity.entities.PostTags;
import com.example.entity.idClasses.PostTagId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostTagsRepository extends JpaRepository<PostTags, PostTagId> {
}

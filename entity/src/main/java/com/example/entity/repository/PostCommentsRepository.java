package com.example.entity.repository;

import com.example.entity.entities.PostComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentsRepository extends JpaRepository<PostComments, Long> {
}

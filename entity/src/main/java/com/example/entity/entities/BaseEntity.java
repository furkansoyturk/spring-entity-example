package com.example.entity.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class BaseEntity {

    @CreatedBy
    @Column(name = "created_by")
    private Long createdBy;

    @CreationTimestamp
    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @LastModifiedBy
    @Column(name = "updated_by")
    private Long updatedBy;

    @UpdateTimestamp
    @Column(name = " updated_date_time")
    private LocalDateTime updatedDateTime;
}

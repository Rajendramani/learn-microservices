package com.learn.accounts.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createAt;
    @Column(updatable = false, name = "created_by")
    private String createBy;
    @Column(insertable = false, name = "updated_at")
    private LocalDateTime updateAt;
    @Column(insertable = false, name = "updated_by")
    private String updateBy;
}

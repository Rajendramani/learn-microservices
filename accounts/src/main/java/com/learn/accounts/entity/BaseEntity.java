package com.learn.accounts.entity;

import java.time.LocalDateTime;

import com.learn.accounts.audit.AuditAwareImpl;
import jakarta.persistence.EntityListeners;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
@ToString
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private LocalDateTime createAt;
    @CreatedBy
    @Column(updatable = false, name = "created_by")
    private String createBy;
    @LastModifiedDate
    @Column(insertable = false, name = "updated_at")
    private LocalDateTime updateAt;
    @LastModifiedBy
    @Column(insertable = false, name = "updated_by")
    private String updateBy;
}

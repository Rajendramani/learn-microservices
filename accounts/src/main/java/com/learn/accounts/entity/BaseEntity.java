package com.learn.accounts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import lombok.ToString;
import java.time.LocalDateTime;

@Entity
@ToString
@MappedSuperclass
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime create_at;
    @Column(updatable = false)
    private String create_by;
    @Column(insertable = false)
    private LocalDateTime update_at;
    @Column(insertable = false)
    private String update_by;
}

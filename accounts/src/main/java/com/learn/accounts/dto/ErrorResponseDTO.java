package com.learn.accounts.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDTO {
    private String errorCode;
    private String errorMessage;
    private LocalDateTime errorTimestamp;
}

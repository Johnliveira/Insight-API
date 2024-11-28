package com.zentech.insight.dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class CategoryDTO {

    private Long id;

    private String name;

    private String iconUrl;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}

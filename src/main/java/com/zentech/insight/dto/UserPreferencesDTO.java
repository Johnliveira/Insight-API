package com.zentech.insight.dto;

import java.time.LocalDateTime;

public class UserPreferencesDTO {

    private Long id;

    private Long userId;

    private String preferredLanguage;

    private String currency;

    private String theme;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

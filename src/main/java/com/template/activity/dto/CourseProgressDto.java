package com.template.activity.dto;

import com.template.activity.entity.ModuleEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseProgressDto {
    private UUID id;

    private int version;

    private UUID creator;

    private String title;

    private String description;

    private List<ModuleEntity> modules;

    private ModuleEntity lastModule;

    private List<ModuleEntity> completedModule;

    private LocalDateTime started;

    private LocalDateTime ended;

    private LocalDateTime created;

    private LocalDateTime updated;
}

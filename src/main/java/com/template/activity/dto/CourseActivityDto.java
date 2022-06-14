package com.template.activity.dto;

import com.template.activity.entity.CourseProgressEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourseActivityDto {
    private UUID id;

    private UUID owner;

    private CourseProgressEntity progress;
}

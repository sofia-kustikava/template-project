package com.template.activity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.template.activity.entity.AttachmentEntity;
import com.template.activity.entity.TaskDataEntity;
import com.template.activity.entity.TestResultEntity;
import com.template.activity.entity.VideoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "created",
        "updated"
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModuleDto {
    private UUID id;

    private String title;

    private List<VideoEntity> videos;

    private boolean completed;

    private List<AttachmentEntity> attachments;

    private List<TaskDataEntity> tasks;

    private List<TestResultEntity> tests;

    private LocalDateTime created;

    private LocalDateTime updated;
}

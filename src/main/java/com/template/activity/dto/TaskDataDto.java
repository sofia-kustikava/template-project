package com.template.activity.dto;

import com.template.activity.entity.FeedbackEntity;
import com.template.activity.enums.StatusEnum;
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
public class TaskDataDto {
    private UUID id;

    private String description;

    private String url;

    private List<FeedbackEntity> feedbacks;

    private StatusEnum status;

    private LocalDateTime started;

    private LocalDateTime ended;
}

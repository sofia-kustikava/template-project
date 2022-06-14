package com.template.activity.dto;

import com.template.activity.entity.QuestionEntity;
import com.template.activity.enums.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestResultDto {
    private UUID id;

    private int rightAnswer;

    private String title;

    private StateEnum state;

    private List<QuestionEntity> questions;

    private Map<Integer, Integer> results;

    private LocalDateTime started;

    private LocalDateTime ended;
}

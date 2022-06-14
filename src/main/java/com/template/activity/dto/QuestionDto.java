package com.template.activity.dto;

import com.template.activity.entity.AnswerEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {
    private UUID id;

    private String question;

    private int number;

    private List<AnswerEntity> answers;
}

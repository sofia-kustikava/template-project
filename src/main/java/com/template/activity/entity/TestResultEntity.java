package com.template.activity.entity;

import com.template.activity.enums.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TestResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private int rightAnswer;

    private String title;

    private StateEnum state;

    @OneToMany()
    private List<QuestionEntity> questions;

    @OneToMany()
    private List<ResultAnswersEntity> results;

    private LocalDateTime started;

    private LocalDateTime ended;

}

package com.template.activity.entity;

import com.template.activity.enums.StatusEnum;
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
public class TaskDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String description;

    private String url;

    @OneToMany()
    private List<FeedbackEntity> feedbacks;

    private StatusEnum status;

    private LocalDateTime started;

    private LocalDateTime ended;

}

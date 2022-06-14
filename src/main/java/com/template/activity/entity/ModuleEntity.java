package com.template.activity.entity;

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
public class ModuleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private String title;

    @OneToMany()
    private List<VideoEntity> videos;

    private boolean completed;

    @OneToMany()
    private List<AttachmentEntity> attachments;

    @OneToMany()
    private List<TaskDataEntity> tasks;

    @OneToMany()
    private List<TestResultEntity> tests;

    private LocalDateTime created;

    private LocalDateTime updated;

}

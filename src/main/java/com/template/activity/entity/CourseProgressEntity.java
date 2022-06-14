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
public class CourseProgressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    private int version;

    private UUID creator;

    private String title;

    private String description;

    @OneToMany()
    private List<ModuleEntity> modules;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "module_id")
    private ModuleEntity lastModule;

    @OneToMany()
    private List<ModuleEntity> completedModule;

    private LocalDateTime started;

    private LocalDateTime ended;

    private LocalDateTime created;

    private LocalDateTime updated;
}

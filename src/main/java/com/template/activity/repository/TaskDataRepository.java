package com.template.activity.repository;

import com.template.activity.entity.TaskDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskDataRepository extends JpaRepository<TaskDataEntity, UUID> {
}

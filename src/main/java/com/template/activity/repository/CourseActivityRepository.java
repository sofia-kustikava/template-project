package com.template.activity.repository;

import com.template.activity.entity.CourseActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CourseActivityRepository extends JpaRepository<CourseActivityEntity, UUID> {
}

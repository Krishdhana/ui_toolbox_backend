package com.uitoolbx.collection.uitoolbox.repository;

import com.uitoolbx.collection.uitoolbox.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToolRepository extends JpaRepository<Tool, Long> {

    List<Tool> findToolByGroupId(Long id);
}

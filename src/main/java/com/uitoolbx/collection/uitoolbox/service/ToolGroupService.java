package com.uitoolbx.collection.uitoolbox.service;

import com.uitoolbx.collection.uitoolbox.entity.ToolGroup;

import java.util.List;
import java.util.Optional;

public interface ToolGroupService {


    public ToolGroup getToolGroupWithId(Long id);

    public List<ToolGroup> getToolGroupList();

    public String addToolGroup(ToolGroup toolGroup);

    public String deleteToolGroup(Long id);

    public String updateToolGroup(ToolGroup toolGroup);
}

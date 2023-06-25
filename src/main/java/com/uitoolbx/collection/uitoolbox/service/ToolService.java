package com.uitoolbx.collection.uitoolbox.service;

import com.uitoolbx.collection.uitoolbox.entity.Tool;

import java.util.List;


public interface ToolService {

    public Tool getTool(Long id);

    public List<Tool> getAllTools();

    public String addTool(Tool tool);

    public String deleteTool(Long id);

    public String updateTool(Tool tool);

    public List<Tool> getToolListWithGroupId(Long id);
}

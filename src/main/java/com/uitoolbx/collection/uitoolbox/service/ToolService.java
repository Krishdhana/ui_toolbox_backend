package com.uitoolbx.collection.uitoolbox.service;

import com.uitoolbx.collection.uitoolbox.entity.Tool;

import java.util.List;


public interface ToolService {

    public Tool getTool(Long id);

    public List<Tool> getAllTools();

    public void addTool(Tool tool);

    public void deleteTool(Long id);

    public void updateTool(Tool tool);
}

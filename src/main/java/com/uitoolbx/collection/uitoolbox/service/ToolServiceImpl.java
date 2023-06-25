package com.uitoolbx.collection.uitoolbox.service;

import com.uitoolbx.collection.uitoolbox.entity.Tool;
import com.uitoolbx.collection.uitoolbox.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolServiceImpl implements ToolService {


    private final ToolRepository toolRepository;

    @Autowired
    public ToolServiceImpl(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    @Override
    public Tool getTool(Long id) {
        return null;
    }

    @Override
    public List<Tool> getAllTools() {
        return this.toolRepository.findAll();
    }

    @Override
    public String addTool(Tool tool) {
        this.toolRepository.save(tool);
        return "Tool added with name" + tool.getName();
    }

    @Override
    public String deleteTool(Long id) {
        this.toolRepository.deleteById(id);
        return "Tool with ID "+ id + "has been Deleted";
    }

    @Override
    public String updateTool(Tool tool) {
        this.toolRepository.save(tool);
        return "Tool with ID "+ tool.getId() + "has been Updated";

    }

    @Override
    public List<Tool> getToolListWithGroupId(Long id) {
        return this.toolRepository.findToolByGroupId(id);
    }
}

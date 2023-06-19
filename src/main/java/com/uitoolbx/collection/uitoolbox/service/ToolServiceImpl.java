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
        return null;
    }

    @Override
    public void addTool(Tool tool) {
        this.toolRepository.save(tool);

    }

    @Override
    public void deleteTool(Long id) {

    }

    @Override
    public void updateTool(Tool tool) {

    }
}

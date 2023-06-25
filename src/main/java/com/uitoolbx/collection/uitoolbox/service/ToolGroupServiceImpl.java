package com.uitoolbx.collection.uitoolbox.service;

import com.uitoolbx.collection.uitoolbox.entity.ToolGroup;
import com.uitoolbx.collection.uitoolbox.repository.ToolGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolGroupServiceImpl implements  ToolGroupService{
    private final ToolGroupRepository toolGroupRepository;
    @Autowired
    public ToolGroupServiceImpl(ToolGroupRepository toolGroupRepository) {
        this.toolGroupRepository = toolGroupRepository;
    }

    @Override
    public ToolGroup getToolGroupWithId(Long id) {
        return this.toolGroupRepository.findById(id).orElse(null);
    }

    @Override
    public List<ToolGroup> getToolGroupList() {
        return this.toolGroupRepository.findAll();
    }

    @Override
    public String addToolGroup(ToolGroup toolGroup) {
        this.toolGroupRepository.save(toolGroup);
        return "ToolGroup has been created with the name " + toolGroup.getName();
    }

    @Override
    public String deleteToolGroup(Long id) {
        this.toolGroupRepository.deleteById(id);
        return "ToolGroup with ID "+ id + "has been deleted";
    }

    @Override
    public String updateToolGroup(ToolGroup toolGroup) {
        this.toolGroupRepository.save(toolGroup);
        return "ToolGroup with ID "+ toolGroup.getId() + "has been Updated";
    }
}

package com.uitoolbx.collection.uitoolbox.controllers;

import com.uitoolbx.collection.uitoolbox.entity.Tool;
import com.uitoolbx.collection.uitoolbox.entity.ToolGroup;
import com.uitoolbx.collection.uitoolbox.service.ToolGroupService;
import com.uitoolbx.collection.uitoolbox.service.ToolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/toolgroups")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ToolGroupController {

    private final ToolGroupService toolGroupService;
    private final ToolService toolService;

    public ToolGroupController(ToolGroupService toolGroupService, ToolService toolService) {
        this.toolGroupService = toolGroupService;
        this.toolService = toolService;
    }

    @GetMapping
    public List<ToolGroup> getToolGroupList() {
        return this.toolGroupService.getToolGroupList();
    }

    @PostMapping
    public String addToolGroup(@RequestBody ToolGroup toolGroup) {
        return this.toolGroupService.addToolGroup(toolGroup);
    }

    @GetMapping("/getall")
    public List<ToolGroup> getAllGroupWithTools() {
        List<ToolGroup> toolgroup = this.toolGroupService.getToolGroupList();
        toolgroup.forEach(grp -> {
            List<Tool> tools = this.toolService.getToolListWithGroupId(grp.getId());
            grp.setToolList(tools);
        });

        return toolgroup;
    }

    @DeleteMapping("/{toolGroupId}")
    public String deleteToolGroup(@PathVariable Long toolGroupId) {
        return this.toolGroupService.deleteToolGroup(toolGroupId);
    }

    @PutMapping
    public String updateToolGroup (@RequestBody ToolGroup toolGroup) {
        return this.toolGroupService.updateToolGroup(toolGroup);
    }
}

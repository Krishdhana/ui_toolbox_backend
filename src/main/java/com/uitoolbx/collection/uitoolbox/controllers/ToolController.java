package com.uitoolbx.collection.uitoolbox.controllers;

import com.uitoolbx.collection.uitoolbox.entity.Tool;
import com.uitoolbx.collection.uitoolbox.service.ToolService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v1/tools")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ToolController {

    private final ToolService toolService;

    @Autowired
    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping
    public List<Tool> getAllTools() {
     return this.toolService.getAllTools();
    }

    @PostMapping()
    public String addTool(@RequestBody Tool tool) {
    return this.toolService.addTool(tool);
    }

    @DeleteMapping("/{toolId}")
    public String deleteTool(@PathVariable Long toolId) {
        return this.toolService.deleteTool(toolId);
    }
}

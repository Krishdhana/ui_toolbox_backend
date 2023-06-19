package com.uitoolbx.collection.uitoolbox.controllers;

import com.uitoolbx.collection.uitoolbox.entity.Tool;
import com.uitoolbx.collection.uitoolbox.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/tools")
public class ToolController {

    private final ToolService toolService;

    @Autowired
    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }


    @GetMapping
    public List<Tool> getAllTools() {
     ArrayList<Tool> list = new ArrayList<>();
     list.add(new Tool());
     return list;
    }
}

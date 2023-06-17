package com.uitoolbx.collection.uitoolbox.entity;

import jakarta.persistence.*;
import org.apache.catalina.util.IOTools;

import java.util.List;

@Entity
@Table(name = "toolgroup")
public class ToolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private List<Tool> toolList;

    public ToolGroup() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tool> getToolList() {
        return toolList;
    }

    public void setToolList(List<Tool> toolList) {
        this.toolList = toolList;
    }

    @Override
    public String toString() {
        return "ToolGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", toolList=" + toolList +
                '}';
    }
}

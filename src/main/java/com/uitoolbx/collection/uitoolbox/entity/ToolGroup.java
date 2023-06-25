package com.uitoolbx.collection.uitoolbox.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tool_group")
public class ToolGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Transient
    private List<Tool> toolList;

    public  ToolGroup() {};

    public ToolGroup(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

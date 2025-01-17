package com.example.demo.dto.openAi.assistants.request;

import java.util.Map;

import com.example.demo.dto.openAi.fragment.ToolResourcesFragment;
import com.example.demo.dto.openAi.fragment.ToolsFragment;

import jakarta.validation.constraints.NotNull;

public class CreateAssistant {
	@NotNull
	private String model;
	private String name;
	private String description;
	private String instructions;
	private ToolsFragment<?>[] tools;
	private ToolResourcesFragment tool_resources;
	private Map<String, String> metadata;
	private Double temperature;
	private Double topP;
	private Object responseFormat; // Need to Refactor, it is diferent from the documentation
	
	public ToolResourcesFragment getTool_resources() {
		return tool_resources;
	}
	public void setTool_resources(ToolResourcesFragment tool_resources) {
		this.tool_resources = tool_resources;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	public ToolsFragment<?>[] getTools() {
		return tools;
	}
	public void setTools(ToolsFragment<?>[] tools) {
		this.tools = tools;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	public Double getTemperature() {
		return temperature;
	}
	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}
	public Double getTopP() {
		return topP;
	}
	public void setTopP(Double topP) {
		this.topP = topP;
	}
	public Object getResponseFormat() {
		return responseFormat;
	}
	public void setResponseFormat(Object responseFormat) {
		this.responseFormat = responseFormat;
	}

}
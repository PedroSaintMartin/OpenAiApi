package com.example.demo.dto.openAi;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

import com.example.demo.dto.openAi.fragment.ToolResourcesFragment;
import com.example.demo.dto.openAi.fragment.ToolsFragment;

import jakarta.validation.constraints.NotNull;

public class CreateAssistant {
	@NotNull
	private String model;
	private String name;
	private String description;
	private String instructions;
	private ToolsFragment[] tools;
	private ToolResourcesFragment toolResources;
	private Map<String, String> metadata;
	private Double temperature;
	private Double topP;
	private Object responseFormat; // Need to Refactor, it is diferent from the documentation
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
	public ToolsFragment[] getTools() {
		return tools;
	}
	public void setTools(ToolsFragment[] tools) {
		this.tools = tools;
	}
	public ToolResourcesFragment getToolResources() {
		return toolResources;
	}
	public void setToolResources(ToolResourcesFragment toolResources) {
		this.toolResources = toolResources;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(tools);
		result = prime * result + Objects.hash(description, instructions, metadata, model, name, responseFormat,
				temperature, toolResources, topP);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateAssistant other = (CreateAssistant) obj;
		return Objects.equals(description, other.description) && Objects.equals(instructions, other.instructions)
				&& Objects.equals(metadata, other.metadata) && Objects.equals(model, other.model)
				&& Objects.equals(name, other.name) && Objects.equals(responseFormat, other.responseFormat)
				&& Objects.equals(temperature, other.temperature) && Objects.equals(toolResources, other.toolResources)
				&& Arrays.equals(tools, other.tools) && Objects.equals(topP, other.topP);
	}
	@Override
	public String toString() {
		return "CreateAssistant [model=" + model + ", name=" + name + ", description=" + description + ", instructions="
				+ instructions + ", tools=" + Arrays.toString(tools) + ", toolResources=" + toolResources
				+ ", metadata=" + metadata + ", temperature=" + temperature + ", topP=" + topP + ", responseFormat="
				+ responseFormat + "]";
	}
}
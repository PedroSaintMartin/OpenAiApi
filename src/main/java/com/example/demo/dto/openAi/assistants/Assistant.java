package com.example.demo.dto.openAi.assistants;

import java.util.Map;
import java.util.Objects;

import com.example.demo.dto.openAi.fragment.ToolsFragment;

public class Assistant {
	private String id;
	private String object;
	private Long created_at;
	private String name;
	private String description;
	private String model;
	private String instructions;
	private ToolsFragment<?>[] tools;
	private Map<String, String> metadata;
	private Double temperature;
	private Double top_p;
	private Object response_format; // Need to Refactor, it is diferent from the documentation
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public Long getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Long created_at) {
		this.created_at = created_at;
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
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	public Double getTop_p() {
		return top_p;
	}
	public void setTop_p(Double top_p) {
		this.top_p = top_p;
	}
	public Object getResponse_format() {
		return response_format;
	}
	public void setResponse_format(Object response_format) {
		this.response_format = response_format;
	}
	@Override
	public int hashCode() {
		return Objects.hash(created_at, description, id, instructions, metadata, model, name, object, response_format,
				temperature, tools, top_p);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assistant other = (Assistant) obj;
		return Objects.equals(created_at, other.created_at) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(instructions, other.instructions)
				&& Objects.equals(metadata, other.metadata) && Objects.equals(model, other.model)
				&& Objects.equals(name, other.name) && Objects.equals(object, other.object)
				&& Objects.equals(response_format, other.response_format)
				&& Objects.equals(temperature, other.temperature) && Objects.equals(tools, other.tools)
				&& Objects.equals(top_p, other.top_p);
	}
	@Override
	public String toString() {
		return "Assistant [id=" + id + ", object=" + object + ", created_at=" + created_at + ", name=" + name
				+ ", description=" + description + ", model=" + model + ", instructions=" + instructions + ", tools="
				+ tools + ", metadata=" + metadata + ", temperature=" + temperature + ", top_p=" + top_p
				+ ", response_format=" + response_format + "]";
	}
}

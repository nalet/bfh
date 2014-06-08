package ch.bti7055p.controllers;

import javafx.scene.Node;

public final class I18NNodes
{
	private Node element;
	private String key;
	
	public I18NNodes(Node element, String key)
	{
		this.element = element;
		this.key = key;
	}

	public Node getElement()
	{
		return element;
	}

	public void setElement(Node element)
	{
		this.element = element;
	}

	public String getKey()
	{
		return key;
	}

	public void setKey(String key)
	{
		this.key = key;
	}
	
	
}

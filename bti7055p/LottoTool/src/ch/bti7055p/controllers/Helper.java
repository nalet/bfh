package ch.bti7055p.controllers;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class Helper
{
	private Helper()
	{
	}

	public static void applyI18N(String boundle, Locale locale,
			List<I18NNodes> nodes)
	{
		ResourceBundle rb = ResourceBundle.getBundle(boundle, locale);
		for (I18NNodes n : nodes)
		{
			Node node = n.getElement();
			if (node instanceof Label)
			{
				((Label) node).setText(rb.getString(n.getKey()));
			}
			
			if (node instanceof TextField)
			{
				((TextField) node).setText(rb.getString(n.getKey()));
			}
			
			if (node instanceof Button)
			{
				((Button) node).setText(rb.getString(n.getKey()));
			}
		}
	}
}

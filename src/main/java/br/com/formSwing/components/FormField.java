package br.com.formSwing.components;
import javax.swing.JTextField;

import br.com.formSwing.internal.Input;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FormField extends Input{
	private JTextField textField;
	public FormField() {
		initComponents();
	}
	private void initComponents() {
		{
			this.textField = new JTextField();
			this.textField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					errorMessage.setText("");
				}
			});
			panel.add(this.textField, BorderLayout.CENTER);
			this.textField.setColumns(10);
		}
	}
	
	public void setText(String text) {
		this.textField.setText(text);
	}
	
	public String getText() {
		return this.textField.getText();
	}

}

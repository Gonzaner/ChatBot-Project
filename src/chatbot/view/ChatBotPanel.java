package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotAppController;
/**
 * Deceleration section 
 * @author ngon1817
 *
 */
public class ChatBotPanel extends JPanel
{
	private ChatBotAppController baseController;
	
	private JButton startButton;
	private JTextField sampleField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private SpringLayout baseLayout;
	/**
	 * The constructor where we will put everything that is in the deceleration section.
	 * @param baseController
	 */
	public ChatBotPanel(ChatBotAppController baseController)
	{
		this.baseController = baseController;
		startButton = new JButton("Click to start!");
		sampleField = new JTextField(25);
		chatArea = new JTextArea(5,25);
		chatPane = new JScrollPane(chatArea);
		
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, startButton, 8, SpringLayout.SOUTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, startButton, 137, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 55, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -41, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 55, SpringLayout.WEST, this);
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
	}
	/**
	 * Set up the panel, this is where we add things to the panel.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(baseLayout);
		
		this.add(startButton);
		this.add(sampleField);
		this.add(chatPane);
	}
	/**
	 * The dumping ground for all the auto generated Window code.
	 */
	private void setupLayout()
	{	
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 100, SpringLayout.NORTH, this);
		
		
		
		
	}
	/**
	 * Makes buttons do stuff, is very empty right now.
	 */
	private void setupListeners()
	{
		startButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText(sampleField.getText() + "Hello!");
			}

		});
	}

}

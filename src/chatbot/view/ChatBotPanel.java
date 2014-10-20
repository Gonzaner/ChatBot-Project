package chatbot.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatBotAppController;
/**
 * Deceleration section 
 * @author ngon1817
 *
 */
public class ChatBotPanel extends JPanel
{
	private ChatBotAppController baseController;
	
	private JButton sampleButton;
	private JTextField sampleField;
	
	private SpringLayout baseLayout;
	/**
	 * The constructor where we will put everything that is in the deceleration section.
	 * @param baseController
	 */
	public ChatBotPanel(ChatBotAppController baseController)
	{
		this.baseController = baseController;
		sampleButton = new JButton("Click on me please!?");
		sampleField = new JTextField(25);
		
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Set up the panel, this is where we add things to the panel.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(baseLayout);
		
		this.add(sampleButton);
		this.add(sampleField);
	}
	/**
	 * The dumping ground for all the auto generated Window code.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sampleButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sampleField, -41, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sampleField, -90, SpringLayout.EAST, this);
	}
	/**
	 * Makes buttons do stuff, is very empty right now.
	 */
	private void setupListeners()
	{
		
	}

}

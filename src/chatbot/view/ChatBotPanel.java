package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import chatbot.controller.ChatBotAppController;
import java.awt.Font;
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
	private JButton randomButton;
	private JLabel welcomeLabel;
	private JButton smtButton;
	
	/**
	 * The constructor where we will put everything that is in the deceleration section.
	 * @param baseController
	 */
	public ChatBotPanel(ChatBotAppController baseController)
	{
		this.baseController = baseController;
		startButton = new JButton("Click to start!");
		sampleField = new JTextField(30);
		chatArea = new JTextArea(10,30);
		chatPane = new JScrollPane(chatArea);
		randomButton = new JButton("RANDOM!");
		welcomeLabel = new JLabel("Welcome To Chatbot");
		smtButton = new JButton();
		
		
		
		
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
		this.add(randomButton);
		this.add(welcomeLabel);
		this.add(smtButton);
		
		
		
		
		
		
		
	}
	/**
	 * The dumping ground for all the auto generated Window code.
	 */
	private void setupLayout()
	{
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.NORTH, welcomeLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, welcomeLabel, 137, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, welcomeLabel, 33, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, welcomeLabel, -125, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, startButton, 20, SpringLayout.SOUTH, sampleField);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 0, SpringLayout.NORTH, startButton);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -6, SpringLayout.WEST, startButton);
		smtButton = new JButton("SMT");
		baseLayout.putConstraint(SpringLayout.NORTH, smtButton, 20, SpringLayout.SOUTH, sampleField);
		baseLayout.putConstraint(SpringLayout.WEST, smtButton, 315, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, smtButton, -112, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, startButton, -6, SpringLayout.WEST, smtButton);
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setForeground(Color.MAGENTA);
		welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		baseLayout.putConstraint(SpringLayout.NORTH, sampleField, 42, SpringLayout.SOUTH, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, sampleField, 0, SpringLayout.WEST, chatPane);
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 90, SpringLayout.WEST, this);
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
				String userTypedText = sampleField.getText();
				String chatbotResponse = baseController.sendTextToChatBot(userTypedText);
				displayTextToUser(userTypedText);
				displayTextToUser(chatbotResponse);
				sampleField.setText("");
			}

		});
	}

	public void displayTextToUser(String input)
	{
		chatArea.append("\n" + input);
	}
	
	
}

package chatbot.controller;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotFrame;
import chatbot.view.ChatBotPanel;
import chatbot.view.ChatBotView;

/**
 * Application Controller for the ChatBot String manipulation project.
 * Responsible for controlling the View and Model packages
 * 
 * @author ngon1817
 * @version 1.3 10/1/14
 */
public class ChatBotAppController
{
	/**
	 * The GUI view for the application
	 */
	private ChatBotView appView;
	/**
	 * The ChatBot Model instance
	 */
	private ChatBot notSoCleverBot;
	/**
	 * The startup message for out ChatBot application
	 */
	private String startMessage;
	/**
	 * GUI frame for the application
	 */
	private ChatBotFrame baseFrame;

	/**
	 * Creates a ChatBotAppController and initializes the associated View and
	 * Model objects.
	 */
	public ChatBotAppController()
	{
		appView = new ChatBotView(this);
		baseFrame = new ChatBotFrame(this);
		notSoCleverBot = new ChatBot("Mr. Cantare");
		startMessage = "Welcome to the " + notSoCleverBot.getName()
				+ " Chatbot type in your name please";
	}

	/**
	 * Allows other objects access to the notSoCleverbot.
	 * 
	 * @return The ChatBot for this app.
	 */
	public ChatBot getNotSoCleverBot()
	{
		return notSoCleverBot;
	}

	/**
	 * Starts the ChatBot application
	 */
	public void start()
	{	
		ChatBotPanel myAppPanel = (ChatBotPanel)baseFrame.getContentPane();
		myAppPanel.displayTextToUser(startMessage);
					 
	}
	public String sendTextToChatBot(String userInput)
	{
		String respondText = "";
		
		respondText= notSoCleverBot.processText(userInput);
		
		return respondText;
	}

	/**
	 * Quits the ChatBot application with a message to the user that the
	 * application is closing.
	 */
	private void quit()
	{
		appView.displayInformation("Vale,bene fortuna");
		System.exit(0);
	}
}

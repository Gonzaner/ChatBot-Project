package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.ChatBot;
import chatbot.view.ChatBotView;

public class ChatBotAppController
{
	private ChatBotView appView;
	private ChatBot notSoCleverBot;

	/**
	 * Creates a ChatBotAppController and initializes the associated View and
	 * Model objects.
	 */
	public ChatBotAppController()
	{
		appView = new ChatBotView(this);
		notSoCleverBot = new ChatBot("Mr. Cantare");
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
		String message = JOptionPane.showInputDialog(null, "Welcome to Chatbot, type in your name please");

		while (!notSoCleverBot.quitChecker(message))
		{
			message = appView.displayChatBotConverstations(message);
		}

	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Bye");
		System.exit(0);
	}
}

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
	 * Starts the ChatBot application
	 */
	public void start()
	{
		String message = JOptionPane.showInputDialog(null, "Would you like to continue?");
		if(notSoCleverBot.quitChecker(message))
		{
			quit();
		}
		
		JOptionPane.showMessageDialog(null, "We are not done yet");
	}

	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Bye");
		System.exit(0);
	}
}

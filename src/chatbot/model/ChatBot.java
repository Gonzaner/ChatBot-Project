package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;

	/**
	 * Creates a ChatBot object with a specified name. Initializes the total
	 * chats to 0
	 * 
	 * @param name
	 *            The name of the ChatBot.
	 */

	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;

	}

	/**
	 * Gets the name of the ChatBot
	 * 
	 * @return the name of the ChatBot
	 */

	public String getName()
	{
		return name;
	}

	/**
	 * Shows the number of Chats that have occurred. Is initially set to 0
	 * 
	 * @return the current number of chats
	 */
	public int getNumberOfChats()
	{
		return numberOfChats;
	}

	/**
	 * Sets the name of the ChatBot
	 * 
	 * @param name
	 *            The new name for the ChatBot
	 */

	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Retrieves the number of chats and adds 1 to the number of chats
	 */
	public void incrementChats()
	{
		numberOfChats++;
	}

	/**
	 * Checks to see if it is okay to quit the program
	 * 
	 * @param input
	 *            If input is "Goodbye" will set okToQuit to True
	 * @return okToQuit
	 */
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;

		if (input != null && input.equals("Goodbye"))
		{
			okToQuit = true;
		}

		return okToQuit;
	}

}

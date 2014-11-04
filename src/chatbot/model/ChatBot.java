package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private String contentArea;

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

		memeList = new ArrayList<String>();
		fillTheMemeList();

		contentArea = "Persona";
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
	 * Fills the contents of the memeList with internet memes.
	 */
	private void fillTheMemeList()
	{
		memeList.add("y u made bro");
		memeList.add("doh!");
		memeList.add("Winter is coming.");
		memeList.add("one does not simply");
		memeList.add("Nyx face");
		memeList.add("Yosuke");
		memeList.add("Igor");
	}

	/**
	 * Processed the supplied text from the user to provide a message from the
	 * ChatBot.
	 * 
	 * @param userText
	 *            The user supplied text.
	 * @return What the ChatBot says because of the supplied text.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();

		int randomChoice = (int) (Math.random() * 3);
		if (userText != null)
		{
			if(numberOfChats<10)
			{
				//Use if's or a switch
			}
			
			if (randomChoice == 0)
			{
				if (stringLengthChecker(userText))
				{
					processedText = " WHAT THE HELL! Why are you typing so much?! This isn't an essay bro.";
				}
				else
				{
					processedText = "You should type more.";
				}
			}
			else if (randomChoice == 1)
			{
				if (contentChecker(userText))
				{
					processedText = "Oh " + userText
							+ " that's interesting! Let's talk about that ";
					processedText = "Which one is your favorite of the series?";
				}
				else
				{
					processedText = "Have you ever played persona?";

				}
			}
			else
			{
				if (memeChecker(userText))
				{

					processedText = "Hey, you found a meme: " + userText;
					processedText += " Isn't that cool";
				}
				else
				{
					processedText = "Boring, that wasn't a meme. ";
				}
				
		

			}
		}

		return processedText;
	}

	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;
		if (input.length() >= 20)
		{
			isTooLong = true;
		}
		return isTooLong;
	}

	/**
	 * Checks if the supplied String contains the content area of the Chatbot
	 * 
	 * @param input
	 *            The user supplied String
	 * @return Whether the ChatBot's special content area is inside the input
	 *         string
	 */

	private boolean contentChecker(String input)
	{
		boolean hasMyContent = false;

		if (input.contains(contentArea))
		{
			hasMyContent = true;
		}

		return hasMyContent;
	}

	/**
	 * Checks to see if the user text matches any of the memes in the Chatbot's
	 * meme list.
	 * 
	 * @param currentText
	 *            The user supplied text
	 * @return If the String matched any of the built in memes.
	 */

	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;

		for (String currentMeme : memeList)
		{
			if (currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}

		return isAMeme;
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

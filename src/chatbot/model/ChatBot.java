package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ChatBot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private ArrayList<String> contentList;
	/**
	 * Creates a ChatBot object with a specified name. Initializes the total chats to 0
	 * @param name The name of the ChatBot.          
	 */

	public ChatBot(String name)
	{
		this.name = name;
		numberOfChats = 0;
		
		memeList = new ArrayList<String>(); 
		fillTheMemeList();
		contentList = new ArrayList<String>();
		fillTheContentList();
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
	
	private void fillTheContentList()
	{
		contentList.add("Persona");
		contentList.add("");
	}
	
	
	/**
	 *  Processed the supplied text from the user to provide a message from the ChatBot.
	 * @param userText The user supplied text.
	 * @return What the ChatBot says because of the supplied text.
	 */
	public String processText(String userText)
	{
		String processedText = "";
		incrementChats();
		if(contentChecker(userText))
		{
			processedText = "Hey that's cool, let's talk about that!";
		}
		if(memeChecker(userText))
		{
			processedText = "Hey, you found a meme: " + userText;
			processedText += " Isn't that cool";
		}
		
		return processedText;
	}

	
	private boolean contentChecker (String currentText)
	{
		boolean isContent = false;
		if currentText.contains(contentList);
		for(String currentContent : contentList)
		{
			if(currentContent.equalsIgnoreCase(currentText))
			{
				isContent = true;
			}
		}
		
		return isContent;
	}
	
	private boolean memeChecker(String currentText)
	{
		boolean isAMeme = false;
		
		for(String currentMeme : memeList)
		{
			if(currentMeme.equalsIgnoreCase(currentText))
			{
				isAMeme = true;
			}
		}
		
		for(int loopCount = 0; loopCount < memeList.size(); loopCount++)
		{
			if(memeList.get(loopCount).equalsIgnoreCase(currentText))
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

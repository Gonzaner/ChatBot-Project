package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * 
 * @author ngon1817
 * @version 1.4 11/4/4 - Changed GUI reference added a method for MVC
 */
		
public class ChatBot
{
	private String name;
	private int numberOfChats;
	private ArrayList<String> memeList;
	private String contentArea;
	private ArrayList<String> userInputList;
	private ChatUser myUser;

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
		userInputList = new ArrayList<String>();
		contentArea = "Persona";
		myUser = new ChatUser();
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

		int randomChoice = (int) (Math.random() * 6);
		if (userText != null)
		{
			if(numberOfChats<10)
			{
				//you will need to use some if's or a switch
				//Save userText to the chatUser's appropriate field.
				//For items that are not String you will wrapper them
				//like Interger.parseInt(userText) to save as an int
				// or Boolean.parseBoolean(userText)to save as a boolean
				if(numberOfChats == 0)
				{
					myUser.setName (userText);
					processedText = "Hello " + myUser.getName() + " what is your age?";
				}
				else if(numberOfChats == 1)
				{
					int age = Integer.parseInt(userText);
					myUser.setAge(age);
					processedText = myUser.getName() + ", you are really" + myUser.getAge()+"years old?";
					processedText = "\n What is your favorite movie?";
				}
				else if(numberOfChats == 2)
				{
					
				}
				else if(numberOfChats == 3)
				{
					
				}
				else 
				{
					
				}
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
			else if (randomChoice == 2)
			{
				if (memeChecker(userText ))
				{

					processedText = "Hey, you found a meme: " + userText;
					processedText += " Isn't that cool";
				}
				else
				{
					processedText = "Boring, that wasn't a meme. ";
				}

			}
			else if (randomChoice == 3)
			{
				//User based talking
				//Should store a string in processedText from another method say chooseRandomUserInfo(String)
			}
			
			else if (randomChoice == 4)
			{
				userInputList.add(0, userText);
				processedText= "Thanks for the input, "+ myUser.getName();
			}
			
			else
				
			{
				if(userInputChecker(userText))
				{
					processedText = "Random boring text for right now :D";
				}
			}
		}
		incrementChats();
		return processedText;
	}

	private boolean userInputChecker(String input)
	{
		boolean matchesInput = false;
		
		if(userInputList.size() > 0 )
		{
			for(int loopCount =0; loopCount < userInputList.size(); loopCount++)
			{
				if(input.equalsIgnoreCase(userInputList.get(loopCount)))
				{
					matchesInput = true;
					userInputList.remove(loopCount);
					loopCount --;
				}
			}
		}
		
		return matchesInput;
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

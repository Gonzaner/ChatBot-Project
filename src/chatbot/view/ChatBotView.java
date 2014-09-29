package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatBotAppController;

public class ChatBotView
{
	private ChatBotAppController baseController;

	public ChatBotView(ChatBotAppController baseController)
	{
		this.baseController = baseController;
	}

	public String displayChatBotConverstations(String input)
	{
		String output = "";

		output = JOptionPane.showInputDialog(null, baseController.getNotSoCleverBot().getName() + " says hello, " + input + " do you wish to continue?");

		return output;
	}

}

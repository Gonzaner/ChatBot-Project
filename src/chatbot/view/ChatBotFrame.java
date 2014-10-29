package chatbot.view;

import javax.swing.JFrame;

import chatbot.controller.ChatBotAppController;
/**
 * Sets up the frame.
 * @author ngon1817
 *
 */
public class ChatBotFrame extends JFrame
{
	private ChatBotPanel basePanel;
	
	public ChatBotFrame(ChatBotAppController baseController)
	{
		basePanel = new ChatBotPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
}

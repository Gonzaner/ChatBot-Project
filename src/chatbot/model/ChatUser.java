package chatbot.model;

public class ChatUser
{
	private String name;
	/**
	 * this is the age of the user
	 */
	private int age;
	private String favoriteMovie;
	private boolean isPierced;
	private boolean isTattooed;


public ChatUser()
{
	this.name ="";
	this.age = -30;
	this.favoriteMovie = "";
	this.isPierced= false;
	this.isTattooed= false;
	

	}

	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getFavoriteMovie()
	{
		return favoriteMovie;
	}
	
	public String setName(String userText)
	{
		return name;
	}

	public int setAge(int age)
	{
		return age;
	}






}

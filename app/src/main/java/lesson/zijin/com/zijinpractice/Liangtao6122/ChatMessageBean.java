package lesson.zijin.com.zijinpractice.Liangtao6122;


public class ChatMessageBean
{
	private String msg;
	private Type type;

	public enum Type
	{
		INCOMING, OUTCOMING
	}
	
	public ChatMessageBean()
	{
	}
	
	

	public ChatMessageBean(String msg, Type type)
	{
		super();
		this.msg = msg;
		this.type = type;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public Type getType()
	{
		return type;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

}

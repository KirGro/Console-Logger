package basic;

public enum fontColor {
	DEFAULT("\u001B[0m"),
	DEFAULTERROR("\u001B[31m"),
	RESET("\u001B[0m"),
	RED("\u001B[31m"), 
	BLUE("\u001B[34m"),
	BLACK("\u001B[30m"),
	GREEN("\u001B[32m"),
	YELLOW("\u001B[33m"),
	PURPLE("\u001B[35m"),
	CYAN("\u001B[36m"),
	WHITE("\u001B[37m");
	
	private final String c;
	fontColor(String c) {
		this.c=c;
	}
	
	public String c(){return c;}
}

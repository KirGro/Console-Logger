package basic;

public class CLogger {
	public fontColor colorUsing, defaultErrorColor, secondaryColor;
	
	public CLogger(fontColor fc, fontColor ec, fontColor sc) {colorUsing=fc; defaultErrorColor=ec; secondaryColor=sc;}
	public CLogger(fontColor fc, fontColor ec) {this(fc,ec,fontColor.DEFAULT);}
	public CLogger(fontColor fc) {this(fc, fontColor.DEFAULTERROR);}
	public CLogger() {this(fontColor.DEFAULT);}
	
	
	
	public void println(String text) {System.out.println(colorUsing.c()+text);}
	public void println(String text, boolean type) {if(type) plc(text,defaultErrorColor); else plc(text, secondaryColor);}
	public void pl(String text) {println(text);}
	public void pl(String text, boolean type) {println(text, type);}
	
	public void print(String text) {System.out.print(colorUsing.c()+text);}
	public void print(String text, boolean type) {if(type) pc(text,defaultErrorColor); else pc(text, secondaryColor);}	
	public void p(String text) {print(text);}
	public void p(String text, boolean type) {print(text, type);}
	
	
	
	public void printlnColor(String text, fontColor fc) {System.out.println(fc.c()+text);}
	public void printColor(String text, fontColor fc) {System.out.print(fc.c()+text);}
	public void plc(String text, fontColor fc) {printlnColor(text,fc);}
	public void pc(String text, fontColor fc) {printColor(text,fc);}
	
	//Methods for changing and getting font color
	public void useColor(fontColor fc) {colorUsing=fc;}
	public fontColor getColor() {return colorUsing;}
	//Shortened versions
	public void uc(fontColor fc) {useColor(fc);}
	public fontColor gc() {return getColor();}
	
	//Methods for changing and getting error font color
	public void useErrorColor(fontColor fc) {defaultErrorColor=fc;}
	public fontColor getErrorColor() {return defaultErrorColor;}
	//Shortened versions
	public void uec(fontColor fc) {useErrorColor(fc);}
	public fontColor gec() {return getErrorColor();}
}

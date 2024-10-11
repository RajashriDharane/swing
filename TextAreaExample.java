package swing;
import javax.swing.*; 
public class TextAreaExample {
	 
	     TextAreaExample(){  
	        JFrame f= new JFrame();  
	        JTextArea area=new JTextArea("Welcome to javatpoint");  
	        area.setBounds(100,300, 215,220);  
	        f.add(area);  
	        f.setSize(1900,100000);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	     }  
	public static void main(String args[])  
	    {  
	   new TextAreaExample();  
	    }}  



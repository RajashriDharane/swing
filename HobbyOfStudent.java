package swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HobbyOfStudent extends JPanel implements ActionListener,ItemListener {
	//JCheckBox
		JCheckBox ch1=new JCheckBox("Mayuri",false);
		JCheckBox ch2=new JCheckBox("Kamini",false);
		JCheckBox ch3=new JCheckBox("Sakshi",false);
		JCheckBox ch4=new JCheckBox("Komal",false);
		JLabel j1=new JLabel("What's Friend?");
		JButton exitbtn=new JButton("Exit");
		public HobbyOfStudent()
		{
			setLayout(new GridLayout(7,1));
			ch1.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,14));
			ch2.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,14));
			ch3.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,14));
			ch4.setFont(new Font("Arial",Font.BOLD|Font.ITALIC,14));
            ch1.addItemListener(this);
            ch2.addItemListener(this);
            ch3.addItemListener(this);
            ch4.addItemListener(this);
            add(j1);
            add(ch1);
            add(ch2);
            add(ch3);
            add(ch4);
            add(exitbtn);
            exitbtn.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource().equals(exitbtn))
			{
				System.exit(0);
			}
			
			}
		public void itemStateChanged(ItemEvent e)
		{
			String selected=((JCheckBox)e.getSource()).getText();
			System.out.println(selected);
			
			
		}
	}
	

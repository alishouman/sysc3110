package main;




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;


public class MenuFrame extends JFrame implements ActionListener {
	JFrame frame;
	AddressBook addressBook;
	JTextArea area;
	JMenu BuddyInfoMenu;
	JList addressBookView;
	public MenuFrame(){
		super("Address Book");
		//frame=new JFrame("Address Book");
		JMenuBar menuBar = new JMenuBar( );
	   setJMenuBar( menuBar );
	   setSize(400, 300);
	   
	    JMenu AddressBookMenu= new JMenu("Address Book");
	    menuBar.add(AddressBookMenu);
	    BuddyInfoMenu= new JMenu("Buddy Info");
	    BuddyInfoMenu.setEnabled(false);
	    menuBar.add(BuddyInfoMenu);
	    JMenuItem createItem = new JMenuItem( "Create" );
	    AddressBookMenu.add( createItem);
	    createItem.addActionListener( this );
	    createItem.setActionCommand("create");
	    JMenuItem saveItem = new JMenuItem( "Save" );
	    AddressBookMenu.add( saveItem );
	    saveItem.addActionListener( this );
	    saveItem.setActionCommand("save");
	    JMenuItem displayItem = new JMenuItem( "Display" );
	    AddressBookMenu.add( displayItem );
	    displayItem.addActionListener( this );
	    displayItem.setActionCommand("display");
	    JMenuItem addItem = new JMenuItem( "Add" );
	    BuddyInfoMenu.add( addItem );
	    addItem.addActionListener( this );
	    addItem.setActionCommand("add");
	    JMenuItem removeItem = new JMenuItem( "Remove" );
	    BuddyInfoMenu.add( removeItem );
	    removeItem.addActionListener( this );
	    removeItem.setActionCommand("remove");
	    JMenuItem editItem = new JMenuItem( "Edit" );
	    BuddyInfoMenu.add( editItem );
	    editItem.addActionListener( this );
	    editItem.setActionCommand("edit");
	   
	 
	   //area=new JTextArea(5,20);
	 //  add(area);
	  setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals("create")){
			 addressBook=new AddressBook();
			 addressBookView = new JList(addressBook);
			 add(addressBookView);
			  BuddyInfoMenu.setEnabled(true);
		}
if (arg0.getActionCommand().equals("save")){
	String text="" ;
	BufferedWriter out = null;
	/*for(BuddyInfo b:addressBook.getBuddyInfo()){
		text=text+b.toString();
	}*/

	
		
try {
	out = new BufferedWriter(new FileWriter("myFile.txt"));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
try {
	out.write(text);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	out.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


		}
if (arg0.getActionCommand().equals("display")){
	
	//for(BuddyInfo b:addressBook.getBuddyInfo()){
		//area.append(b.toString());
	//}
}
		if (arg0.getActionCommand().equals("add")){
			 String name = JOptionPane.showInputDialog(frame, "What's the Buddy name");
			 String address = JOptionPane.showInputDialog(frame, "What's the Buddy address");
			 String telephone = JOptionPane.showInputDialog(frame, "What's the Buddy telephone");
			 String age = JOptionPane.showInputDialog(frame, "What's the Buddy age");
			 int age1=Integer.parseInt(age);
			 addressBook.addBuddy(new BuddyInfo(name,address,telephone,age1));
		}
		if (arg0.getActionCommand().equals("remove")){
			
			 addressBook.removeBuddy(addressBookView.getSelectedIndex());
		}
		if (arg0.getActionCommand().equals("edit")){
			
			 addressBook.removeBuddy(addressBookView.getSelectedIndex());
			 String name = JOptionPane.showInputDialog(frame, "What's the Buddy name");
			 String address = JOptionPane.showInputDialog(frame, "What's the Buddy address");
			 String telephone = JOptionPane.showInputDialog(frame, "What's the Buddy telephone");
			 String age = JOptionPane.showInputDialog(frame, "What's the Buddy age");
			 int age1=Integer.parseInt(age);
			 addressBook.addBuddy(new BuddyInfo(name,address,telephone,age1));
			 
		}
		
	
		
	}
	public static void main(String[]args){
		MenuFrame f=new MenuFrame();
	}

}

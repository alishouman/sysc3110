package main;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;


public class AddressBook extends DefaultListModel implements Serializable {
AddressBook temp;

		private BufferedWriter writer1;

		//private List<BuddyInfo> buddyInfo;
		public AddressBook(){
		super();//this.buddyInfo=new ArrayList<BuddyInfo>();}
		}
		 /*  private void writeObject(java.io.ObjectOutputStream stream)
		            throws IOException {

				for(int i=0;i<this.size();i++){
				
					  stream.writeObject(this.get(i));
						
				
			
			}
			 
		     
		    }*/

		 /*   private void readObject(java.io.ObjectInputStream stream)
		            throws IOException, ClassNotFoundException {
		    	temp=new AddressBook();
		     temp=(AddressBook) stream.readObject();
		/*	while(stream.available() > 0){
			//	System.out.println("GHHHH");
				 BuddyInfo  buddy = (BuddyInfo) stream.readObject();
			temp.addBuddy(buddy);}*/
		       
		    
		
public void addBuddy(BuddyInfo aBuddyInfo){
	if(aBuddyInfo!=null){
		this.addElement(aBuddyInfo);
		
	}
	
}

public void removeBuddy(int index){
	if(index>=0&& index <this.size()){
		 this.remove(index);
	}

}
public int size(){
	return this.getSize();
}
public void clear(){
	this.clear();
}
public void export1(String file) {



	try {
		ObjectOutputStream p=new ObjectOutputStream(new FileOutputStream(file));
		p.writeObject(this);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}



}
public  AddressBook import2(String file){
temp=new AddressBook();
	try {
		ObjectInputStream p	=new ObjectInputStream(new FileInputStream(file));
		temp=(AddressBook)p.readObject();
		System.out.println(temp);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(temp);
return temp;

}
public void export(String file) {


		try {
			
			writer1 = new BufferedWriter(new FileWriter(file));
			
			for(int i=0;i<this.size();i++){
			
					writer1.write( this.get(i).toString());
					
					writer1.newLine();
					
			
		
		}
			writer1.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	
}
public  AddressBook import1(String file){
	String line; 
	BufferedReader in;
	try {
		in = new BufferedReader(new FileReader(file));
		AddressBook book=new AddressBook();
		 while ((line = in.readLine()) != null) {
			 BuddyInfo buddy=BuddyInfo.import1(line);
			 book.addBuddy(buddy);
		    }
		 return book;
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	

	
	
	
}
public static AddressBook importFromXmlFileSAX(String file)throws Exception{
	DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
	DocumentBuilder d=factory.newDocumentBuilder();
	AddressBook addressBook=new AddressBook();
	File f=new File(file);
	Document doc=d.parse(f);
	NodeList lst= doc.getDocumentElement().getChildNodes();
	for(int ii=0;ii<lst.getLength();ii++){
		Node n= lst.item(ii);
		if(n.getNodeName()=="BuddyInfo"){
			String array[]=n.getTextContent().split("\n");
			BuddyInfo buddy=new BuddyInfo(array[0],array[1],array[2],Integer.parseInt(array[3]));
			addressBook.addBuddy(buddy);
		}
		//System.out.println("Child: "+n.getNodeName()+ "-->"+n.getTextContent());
	}
	return addressBook;
	
	
}
public static void readDOM (File f)throws Exception{
	DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
	DocumentBuilder d=factory.newDocumentBuilder();
	Document doc=d.parse(f);
	System.out.println("Root: "+ doc.getDocumentElement().getNodeName());
	NodeList lst= doc.getDocumentElement().getChildNodes();
	for(int ii=0;ii<lst.getLength();ii++){
		Node n= lst.item(ii);
		System.out.println("Child: "+n.getNodeName()+ "-->"+n.getTextContent());
	}
}
public String toXML(){
	String xml=  "<?xml version='1.0'?>\n"+"<AddressBook>";
	for(int i=0;i<this.size();i++){
		xml=xml+((BuddyInfo) this.get(i)).toXML();
	}
	xml=xml+"\n</AddressBook>";
	return xml;
}
public void ExportToXmlFile(String file){
	try {
		
		writer1 = new BufferedWriter(new FileWriter(file));
		
	
		writer1.write(this.toXML());
		writer1.flush();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public static void main(String[] args) {
	BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
	BuddyInfo buddy1=new BuddyInfo("Joe", "Carleton","5432",30);
	AddressBook addressBook=new AddressBook();
	addressBook.addBuddy(buddy);
	addressBook.addBuddy(buddy1);
	/*ObjectOutputStream p;
	try {
		p = new ObjectOutputStream(new FileOutputStream("addressBook.txt"));
		p.writeObject(addressBook);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}*/
	System.out.println(addressBook.toXML());
	addressBook.ExportToXmlFile("example.xml");
	AddressBook addressBook1=new AddressBook();
	try {
	 addressBook1= importFromXmlFileSAX("example.xml");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	addressBook1.export("example2.txt");
	


}


//public List<BuddyInfo> getBuddyInfo() {
	//return buddyInfo;
//}


//public void setBuddyInfo(List<BuddyInfo> buddyInfo) {
//	this.buddyInfo = buddyInfo;
//}
}

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


public class AddressBook extends DefaultListModel implements Serializable {
AddressBook temp;

		private BufferedWriter writer1;

		//private List<BuddyInfo> buddyInfo;
		public AddressBook(){
		super();//this.buddyInfo=new ArrayList<BuddyInfo>();}
		}
		   private void writeObject(java.io.ObjectOutputStream stream)
		            throws IOException {

				for(int i=0;i<this.size();i++){
				
					  stream.writeObject(this.get(i));
						
				
			
			}
			 
		     
		    }

		    private void readObject(java.io.ObjectInputStream stream)
		            throws IOException, ClassNotFoundException {
		    	temp=new AddressBook();
		     
			while(stream.available() > 0){
				System.out.println("GHHHH");
				 BuddyInfo  buddy = (BuddyInfo) stream.readObject();
			temp.addBuddy(buddy);}
		       
		    }
		
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
	this.writeObject(new ObjectOutputStream(new FileOutputStream(file)));
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}



}
public  AddressBook import2(String file){

	try {
		this.readObject(new ObjectInputStream(new FileInputStream(file)));
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

public static void main(String[] args) {
	BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
	AddressBook addressBook=new AddressBook();
	addressBook.addBuddy(buddy);
	try {
		addressBook.writeObject(new ObjectOutputStream(new FileOutputStream("addressBook.txt")));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


}


//public List<BuddyInfo> getBuddyInfo() {
	//return buddyInfo;
//}


//public void setBuddyInfo(List<BuddyInfo> buddyInfo) {
//	this.buddyInfo = buddyInfo;
//}
}

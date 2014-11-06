import java.util.*;

import javax.swing.DefaultListModel;
import javax.swing.JList;


public class AddressBook extends DefaultListModel {


		//private List<BuddyInfo> buddyInfo;
		public AddressBook(){
		super();//this.buddyInfo=new ArrayList<BuddyInfo>();}
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
public void export(){
	for(int i=0;i<this.size();i++)
		System.out.println(this.get(i));
}
public static void main(String[] args) {
	BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234",20);
	AddressBook addressBook=new AddressBook();
	addressBook.addBuddy(buddy);
	addressBook.export();
	addressBook.removeBuddy(0);
}


//public List<BuddyInfo> getBuddyInfo() {
	//return buddyInfo;
//}


//public void setBuddyInfo(List<BuddyInfo> buddyInfo) {
//	this.buddyInfo = buddyInfo;
//}
}

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
	
public static void main(String[] args) {
	BuddyInfo buddy=new BuddyInfo("Tom", "Carleton","1234");
	AddressBook addressBook=new AddressBook();
	addressBook.addBuddy(buddy);
	addressBook.removeBuddy(0);
}


//public List<BuddyInfo> getBuddyInfo() {
	//return buddyInfo;
//}


//public void setBuddyInfo(List<BuddyInfo> buddyInfo) {
//	this.buddyInfo = buddyInfo;
//}
}


public class BuddyInfo {
private String name;
private String address;
private String telephone;
public BuddyInfo(String name,String address,String telephone){
	this.name=name;
	this.address=address;
	this.telephone=telephone;
}
public boolean equals(BuddyInfo buddy){
	if(this.name.equals(buddy.getName())&&this.address.equals(buddy.getAddress())&&this.telephone.equals(buddy.getTelephone())){
		return true;
	}
		return false;
	
}
public String toString(){
	return "Name is "+this.name+", address is "+this.address+", and telephone is "+this.telephone+"\n";
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}
}

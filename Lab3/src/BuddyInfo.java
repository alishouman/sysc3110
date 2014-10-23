
public class BuddyInfo {
private String name;
private String address;
private String telephone;
private int age;
public BuddyInfo(String name,String address,String telephone,int age){
	this.name=name;
	this.address=address;
	this.telephone=telephone;
	this.age=age;
}
public BuddyInfo(BuddyInfo buddy){
	this.name=buddy.name;
	this.address=buddy.address;
	this.telephone=buddy.telephone;
	this.age=buddy.age;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean equals(BuddyInfo buddy){
	if(this.name.equals(buddy.getName())&&this.address.equals(buddy.getAddress())&&this.telephone.equals(buddy.getTelephone())){
		return true;
	}
		return false;
	
}
public String toString(){
	return "Name is "+this.name+", address is "+this.address+", and telephone is "+this.telephone;
	
}
public String greeting(){
	return this.name+" Says Hi my friend";
}
public Boolean isOver18(){
	if (this.getAge()>18){
		
		return true;
	}
	return false;
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

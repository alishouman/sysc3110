import java.io.Serializable;
import java.util.Scanner;


public class BuddyInfo implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
private String address;
private String telephone;
private int age;
private static Scanner sc;
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
	return this.name+"-"+this.address+"-"+this.telephone+"-"+this.age;
	
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
public static BuddyInfo import1(String s){
	String array[]=s.split("-");
	String name=null,address=null,telephone = null;
	int age=0;
	
	 name=array[0];
	
			 address=array[1];
			 telephone=array[2];
			 age=Integer.parseInt(array[3]);

	BuddyInfo buddy=new BuddyInfo(name,address,telephone,age);
	return buddy;
	
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
public static void main(String[]args){
	BuddyInfo buddy=import1("Tom-Carleton-1234-12");
	System.out.println(buddy);
}
}

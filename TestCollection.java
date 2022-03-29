package com.tried.off;
import java.util.ArrayList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {

		Address address1 = new Address(1,"address1");
		Address address2 = new Address(2,"address2");
		
		List<Address> addressList = new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);
		
		Person person = new Person(1,addressList);
		
		//List<Address> tmpAddressList = new ArrayList<>();
		//tmpAddressList.addAll(person.addressList);
		
		List<Address> tmpAddressList = person.addressList;
		
		person.addressList.clear();
		
		System.out.println(person);
	}

}

class Person{
	int id;
	List<Address> addressList;
	Person(int id,List<Address> addressList){
		this.id =id;
		this.addressList= addressList;
	}
	public String toString() {
		return id +" : \n"+addressList+" : \n";
	}
}

class Address{
	int id;
	String street;
	Address(int id,String street){
		this.id =id;
		this.street=street;
	}
	
	public String toString() {
		return id +" : "+street+"\n";
	}
}

package CustomExceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person p;
	public PersonException(Person p){
		super();
		this.p=p;
		
	}
	public Person getp(){
		return p;
	}
	private phone_number ph;
	
}

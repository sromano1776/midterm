package CustomExceptions;

import com.cisc181.core.Person;

public class PhoneException extends Exception {
	private Person p;
	public PhoneException(Person p){
		super();
		this.p=p;
		
	}
	public Person getp(){
		return p;
	}
}

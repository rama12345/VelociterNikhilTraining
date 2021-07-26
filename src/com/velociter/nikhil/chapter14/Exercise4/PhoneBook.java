package com.velociter.nikhil.chapter14.Exercise4;
import java.io.Serializable;
import java.util.HashMap;

public class PhoneBook implements Serializable {

	private static final long serialVersionUID = 1L;
	// add the entry to person.
	public void addEntry(BookEntry entry) {
		phonebook.put(entry.getPerson(), entry);
	}
	// get the entry from person.
	public BookEntry getEntry(Person key) {
		return phonebook.get(key);
	}
	// get the number entry to person.
	public PhoneNumber getNumber(Person key) {
		return getEntry(key).getNumber();
	}
	// create an hashmap of person and book entry.
	private HashMap<Person, BookEntry> phonebook = new HashMap<Person, BookEntry>();

}
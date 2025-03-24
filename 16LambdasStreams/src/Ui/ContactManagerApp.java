package Ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import Model.Contact;
import Model.TestContact;
import util.MyConsole;

public class ContactManagerApp
{

	public static void main(String[] args)
		{
			MyConsole.printHeader("Contact Manager With Lambdas");
			// Create a list of contacts
			List<Contact> contacts = new ArrayList<>();
			contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
			contacts.add(new Contact("Anne Boehm", null, null));
			contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
			
			//show all contacts========================================================
			displayContacts(contacts, "All Contacts");
			
			//show contacts missing phone numbers==================================
			//List<Contact> contactsNoPhone = filterContacts(contacts, c -> c.getPhone() == null);
			List<Contact> contactsNoPhone = filterContacts(contacts, c -> {return c.getPhone() == null;});
			displayContacts(contactsNoPhone, "Contacts Missing Phone Numbers");
			
			 //show contacts missing email addresses==================================
			List<Contact> contactsNoEmail = filterContacts(contacts, c -> c.getEmail() == null);

			displayContacts(contactsNoEmail, "Contacts Missing Email Addresses");
			
			//show contacts missing email and phone numbers==================================
			List<Contact> contactsNoEmailAndPhone = filterContacts(contacts, c -> c.getEmail() == null && c.getPhone() == null);
			
			displayContacts(contactsNoEmailAndPhone, "\nContacts Missing Email and Phone Numbers");			
			
			//show contacts with last name Murach==================================
			List<Contact> contactsWithLastNameMurach = filterContacts(contacts, (Contact c) -> 
				//split name in array of 2 strings
			//String[] names = c.getName().split(" ");
			//return names[1].equals("Murach");
			{return c.getName().contains("Murach");
				});
			
			displayContacts(contactsWithLastNameMurach, "\nContacts with Last Name Murach");
			
			// print the names of all contacts=========================================
			MyConsole.printL("\n======Names of All Contacts======");
			processContacts(contacts, c -> MyConsole.printL(c.getName()));
			
			//change the names in the contact list  to uppercase
			processContacts(contacts, c -> c.setName(c.getName().toUpperCase()));
			MyConsole.printL("\n======Names of All Contacts Uppercase======");
			processContacts(contacts, c -> MyConsole.printL(c.getName()));
			
			//transform the contacts to a list of names
			MyConsole.printHeader("contact strings (name + phone) with default values if phone is NULL");
			List<String> contactPhonenumbers = transformContacts (contacts, 
					c -> 
				{
					String phone = (c.getPhone()==null) ? "n/a" : c.getPhone();
					return c.getName() + ": " + phone;				
				});
			//for loop to print strings=========================================
			for (String s : contactPhonenumbers)
				{
					MyConsole.printL(s);
				}
			//pg 551 use streams to do the same thing
			MyConsole.printHeader("use streams to print phone info:");
			contactPhonenumbers.stream().forEach(s -> MyConsole.printL(s));
			
			//BONUS: streams on arrays? No, but you can convert to a list first
			String[] names = {"Jim", "Bob", "Joe"};
			List<String> namesList = Arrays.asList(names);
			namesList.forEach(n -> MyConsole.printL(n));
			
			//make names uppercase - didnt work
//			namesList.stream().forEach(s -> s.toUpperCase());
//			namesList.forEach(s -> MyConsole.printL(s));
			
			//use a stream to filter a list and process each element=========================================
			contacts.stream()
					.filter(c -> c.getPhone() == null)
					.forEach(c -> MyConsole.printL(c.getName()));
			
			// use a stream to filter a list and collect the items in a new list=========================================
			List<Contact> contactsNoPhone2 = contacts.stream()
					.filter(c -> c.getPhone() == null)
					.collect(Collectors.toList());
			
			contactsNoPhone2.stream().forEach(c -> MyConsole.printL(c.toString()));
			
			//p 553 - map
			//using stream to transform a list of contacts to a list of strings(names)
			List<String> contactNames = contacts.stream()
					.map(c -> c.getName())
					.collect(Collectors.toList());
					
			MyConsole.printL("map to string");
			contactNames.stream().forEach(str -> MyConsole.printL(str));
			
			//same example with :: operator
			List<String> contactNames2 = contacts.stream()
					.map(Contact::getName)
					.collect(Collectors.toList());
					
			MyConsole.printL("map to string 2");
			contactNames2.stream().forEach(MyConsole::printL);
			
			// p555 - reduce contacts to a  single string
			String csv = contacts.stream().map(c -> c.getName()).reduce("", (a, b) -> a + b + ", ");
			MyConsole.printHeader("csv - map reduce");
			csv = csv.substring(0, csv.length()-2);
			MyConsole.printL("csv = "+csv);
			
			List<Double> prices = new ArrayList<>(Arrays.asList(11059.32, 23456.0, 31789.8, 1111.11, 40123.5));
			
			//get the largest price in the list
			double maxPrice = prices.stream().reduce(0.0, (a, b) -> Math.max(a,  b));
			MyConsole.printL("Max price = "+maxPrice);
			
			// method reference
			double minPrice = prices.stream().reduce(Double.MAX_VALUE, Math::min);
			MyConsole.printL("Min price = "+minPrice);
			
			
			
			
			MyConsole.printL("\n======Goodbye=======");
		}

	//p 547 - functional interface ==========================================================
	private static List<String> transformContacts(List<Contact> contacts, Function<Contact, String> function)
		{
			List<String> strings = new ArrayList<>();
			for (Contact c : contacts)
			{
				strings.add(function.apply(c));
			}
			return strings;
		}

	private static void displayContacts(List<Contact> contacts, String header)
		{
			MyConsole.printHeader(header, "-");
			for (Contact c : contacts)
			{
				MyConsole.printL(c.toString());
			}
		}

	//p 543 - predicate
	//private static List<Contact> filterContacts(List<Contact> contacts, TestContact condition)
	private static List<Contact> filterContacts(List<Contact> contacts, Predicate<Contact> condition)
		{
			List<Contact> filteredContacts = new ArrayList<>();
			for (Contact c : contacts)
			{
				if (condition.test(c))
				{
					filteredContacts.add(c);
				}
			}
			return filteredContacts;
		}

	//p 545 - consumer
	private static void processContacts(List<Contact> contacts, Consumer<Contact> consumer)
		{
			for (Contact c : contacts)
			{
				consumer.accept(c);
			}
		}
}

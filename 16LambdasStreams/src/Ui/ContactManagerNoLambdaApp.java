package Ui;

import java.util.ArrayList;
import java.util.List;

import Model.Contact;
import util.MyConsole;

public class ContactManagerNoLambdaApp
{

	public static void main(String[] args)
		{
			MyConsole.printHeader("Contact Manager No Lambda");
			// Create a list of contacts
			List<Contact> contacts = new ArrayList<>();
			contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
			contacts.add(new Contact("Anne Boehm", null, null));
			contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
			
			//show all contacts========================================================
			displayContacts(contacts, "All Contacts");
			
			//show contacts missing phone numbers==================================
			List<Contact> contactsNoPhone = new ArrayList<>();
			for (Contact c : contacts)
				{
					if (c.getPhone() == null)
						{
							contactsNoPhone.add(c);
						}
				}
			displayContacts(contactsNoPhone, "Contacts Missing Phone Numbers");
			
			 //show contacts missing email addresses==================================
			List<Contact> contactsNoEmail = new ArrayList<>();
			for (Contact c : contacts)
				{
					if (c.getEmail() == null)
						{
							contactsNoEmail.add(c);
						}
				}
			displayContacts(contactsNoEmail, "Contacts Missing Email Addresses");
			
			
			
			
			
			
			
			
			MyConsole.printL("======Goodbye=======");
		}
	private static void displayContacts(List<Contact> contacts, String header)
		{
			MyConsole.printHeader(header, "-");
			for (Contact c : contacts)
				{
					MyConsole.printL(c.toString());
				}
		}

}

package home.blackharold.xml;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import nu.xom.*;

public class Person {
	private String first, last, address;

	public Person(String first, String last, String address) {
		super();
		this.first = first;
		this.last = last;
		this.address = address;
	}

	public Element getXML() {
		Element person = new Element("person");
		Element firstName = new Element("first");
		firstName.appendChild(first);
		Element lastName = new Element("last");
		lastName.appendChild(last);
		Element homeAddress = new Element("address");
		homeAddress.appendChild(address);

		person.appendChild(firstName);
		person.appendChild(lastName);
		person.appendChild(homeAddress);
		return person;
	}

	public Person(Element person) {
		first = person.getFirstChildElement("first").getValue();
		last = person.getFirstChildElement("last").getValue();
		address = person.getFirstChildElement("address").getValue();
	}

	public String toString() {

		if (address == null)
			address = "null";
		return "\n" + first + " " + last + " : " + address;
	}

	public static void format(OutputStream os, Document doc) throws IOException {
		Serializer serializer = new Serializer(os, "ISO-8859-1");
		serializer.setIndent(4);
		serializer.setMaxLength(60);
		serializer.write(doc);
		serializer.flush();
	}

	public static void main(String[] args) throws IOException {
		List<Person> people = Arrays.asList(new Person("Dr. Bunsen", "Honeydew", null),
				new Person("Gonzo", "The Great", "St.-Petersburg, ul. Chaykovskogo, 22-13"),
				new Person("Phillip J.", "Fry", "USA, Colorado state, NY, Fleetwood drive, 17"));

		System.out.println(people);
		Element root = new Element("people");

		for (Person person : people) {
			root.appendChild(person.getXML());
		}
		Document doc = new Document(root);
		format(System.out, doc);
		format(new BufferedOutputStream(new FileOutputStream("philosophy_java/src/home/blackharold/xml/People.xml")),
				doc);
	}
}

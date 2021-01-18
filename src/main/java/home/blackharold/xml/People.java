package home.blackharold.xml;

import java.io.IOException;
import java.util.ArrayList;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

public class People extends ArrayList<Person> {

	public People(String filename) throws ValidityException, ParsingException, IOException {
		Document doc = new Builder().build(filename);
		Elements elements = doc.getRootElement().getChildElements();

		for (int i = 0; i < elements.size(); i++) {
			add(new Person(elements.get(i)));
		}
	}

	public static void main(String[] args) throws ValidityException, ParsingException, IOException {
		People people = new People("philosophy_java/src/home/blackharold/xml/People.xml");
		System.out.println(people);
	}

}

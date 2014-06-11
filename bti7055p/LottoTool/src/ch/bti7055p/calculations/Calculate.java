package ch.bti7055p.calculations;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Calculate {

	public static void start(String xsd_location, String xml_location) {
		try {
			JAXBContext jc = JAXBContext
					.newInstance("ch.bti7055p.calculations");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			SchemaFactory schemaFactory = SchemaFactory
					.newInstance("http://www.w3.org/2001/XMLSchema");

			Schema schema = schemaFactory.newSchema(new File(xsd_location));

			unmarshaller.setSchema(schema);

			Tickets tickets = (Tickets) unmarshaller.unmarshal(new File(
					xml_location));

			for (Tickets.Ticket t : tickets.ticket) {
				System.out.println(t);
			}

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void start(String xsd_location, String[] xml_location) {

	}

	public class Settings {
		
	}
	
	public class Result {

	}

}

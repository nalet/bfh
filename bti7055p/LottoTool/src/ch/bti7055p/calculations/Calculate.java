package ch.bti7055p.calculations;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

import ch.bti7055p.calculations.TicketType.Plays.Play;
import ch.bti7055p.calculations.TicketType.SuperStars.SuperStar;

public class Calculate {

	private String xsd_location;
	private String[] xml_location;
	private Settings settings;

	public Calculate(String xsd_location, String[] xml_location,
			Settings settings) {
		this.xsd_location = xsd_location;
		this.xml_location = xml_location;
		this.settings = settings;
	}

	public Result work() {
		Result result = new Result();

		try {
			JAXBContext jc = JAXBContext
					.newInstance("ch.bti7055p.calculations");
			Unmarshaller unmarshaller = jc.createUnmarshaller();

			SchemaFactory schemaFactory = SchemaFactory
					.newInstance("http://www.w3.org/2001/XMLSchema");

			if (xsd_location != null) {
				Schema schema = schemaFactory.newSchema(new File(
						this.xsd_location));
				unmarshaller.setSchema(schema);
			}

			for (String fl : this.xml_location) {

				Tickets tickets = (Tickets) unmarshaller
						.unmarshal(new File(fl));
				for (Tickets.Ticket t : tickets.ticket) {

					for (Play p : t.getPlays().play) {
						try {
							if (p.numbers.number.get(0) == settings.number_1
									&& p.numbers.number.get(1) == settings.number_2
									&& p.numbers.number.get(2) == settings.number_3
									&& p.numbers.number.get(3) == settings.number_4
									&& p.numbers.number.get(4) == settings.number_5) {
								result.valid_numbers += 1;
								
								result.your_numbers_1 = p.numbers.number.get(0);
								result.your_numbers_2 = p.numbers.number.get(1);
								result.your_numbers_3 = p.numbers.number.get(2);
								result.your_numbers_4 = p.numbers.number.get(3);
								result.your_numbers_5 = p.numbers.number.get(4);
								
								
							}
						} catch (IndexOutOfBoundsException e) {

						}
						
						try {
							if (p.stars.star.get(0) == settings.star_1 &&
									p.stars.star.get(1) == settings.star_2	) {
								result.valid_star_numbers += 1;
								result.your_star_number_1 = p.stars.star.get(0);
								result.your_star_number_2 = p.stars.star.get(1);
							}
							
						} catch (IndexOutOfBoundsException e) { }
						
					}

					for (SuperStar su : t.superStars.superStar) {
						if (su.value.equals(settings.super_star)) {
							result.valid_superstars += 1;
						}
					}
					
					try {
						result.your_super_star_1 = t.superStars.superStar.get(0).value;
						result.your_super_star_2 = t.superStars.superStar.get(1).value;
						result.your_super_star_3 = t.superStars.superStar.get(2).value;
						result.your_super_star_4 = t.superStars.superStar.get(3).value;
					} catch (IndexOutOfBoundsException e) { }
				}
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

		return result;
	}

	public static class Settings {
		public String super_star;
		public int star_1;
		public int star_2;
		public int number_1;
		public int number_2;
		public int number_3;
		public int number_4;
		public int number_5;
	}

	public static class Result {
		public int valid_superstars = 0;
		public int valid_star_numbers = 0;
		public int valid_numbers = 0;
		
		public int your_numbers_1;
		public int your_numbers_2;
		public int your_numbers_3;
		public int your_numbers_4;
		public int your_numbers_5;
		
		public String your_super_star_1;
		public String your_super_star_2;
		public String your_super_star_3;
		public String your_super_star_4;
		
		public int your_star_number_1;
		public int your_star_number_2;
		
	}

}

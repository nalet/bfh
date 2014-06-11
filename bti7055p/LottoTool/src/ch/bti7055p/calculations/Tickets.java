//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.11 at 11:06:16 AM CEST 
//


package ch.bti7055p.calculations;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="ticket">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{https://raw.githubusercontent.com/nalet/bfh/master/bti7055p/LottoTool/ticketType}ticketType">
 *                 &lt;attribute name="ticketId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ticket"
})
@XmlRootElement(name = "tickets", namespace = "https://raw.githubusercontent.com/nalet/bfh/master/bti7055p/LottoTool/tickets")
public class Tickets {

    @XmlElement(namespace = "https://raw.githubusercontent.com/nalet/bfh/master/bti7055p/LottoTool/tickets")
    protected List<Tickets.Ticket> ticket;

    /**
     * Gets the value of the ticket property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticket property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicket().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tickets.Ticket }
     * 
     * 
     */
    public List<Tickets.Ticket> getTicket() {
        if (ticket == null) {
            ticket = new ArrayList<Tickets.Ticket>();
        }
        return this.ticket;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{https://raw.githubusercontent.com/nalet/bfh/master/bti7055p/LottoTool/ticketType}ticketType">
     *       &lt;attribute name="ticketId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ticket
        extends TicketType
    {

        @XmlAttribute(name = "ticketId", required = true)
        protected int ticketId;

        /**
         * Gets the value of the ticketId property.
         * 
         */
        public int getTicketId() {
            return ticketId;
        }

        /**
         * Sets the value of the ticketId property.
         * 
         */
        public void setTicketId(int value) {
            this.ticketId = value;
        }

    }

}

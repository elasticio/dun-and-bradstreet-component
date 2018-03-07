
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubsequentEventDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsequentEventDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubsequentEventNonPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="SubsequentEventLocationText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="240"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubsequentEventPlannedTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsequentEventDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subsequentEventNonPaymentAmount",
    "subsequentEventLocationText",
    "subsequentEventPlannedTimestamp"
})
public class SubsequentEventDetail {

    @XmlElement(name = "SubsequentEventNonPaymentAmount")
    protected AmountType subsequentEventNonPaymentAmount;
    @XmlElement(name = "SubsequentEventLocationText")
    protected String subsequentEventLocationText;
    @XmlElement(name = "SubsequentEventPlannedTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subsequentEventPlannedTimestamp;

    /**
     * Gets the value of the subsequentEventNonPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSubsequentEventNonPaymentAmount() {
        return subsequentEventNonPaymentAmount;
    }

    /**
     * Sets the value of the subsequentEventNonPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSubsequentEventNonPaymentAmount(AmountType value) {
        this.subsequentEventNonPaymentAmount = value;
    }

    /**
     * Gets the value of the subsequentEventLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsequentEventLocationText() {
        return subsequentEventLocationText;
    }

    /**
     * Sets the value of the subsequentEventLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentEventLocationText(String value) {
        this.subsequentEventLocationText = value;
    }

    /**
     * Gets the value of the subsequentEventPlannedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubsequentEventPlannedTimestamp() {
        return subsequentEventPlannedTimestamp;
    }

    /**
     * Sets the value of the subsequentEventPlannedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubsequentEventPlannedTimestamp(XMLGregorianCalendar value) {
        this.subsequentEventPlannedTimestamp = value;
    }

}

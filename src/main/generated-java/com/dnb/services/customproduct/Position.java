
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of a job that is or was held by the principal or manager using D&B standardized codes.  For instance, whether the position has been described to D&B as Financial Director, Finance Director, or Director of Finance, it will be mapped to a single code described as Financial Director.
 *          
 * 
 * <p>Java class for Position complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Position">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PositionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="PositionClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PositionStandingText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExpirationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="StartedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "positionText",
    "positionClassText",
    "positionStandingText",
    "startDate",
    "endDate",
    "endedByDate",
    "displaySequence",
    "expirationDate",
    "startedByDate"
})
public class Position {

    @XmlElement(name = "PositionText", required = true)
    protected DNBDecodedStringType positionText;
    @XmlElement(name = "PositionClassText")
    protected DNBDecodedStringType positionClassText;
    @XmlElement(name = "PositionStandingText")
    protected DNBDecodedStringType positionStandingText;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "ExpirationDate")
    protected DNBDateType expirationDate;
    @XmlElement(name = "StartedByDate")
    protected DNBDateType startedByDate;

    /**
     * Gets the value of the positionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPositionText() {
        return positionText;
    }

    /**
     * Sets the value of the positionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPositionText(DNBDecodedStringType value) {
        this.positionText = value;
    }

    /**
     * Gets the value of the positionClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPositionClassText() {
        return positionClassText;
    }

    /**
     * Sets the value of the positionClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPositionClassText(DNBDecodedStringType value) {
        this.positionClassText = value;
    }

    /**
     * Gets the value of the positionStandingText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPositionStandingText() {
        return positionStandingText;
    }

    /**
     * Sets the value of the positionStandingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPositionStandingText(DNBDecodedStringType value) {
        this.positionStandingText = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartDate(DNBDateType value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndDate(DNBDateType value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getEndedByDate() {
        return endedByDate;
    }

    /**
     * Sets the value of the endedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setEndedByDate(DNBDateType value) {
        this.endedByDate = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setExpirationDate(DNBDateType value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the startedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getStartedByDate() {
        return startedByDate;
    }

    /**
     * Sets the value of the startedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setStartedByDate(DNBDateType value) {
        this.startedByDate = value;
    }

}

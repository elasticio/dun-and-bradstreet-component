
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ResponsibleArea" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponsibleArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StartedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="EndedByDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingTypeForPrincipal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalAssociation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "startDate",
    "endDate",
    "organizationName",
    "position",
    "displaySequence",
    "operatingStatusText",
    "responsibleArea",
    "startedByDate",
    "endedByDate",
    "dnbStandardRating"
})
public class PrincipalAssociation {

    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "EndDate")
    protected DNBDateType endDate;
    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "ResponsibleArea")
    protected List<ResponsibleArea> responsibleArea;
    @XmlElement(name = "StartedByDate")
    protected DNBDateType startedByDate;
    @XmlElement(name = "EndedByDate")
    protected DNBDateType endedByDate;
    @XmlElement(name = "DNBStandardRating")
    protected DNBStandardRatingTypeForPrincipal dnbStandardRating;

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
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setOrganizationName(OrganizationName value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
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
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

    /**
     * Gets the value of the responsibleArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsibleArea }
     * 
     * 
     */
    public List<ResponsibleArea> getResponsibleArea() {
        if (responsibleArea == null) {
            responsibleArea = new ArrayList<ResponsibleArea>();
        }
        return this.responsibleArea;
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
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public DNBStandardRatingTypeForPrincipal getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public void setDNBStandardRating(DNBStandardRatingTypeForPrincipal value) {
        this.dnbStandardRating = value;
    }

}

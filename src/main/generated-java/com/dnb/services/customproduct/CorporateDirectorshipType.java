
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateDirectorshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateDirectorshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingTypeForPrincipal" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameTypeForPrimaryRegistered" minOccurs="0"/>
 *         &lt;element name="PrincipalPosition" type="{http://services.dnb.com/CustomProductServiceV2.0}PositionForCorporateDirectorship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponsibleArea" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponsibleAreaForCorporateDirectorship" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateDirectorshipType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "dnbStandardRating",
    "operatingStatusText",
    "organizationName",
    "principalPosition",
    "responsibleArea"
})
public class CorporateDirectorshipType {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "DNBStandardRating")
    protected DNBStandardRatingTypeForPrincipal dnbStandardRating;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "OrganizationName")
    protected OrganizationNameTypeForPrimaryRegistered organizationName;
    @XmlElement(name = "PrincipalPosition")
    protected List<PositionForCorporateDirectorship> principalPosition;
    @XmlElement(name = "ResponsibleArea")
    protected List<ResponsibleAreaForCorporateDirectorship> responsibleArea;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
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
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationNameTypeForPrimaryRegistered }
     *     
     */
    public OrganizationNameTypeForPrimaryRegistered getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationNameTypeForPrimaryRegistered }
     *     
     */
    public void setOrganizationName(OrganizationNameTypeForPrimaryRegistered value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the principalPosition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalPosition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionForCorporateDirectorship }
     * 
     * 
     */
    public List<PositionForCorporateDirectorship> getPrincipalPosition() {
        if (principalPosition == null) {
            principalPosition = new ArrayList<PositionForCorporateDirectorship>();
        }
        return this.principalPosition;
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
     * {@link ResponsibleAreaForCorporateDirectorship }
     * 
     * 
     */
    public List<ResponsibleAreaForCorporateDirectorship> getResponsibleArea() {
        if (responsibleArea == null) {
            responsibleArea = new ArrayList<ResponsibleAreaForCorporateDirectorship>();
        }
        return this.responsibleArea;
    }

}

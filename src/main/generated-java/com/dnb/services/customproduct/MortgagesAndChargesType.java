
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MortgagesAndChargesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgagesAndChargesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingStatusText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FilingAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="FilingClosedDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/CustomProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalDetailText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CourtDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CourtType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgagesAndChargesType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "filingIdentifier",
    "filingStatusText",
    "filingAmount",
    "filingClosedDate",
    "rolePlayer",
    "additionalDetailText",
    "courtDetails"
})
public class MortgagesAndChargesType {

    @XmlElement(name = "FilingTypeText")
    protected Object filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingIdentifier")
    protected String filingIdentifier;
    @XmlElement(name = "FilingStatusText")
    protected String filingStatusText;
    @XmlElement(name = "FilingAmount")
    protected AmountType filingAmount;
    @XmlElement(name = "FilingClosedDate")
    protected DNBDateType filingClosedDate;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "AdditionalDetailText")
    protected String additionalDetailText;
    @XmlElement(name = "CourtDetails")
    protected CourtType courtDetails;

    /**
     * Gets the value of the filingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFilingTypeText() {
        return filingTypeText;
    }

    /**
     * Sets the value of the filingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFilingTypeText(Object value) {
        this.filingTypeText = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDate(DNBDateType value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the filingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingIdentifier() {
        return filingIdentifier;
    }

    /**
     * Sets the value of the filingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingIdentifier(String value) {
        this.filingIdentifier = value;
    }

    /**
     * Gets the value of the filingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingStatusText() {
        return filingStatusText;
    }

    /**
     * Sets the value of the filingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingStatusText(String value) {
        this.filingStatusText = value;
    }

    /**
     * Gets the value of the filingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFilingAmount() {
        return filingAmount;
    }

    /**
     * Sets the value of the filingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFilingAmount(AmountType value) {
        this.filingAmount = value;
    }

    /**
     * Gets the value of the filingClosedDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingClosedDate() {
        return filingClosedDate;
    }

    /**
     * Sets the value of the filingClosedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingClosedDate(DNBDateType value) {
        this.filingClosedDate = value;
    }

    /**
     * Gets the value of the rolePlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingPartyType }
     * 
     * 
     */
    public List<FilingPartyType> getRolePlayer() {
        if (rolePlayer == null) {
            rolePlayer = new ArrayList<FilingPartyType>();
        }
        return this.rolePlayer;
    }

    /**
     * Gets the value of the additionalDetailText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDetailText() {
        return additionalDetailText;
    }

    /**
     * Sets the value of the additionalDetailText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDetailText(String value) {
        this.additionalDetailText = value;
    }

    /**
     * Gets the value of the courtDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CourtType }
     *     
     */
    public CourtType getCourtDetails() {
        return courtDetails;
    }

    /**
     * Sets the value of the courtDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourtType }
     *     
     */
    public void setCourtDetails(CourtType value) {
        this.courtDetails = value;
    }

}

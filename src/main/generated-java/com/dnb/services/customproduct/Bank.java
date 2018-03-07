
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Bank complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bank">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="PrimaryBankIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankAccount" type="{http://services.dnb.com/CustomProductServiceV2.0}BankAccount" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BankExperienceSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}BankExperienceSummary" minOccurs="0"/>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/CustomProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="BankIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}BankIdentificationNumberDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bank", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationName",
    "location",
    "primaryBankIndicator",
    "bankAccount",
    "bankExperienceSummary",
    "telecommunication",
    "bankIdentificationNumberDetail"
})
public class Bank {

    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "PrimaryBankIndicator")
    protected Boolean primaryBankIndicator;
    @XmlElement(name = "BankAccount")
    protected List<BankAccount> bankAccount;
    @XmlElement(name = "BankExperienceSummary")
    protected BankExperienceSummary bankExperienceSummary;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "BankIdentificationNumberDetail")
    protected List<BankIdentificationNumberDetailType> bankIdentificationNumberDetail;

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the primaryBankIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryBankIndicator() {
        return primaryBankIndicator;
    }

    /**
     * Sets the value of the primaryBankIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryBankIndicator(Boolean value) {
        this.primaryBankIndicator = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankAccount }
     * 
     * 
     */
    public List<BankAccount> getBankAccount() {
        if (bankAccount == null) {
            bankAccount = new ArrayList<BankAccount>();
        }
        return this.bankAccount;
    }

    /**
     * Gets the value of the bankExperienceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link BankExperienceSummary }
     *     
     */
    public BankExperienceSummary getBankExperienceSummary() {
        return bankExperienceSummary;
    }

    /**
     * Sets the value of the bankExperienceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankExperienceSummary }
     *     
     */
    public void setBankExperienceSummary(BankExperienceSummary value) {
        this.bankExperienceSummary = value;
    }

    /**
     * Gets the value of the telecommunication property.
     * 
     * @return
     *     possible object is
     *     {@link Telecommunication }
     *     
     */
    public Telecommunication getTelecommunication() {
        return telecommunication;
    }

    /**
     * Sets the value of the telecommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telecommunication }
     *     
     */
    public void setTelecommunication(Telecommunication value) {
        this.telecommunication = value;
    }

    /**
     * Gets the value of the bankIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankIdentificationNumberDetailType }
     * 
     * 
     */
    public List<BankIdentificationNumberDetailType> getBankIdentificationNumberDetail() {
        if (bankIdentificationNumberDetail == null) {
            bankIdentificationNumberDetail = new ArrayList<BankIdentificationNumberDetailType>();
        }
        return this.bankIdentificationNumberDetail;
    }

}

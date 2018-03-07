
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankAccountNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/CustomProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="BankReference" type="{http://services.dnb.com/CustomProductServiceV2.0}BankReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BankContact" type="{http://services.dnb.com/CustomProductServiceV2.0}BankContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccount", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "bankAccountNumber",
    "primaryAddress",
    "telecommunication",
    "bankReference",
    "bankContact"
})
public class BankAccount {

    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "PrimaryAddress")
    protected List<PrimaryAddressType> primaryAddress;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "BankReference")
    protected List<BankReference> bankReference;
    @XmlElement(name = "BankContact")
    protected List<BankContactType> bankContact;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "TypeText")
    protected String typeText;

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryAddressType }
     * 
     * 
     */
    public List<PrimaryAddressType> getPrimaryAddress() {
        if (primaryAddress == null) {
            primaryAddress = new ArrayList<PrimaryAddressType>();
        }
        return this.primaryAddress;
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
     * Gets the value of the bankReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankReference }
     * 
     * 
     */
    public List<BankReference> getBankReference() {
        if (bankReference == null) {
            bankReference = new ArrayList<BankReference>();
        }
        return this.bankReference;
    }

    /**
     * Gets the value of the bankContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankContactType }
     * 
     * 
     */
    public List<BankContactType> getBankContact() {
        if (bankContact == null) {
            bankContact = new ArrayList<BankContactType>();
        }
        return this.bankContact;
    }

    /**
     * Gets the value of the dnbCodeTableNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDNBCodeTableNumber() {
        return dnbCodeTableNumber;
    }

    /**
     * Sets the value of the dnbCodeTableNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDNBCodeTableNumber(Integer value) {
        this.dnbCodeTableNumber = value;
    }

    /**
     * Gets the value of the dnbCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDNBCodeValue() {
        return dnbCodeValue;
    }

    /**
     * Sets the value of the dnbCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDNBCodeValue(BigInteger value) {
        this.dnbCodeValue = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
    }

}

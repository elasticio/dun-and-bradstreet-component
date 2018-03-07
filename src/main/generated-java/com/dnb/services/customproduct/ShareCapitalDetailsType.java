
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the current Capital information.
 *          
 * 
 * <p>Java class for ShareCapitalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShareCapitalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CapitalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CapitalAmountUndisclosedReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OriginalCapitalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CapitalStockDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CapitalStockDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CapitalTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringNewType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" />
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShareCapitalDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "capitalAmount",
    "startDate",
    "capitalAmountUndisclosedReasonText",
    "originalCapitalIndicator",
    "capitalStockDetails",
    "capitalTypeText"
})
@XmlSeeAlso({
    ShareCapitalDetailsHistoryType.class
})
public class ShareCapitalDetailsType {

    @XmlElement(name = "CapitalAmount")
    protected AmountType capitalAmount;
    @XmlElement(name = "StartDate")
    protected DNBDateType startDate;
    @XmlElement(name = "CapitalAmountUndisclosedReasonText")
    protected DNBDecodedStringType capitalAmountUndisclosedReasonText;
    @XmlElement(name = "OriginalCapitalIndicator")
    protected Boolean originalCapitalIndicator;
    @XmlElement(name = "CapitalStockDetails")
    protected List<CapitalStockDetails> capitalStockDetails;
    @XmlElement(name = "CapitalTypeText")
    protected DNBDecodedStringNewType capitalTypeText;
    @XmlAttribute(name = "TypeText")
    protected String typeText;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;

    /**
     * Gets the value of the capitalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCapitalAmount() {
        return capitalAmount;
    }

    /**
     * Sets the value of the capitalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCapitalAmount(AmountType value) {
        this.capitalAmount = value;
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
     * Gets the value of the capitalAmountUndisclosedReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCapitalAmountUndisclosedReasonText() {
        return capitalAmountUndisclosedReasonText;
    }

    /**
     * Sets the value of the capitalAmountUndisclosedReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCapitalAmountUndisclosedReasonText(DNBDecodedStringType value) {
        this.capitalAmountUndisclosedReasonText = value;
    }

    /**
     * Gets the value of the originalCapitalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalCapitalIndicator() {
        return originalCapitalIndicator;
    }

    /**
     * Sets the value of the originalCapitalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalCapitalIndicator(Boolean value) {
        this.originalCapitalIndicator = value;
    }

    /**
     * Gets the value of the capitalStockDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capitalStockDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCapitalStockDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CapitalStockDetails }
     * 
     * 
     */
    public List<CapitalStockDetails> getCapitalStockDetails() {
        if (capitalStockDetails == null) {
            capitalStockDetails = new ArrayList<CapitalStockDetails>();
        }
        return this.capitalStockDetails;
    }

    /**
     * Gets the value of the capitalTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public DNBDecodedStringNewType getCapitalTypeText() {
        return capitalTypeText;
    }

    /**
     * Sets the value of the capitalTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringNewType }
     *     
     */
    public void setCapitalTypeText(DNBDecodedStringNewType value) {
        this.capitalTypeText = value;
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

}


package com.dnb.services.ratings.actions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemDescriptionText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *         &lt;element name="ItemAmount" type="{http://services.dnb.com/AssessmentProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatementItem" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StatementItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DNBCodeValue" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBCodeValueType" />
 *       &lt;attribute name="DNBCodeTableNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ExternalCodingSchemeTypeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalCodingSchemeValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentDNBCodeValue" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBCodeValueType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementItem", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "itemDescriptionText",
    "itemAmount",
    "displaySequence",
    "statementItem"
})
public class StatementItem {

    @XmlElement(name = "ItemDescriptionText")
    protected DNBStringType256 itemDescriptionText;
    @XmlElement(name = "ItemAmount")
    protected AmountType itemAmount;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "StatementItem")
    protected List<StatementItem> statementItem;
    @XmlAttribute(name = "DNBCodeValue")
    protected BigInteger dnbCodeValue;
    @XmlAttribute(name = "DNBCodeTableNumber")
    protected Integer dnbCodeTableNumber;
    @XmlAttribute(name = "ExternalCodingSchemeTypeText")
    protected String externalCodingSchemeTypeText;
    @XmlAttribute(name = "ExternalCodingSchemeValue")
    protected String externalCodingSchemeValue;
    @XmlAttribute(name = "ParentDNBCodeValue")
    protected BigInteger parentDNBCodeValue;

    /**
     * Gets the value of the itemDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getItemDescriptionText() {
        return itemDescriptionText;
    }

    /**
     * Sets the value of the itemDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setItemDescriptionText(DNBStringType256 value) {
        this.itemDescriptionText = value;
    }

    /**
     * Gets the value of the itemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getItemAmount() {
        return itemAmount;
    }

    /**
     * Sets the value of the itemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setItemAmount(AmountType value) {
        this.itemAmount = value;
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
     * Gets the value of the statementItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statementItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatementItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementItem }
     * 
     * 
     */
    public List<StatementItem> getStatementItem() {
        if (statementItem == null) {
            statementItem = new ArrayList<StatementItem>();
        }
        return this.statementItem;
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
     * Gets the value of the externalCodingSchemeTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeTypeText() {
        return externalCodingSchemeTypeText;
    }

    /**
     * Sets the value of the externalCodingSchemeTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeTypeText(String value) {
        this.externalCodingSchemeTypeText = value;
    }

    /**
     * Gets the value of the externalCodingSchemeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCodingSchemeValue() {
        return externalCodingSchemeValue;
    }

    /**
     * Sets the value of the externalCodingSchemeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCodingSchemeValue(String value) {
        this.externalCodingSchemeValue = value;
    }

    /**
     * Gets the value of the parentDNBCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParentDNBCodeValue() {
        return parentDNBCodeValue;
    }

    /**
     * Sets the value of the parentDNBCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParentDNBCodeValue(BigInteger value) {
        this.parentDNBCodeValue = value;
    }

}

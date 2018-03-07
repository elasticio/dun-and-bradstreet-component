
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details and the summarized views about the legally declared inability or impairment of ability of an individual or organization to pay its creditors.
 *          
 * 
 * <p>Java class for BankruptcyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bankruptcy" type="{http://services.dnb.com/CustomProductServiceV2.0}BankruptcyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BankruptcySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType" minOccurs="0"/>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *         &lt;element name="BankruptcyPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "bankruptcy",
    "bankruptcySummary",
    "disclaimerText",
    "bankruptcyPeriodSummary"
})
public class BankruptcyInformation {

    @XmlElement(name = "Bankruptcy")
    protected List<BankruptcyType> bankruptcy;
    @XmlElement(name = "BankruptcySummary")
    protected LegalEventSummaryType bankruptcySummary;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;
    @XmlElement(name = "BankruptcyPeriodSummary")
    protected List<LegalEventPeriodSummaryType> bankruptcyPeriodSummary;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankruptcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankruptcyType }
     * 
     * 
     */
    public List<BankruptcyType> getBankruptcy() {
        if (bankruptcy == null) {
            bankruptcy = new ArrayList<BankruptcyType>();
        }
        return this.bankruptcy;
    }

    /**
     * Gets the value of the bankruptcySummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public LegalEventSummaryType getBankruptcySummary() {
        return bankruptcySummary;
    }

    /**
     * Sets the value of the bankruptcySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public void setBankruptcySummary(LegalEventSummaryType value) {
        this.bankruptcySummary = value;
    }

    /**
     * Gets the value of the disclaimerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclaimerText() {
        return disclaimerText;
    }

    /**
     * Sets the value of the disclaimerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclaimerText(String value) {
        this.disclaimerText = value;
    }

    /**
     * Gets the value of the bankruptcyPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcyPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankruptcyPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getBankruptcyPeriodSummary() {
        if (bankruptcyPeriodSummary == null) {
            bankruptcyPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.bankruptcyPeriodSummary;
    }

}

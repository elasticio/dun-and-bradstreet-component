
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuitInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuitInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuitSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}SuitSummaryType" minOccurs="0"/>
 *         &lt;element name="SuitPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Suit" type="{http://services.dnb.com/CustomProductServiceV2.0}SuitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisclaimerText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType720" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuitInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "suitSummary",
    "suitPeriodSummary",
    "suit",
    "disclaimerText"
})
public class SuitInformation {

    @XmlElement(name = "SuitSummary")
    protected SuitSummaryType suitSummary;
    @XmlElement(name = "SuitPeriodSummary")
    protected List<LegalEventPeriodSummaryType> suitPeriodSummary;
    @XmlElement(name = "Suit")
    protected List<SuitType> suit;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

    /**
     * Gets the value of the suitSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SuitSummaryType }
     *     
     */
    public SuitSummaryType getSuitSummary() {
        return suitSummary;
    }

    /**
     * Sets the value of the suitSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuitSummaryType }
     *     
     */
    public void setSuitSummary(SuitSummaryType value) {
        this.suitSummary = value;
    }

    /**
     * Gets the value of the suitPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suitPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuitPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getSuitPeriodSummary() {
        if (suitPeriodSummary == null) {
            suitPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.suitPeriodSummary;
    }

    /**
     * Gets the value of the suit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SuitType }
     * 
     * 
     */
    public List<SuitType> getSuit() {
        if (suit == null) {
            suit = new ArrayList<SuitType>();
        }
        return this.suit;
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

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LienInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LienInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LienPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LienSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventSummaryType" minOccurs="0"/>
 *         &lt;element name="Lien" type="{http://services.dnb.com/CustomProductServiceV2.0}LienType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "LienInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "lienPeriodSummary",
    "lienSummary",
    "lien",
    "disclaimerText"
})
public class LienInformation {

    @XmlElement(name = "LienPeriodSummary")
    protected List<LegalEventPeriodSummaryType> lienPeriodSummary;
    @XmlElement(name = "LienSummary")
    protected LegalEventSummaryType lienSummary;
    @XmlElement(name = "Lien")
    protected List<LienType> lien;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

    /**
     * Gets the value of the lienPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lienPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLienPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getLienPeriodSummary() {
        if (lienPeriodSummary == null) {
            lienPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.lienPeriodSummary;
    }

    /**
     * Gets the value of the lienSummary property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public LegalEventSummaryType getLienSummary() {
        return lienSummary;
    }

    /**
     * Sets the value of the lienSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEventSummaryType }
     *     
     */
    public void setLienSummary(LegalEventSummaryType value) {
        this.lienSummary = value;
    }

    /**
     * Gets the value of the lien property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lien property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLien().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LienType }
     * 
     * 
     */
    public List<LienType> getLien() {
        if (lien == null) {
            lien = new ArrayList<LienType>();
        }
        return this.lien;
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

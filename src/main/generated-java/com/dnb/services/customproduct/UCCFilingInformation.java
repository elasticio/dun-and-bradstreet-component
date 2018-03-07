
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UCCFilingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UCCFilingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UCCFilingSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}UCCFilingSummaryType" minOccurs="0"/>
 *         &lt;element name="UCCFiling" type="{http://services.dnb.com/CustomProductServiceV2.0}UCCFilingType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "UCCFilingInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "uccFilingSummary",
    "uccFiling",
    "disclaimerText"
})
public class UCCFilingInformation {

    @XmlElement(name = "UCCFilingSummary")
    protected UCCFilingSummaryType uccFilingSummary;
    @XmlElement(name = "UCCFiling")
    protected List<UCCFilingType> uccFiling;
    @XmlElement(name = "DisclaimerText")
    protected String disclaimerText;

    /**
     * Gets the value of the uccFilingSummary property.
     * 
     * @return
     *     possible object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public UCCFilingSummaryType getUCCFilingSummary() {
        return uccFilingSummary;
    }

    /**
     * Sets the value of the uccFilingSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCCFilingSummaryType }
     *     
     */
    public void setUCCFilingSummary(UCCFilingSummaryType value) {
        this.uccFilingSummary = value;
    }

    /**
     * Gets the value of the uccFiling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uccFiling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUCCFiling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UCCFilingType }
     * 
     * 
     */
    public List<UCCFilingType> getUCCFiling() {
        if (uccFiling == null) {
            uccFiling = new ArrayList<UCCFilingType>();
        }
        return this.uccFiling;
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

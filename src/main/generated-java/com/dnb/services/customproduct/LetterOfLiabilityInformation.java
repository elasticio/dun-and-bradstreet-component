
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LetterOfLiabilityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LetterOfLiabilityInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IssuedLetterOfLiability" type="{http://services.dnb.com/CustomProductServiceV2.0}IssuedLetterOfLiability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubscribedToLetterOfLiability" type="{http://services.dnb.com/CustomProductServiceV2.0}SubscribedToLetterOfLiability" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LetterofLiabilitySummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LetterofLiabilitySummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LetterOfLiabilityInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "issuedLetterOfLiability",
    "subscribedToLetterOfLiability",
    "letterofLiabilitySummary"
})
public class LetterOfLiabilityInformation {

    @XmlElement(name = "IssuedLetterOfLiability")
    protected List<IssuedLetterOfLiability> issuedLetterOfLiability;
    @XmlElement(name = "SubscribedToLetterOfLiability")
    protected List<SubscribedToLetterOfLiability> subscribedToLetterOfLiability;
    @XmlElement(name = "LetterofLiabilitySummary")
    protected LetterofLiabilitySummaryType letterofLiabilitySummary;

    /**
     * Gets the value of the issuedLetterOfLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedLetterOfLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedLetterOfLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuedLetterOfLiability }
     * 
     * 
     */
    public List<IssuedLetterOfLiability> getIssuedLetterOfLiability() {
        if (issuedLetterOfLiability == null) {
            issuedLetterOfLiability = new ArrayList<IssuedLetterOfLiability>();
        }
        return this.issuedLetterOfLiability;
    }

    /**
     * Gets the value of the subscribedToLetterOfLiability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscribedToLetterOfLiability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscribedToLetterOfLiability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscribedToLetterOfLiability }
     * 
     * 
     */
    public List<SubscribedToLetterOfLiability> getSubscribedToLetterOfLiability() {
        if (subscribedToLetterOfLiability == null) {
            subscribedToLetterOfLiability = new ArrayList<SubscribedToLetterOfLiability>();
        }
        return this.subscribedToLetterOfLiability;
    }

    /**
     * Gets the value of the letterofLiabilitySummary property.
     * 
     * @return
     *     possible object is
     *     {@link LetterofLiabilitySummaryType }
     *     
     */
    public LetterofLiabilitySummaryType getLetterofLiabilitySummary() {
        return letterofLiabilitySummary;
    }

    /**
     * Sets the value of the letterofLiabilitySummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterofLiabilitySummaryType }
     *     
     */
    public void setLetterofLiabilitySummary(LetterofLiabilitySummaryType value) {
        this.letterofLiabilitySummary = value;
    }

}

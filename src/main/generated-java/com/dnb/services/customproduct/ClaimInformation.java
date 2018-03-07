
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClaimInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClaimSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}ClaimSummary" minOccurs="0"/>
 *         &lt;element name="Claim" type="{http://services.dnb.com/CustomProductServiceV2.0}ClaimType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClaimPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventPeriodSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "claimSummary",
    "claim",
    "claimPeriodSummary"
})
public class ClaimInformation {

    @XmlElement(name = "ClaimSummary")
    protected ClaimSummary claimSummary;
    @XmlElement(name = "Claim")
    protected List<ClaimType> claim;
    @XmlElement(name = "ClaimPeriodSummary")
    protected List<LegalEventPeriodSummaryType> claimPeriodSummary;

    /**
     * Gets the value of the claimSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimSummary }
     *     
     */
    public ClaimSummary getClaimSummary() {
        return claimSummary;
    }

    /**
     * Sets the value of the claimSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimSummary }
     *     
     */
    public void setClaimSummary(ClaimSummary value) {
        this.claimSummary = value;
    }

    /**
     * Gets the value of the claim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimType }
     * 
     * 
     */
    public List<ClaimType> getClaim() {
        if (claim == null) {
            claim = new ArrayList<ClaimType>();
        }
        return this.claim;
    }

    /**
     * Gets the value of the claimPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventPeriodSummaryType }
     * 
     * 
     */
    public List<LegalEventPeriodSummaryType> getClaimPeriodSummary() {
        if (claimPeriodSummary == null) {
            claimPeriodSummary = new ArrayList<LegalEventPeriodSummaryType>();
        }
        return this.claimPeriodSummary;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details and the summarized views about legal events on the subject that are adjudged a conveyance of legal interest in property as security or borrowing secured against both the fixed and floating assets of an organization. Holders of a general charge have call on assets behind only debenture holders in the event of organization liquidation.
 *          
 * 
 * <p>Java class for MortgagesAndChargesInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MortgagesAndChargesInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MortgagesAndCharges" type="{http://services.dnb.com/CustomProductServiceV2.0}MortgagesAndChargesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MortgagesAndChargesSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}MortgagesAndChargesSummary" minOccurs="0"/>
 *         &lt;element name="MortgagesandChargesPeriodSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancingStatementFilingPeriodSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MortgagesAndChargesInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "mortgagesAndCharges",
    "mortgagesAndChargesSummary",
    "mortgagesandChargesPeriodSummary"
})
public class MortgagesAndChargesInformation {

    @XmlElement(name = "MortgagesAndCharges")
    protected List<MortgagesAndChargesType> mortgagesAndCharges;
    @XmlElement(name = "MortgagesAndChargesSummary")
    protected MortgagesAndChargesSummary mortgagesAndChargesSummary;
    @XmlElement(name = "MortgagesandChargesPeriodSummary")
    protected List<FinancingStatementFilingPeriodSummary> mortgagesandChargesPeriodSummary;

    /**
     * Gets the value of the mortgagesAndCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mortgagesAndCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMortgagesAndCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MortgagesAndChargesType }
     * 
     * 
     */
    public List<MortgagesAndChargesType> getMortgagesAndCharges() {
        if (mortgagesAndCharges == null) {
            mortgagesAndCharges = new ArrayList<MortgagesAndChargesType>();
        }
        return this.mortgagesAndCharges;
    }

    /**
     * Gets the value of the mortgagesAndChargesSummary property.
     * 
     * @return
     *     possible object is
     *     {@link MortgagesAndChargesSummary }
     *     
     */
    public MortgagesAndChargesSummary getMortgagesAndChargesSummary() {
        return mortgagesAndChargesSummary;
    }

    /**
     * Sets the value of the mortgagesAndChargesSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link MortgagesAndChargesSummary }
     *     
     */
    public void setMortgagesAndChargesSummary(MortgagesAndChargesSummary value) {
        this.mortgagesAndChargesSummary = value;
    }

    /**
     * Gets the value of the mortgagesandChargesPeriodSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mortgagesandChargesPeriodSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMortgagesandChargesPeriodSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingStatementFilingPeriodSummary }
     * 
     * 
     */
    public List<FinancingStatementFilingPeriodSummary> getMortgagesandChargesPeriodSummary() {
        if (mortgagesandChargesPeriodSummary == null) {
            mortgagesandChargesPeriodSummary = new ArrayList<FinancingStatementFilingPeriodSummary>();
        }
        return this.mortgagesandChargesPeriodSummary;
    }

}


package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop records high level information, that is not specific to any one customer, with regard to an organization role in getting work done for its customers as per legal agreements.
 *          
 * 
 * <p>Java class for ContractsSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractsSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalContractAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalContractAmountDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubcontractsWorkIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MajorityOfContractWorkSubcontractedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SubcontractedWorkPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractsSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalContractAmount",
    "totalContractAmountDate",
    "subcontractsWorkIndicator",
    "majorityOfContractWorkSubcontractedIndicator",
    "subcontractedWorkPercentage"
})
public class ContractsSummary {

    @XmlElement(name = "TotalContractAmount")
    protected AmountType totalContractAmount;
    @XmlElement(name = "TotalContractAmountDate")
    protected DNBDateType totalContractAmountDate;
    @XmlElement(name = "SubcontractsWorkIndicator")
    protected Boolean subcontractsWorkIndicator;
    @XmlElement(name = "MajorityOfContractWorkSubcontractedIndicator")
    protected Boolean majorityOfContractWorkSubcontractedIndicator;
    @XmlElement(name = "SubcontractedWorkPercentage")
    protected BigDecimal subcontractedWorkPercentage;

    /**
     * Gets the value of the totalContractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalContractAmount() {
        return totalContractAmount;
    }

    /**
     * Sets the value of the totalContractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalContractAmount(AmountType value) {
        this.totalContractAmount = value;
    }

    /**
     * Gets the value of the totalContractAmountDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getTotalContractAmountDate() {
        return totalContractAmountDate;
    }

    /**
     * Sets the value of the totalContractAmountDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setTotalContractAmountDate(DNBDateType value) {
        this.totalContractAmountDate = value;
    }

    /**
     * Gets the value of the subcontractsWorkIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubcontractsWorkIndicator() {
        return subcontractsWorkIndicator;
    }

    /**
     * Sets the value of the subcontractsWorkIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubcontractsWorkIndicator(Boolean value) {
        this.subcontractsWorkIndicator = value;
    }

    /**
     * Gets the value of the majorityOfContractWorkSubcontractedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMajorityOfContractWorkSubcontractedIndicator() {
        return majorityOfContractWorkSubcontractedIndicator;
    }

    /**
     * Sets the value of the majorityOfContractWorkSubcontractedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMajorityOfContractWorkSubcontractedIndicator(Boolean value) {
        this.majorityOfContractWorkSubcontractedIndicator = value;
    }

    /**
     * Gets the value of the subcontractedWorkPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubcontractedWorkPercentage() {
        return subcontractedWorkPercentage;
    }

    /**
     * Sets the value of the subcontractedWorkPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubcontractedWorkPercentage(BigDecimal value) {
        this.subcontractedWorkPercentage = value;
    }

}

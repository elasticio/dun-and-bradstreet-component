
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Contains all the sub-sections and elements belonging to the PublicFilings Data bucket.
 *          
 * 
 * <p>Java class for LegalEvents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialEmbarrassmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DebarmentsInformation" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DebarmentsInformation" minOccurs="0"/>
 *         &lt;element name="CriminalProceedingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuitsAndOrJudgmentsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ClaimsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEvents", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "financialEmbarrassmentIndicator",
    "debarmentsInformation",
    "criminalProceedingsIndicator",
    "suitsAndOrJudgmentsIndicator",
    "claimsIndicator"
})
public class LegalEvents {

    @XmlElement(name = "FinancialEmbarrassmentIndicator")
    protected Boolean financialEmbarrassmentIndicator;
    @XmlElement(name = "DebarmentsInformation")
    protected DebarmentsInformation debarmentsInformation;
    @XmlElement(name = "CriminalProceedingsIndicator")
    protected Boolean criminalProceedingsIndicator;
    @XmlElement(name = "SuitsAndOrJudgmentsIndicator")
    protected Boolean suitsAndOrJudgmentsIndicator;
    @XmlElement(name = "ClaimsIndicator")
    protected Boolean claimsIndicator;

    /**
     * Gets the value of the financialEmbarrassmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinancialEmbarrassmentIndicator() {
        return financialEmbarrassmentIndicator;
    }

    /**
     * Sets the value of the financialEmbarrassmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinancialEmbarrassmentIndicator(Boolean value) {
        this.financialEmbarrassmentIndicator = value;
    }

    /**
     * Gets the value of the debarmentsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DebarmentsInformation }
     *     
     */
    public DebarmentsInformation getDebarmentsInformation() {
        return debarmentsInformation;
    }

    /**
     * Sets the value of the debarmentsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebarmentsInformation }
     *     
     */
    public void setDebarmentsInformation(DebarmentsInformation value) {
        this.debarmentsInformation = value;
    }

    /**
     * Gets the value of the criminalProceedingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCriminalProceedingsIndicator() {
        return criminalProceedingsIndicator;
    }

    /**
     * Sets the value of the criminalProceedingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCriminalProceedingsIndicator(Boolean value) {
        this.criminalProceedingsIndicator = value;
    }

    /**
     * Gets the value of the suitsAndOrJudgmentsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitsAndOrJudgmentsIndicator() {
        return suitsAndOrJudgmentsIndicator;
    }

    /**
     * Sets the value of the suitsAndOrJudgmentsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitsAndOrJudgmentsIndicator(Boolean value) {
        this.suitsAndOrJudgmentsIndicator = value;
    }

    /**
     * Gets the value of the claimsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClaimsIndicator() {
        return claimsIndicator;
    }

    /**
     * Sets the value of the claimsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClaimsIndicator(Boolean value) {
        this.claimsIndicator = value;
    }

}


package com.dnb.services.ratings.actions;

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
 *         &lt;element name="BankruptcyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuitsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LiensIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JudgmentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BankruptcyInformation" type="{http://services.dnb.com/AssessmentProductServiceV2.0}BankruptcyInformation" minOccurs="0"/>
 *         &lt;element name="DebarmentsInformation" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DebarmentsInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalEvents", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "bankruptcyIndicator",
    "suitsIndicator",
    "liensIndicator",
    "judgmentIndicator",
    "bankruptcyInformation",
    "debarmentsInformation"
})
public class LegalEvents {

    @XmlElement(name = "BankruptcyIndicator")
    protected Boolean bankruptcyIndicator;
    @XmlElement(name = "SuitsIndicator")
    protected Boolean suitsIndicator;
    @XmlElement(name = "LiensIndicator")
    protected Boolean liensIndicator;
    @XmlElement(name = "JudgmentIndicator")
    protected Boolean judgmentIndicator;
    @XmlElement(name = "BankruptcyInformation")
    protected BankruptcyInformation bankruptcyInformation;
    @XmlElement(name = "DebarmentsInformation")
    protected DebarmentsInformation debarmentsInformation;

    /**
     * Gets the value of the bankruptcyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBankruptcyIndicator() {
        return bankruptcyIndicator;
    }

    /**
     * Sets the value of the bankruptcyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBankruptcyIndicator(Boolean value) {
        this.bankruptcyIndicator = value;
    }

    /**
     * Gets the value of the suitsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuitsIndicator() {
        return suitsIndicator;
    }

    /**
     * Sets the value of the suitsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuitsIndicator(Boolean value) {
        this.suitsIndicator = value;
    }

    /**
     * Gets the value of the liensIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiensIndicator() {
        return liensIndicator;
    }

    /**
     * Sets the value of the liensIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiensIndicator(Boolean value) {
        this.liensIndicator = value;
    }

    /**
     * Gets the value of the judgmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJudgmentIndicator() {
        return judgmentIndicator;
    }

    /**
     * Sets the value of the judgmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJudgmentIndicator(Boolean value) {
        this.judgmentIndicator = value;
    }

    /**
     * Gets the value of the bankruptcyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BankruptcyInformation }
     *     
     */
    public BankruptcyInformation getBankruptcyInformation() {
        return bankruptcyInformation;
    }

    /**
     * Sets the value of the bankruptcyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankruptcyInformation }
     *     
     */
    public void setBankruptcyInformation(BankruptcyInformation value) {
        this.bankruptcyInformation = value;
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

}

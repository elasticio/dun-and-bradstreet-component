
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information about that different events against the subject, e.g., legal event, financial event, significant event.
 *          
 * 
 * <p>Java class for Events complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Events">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PublicFilingHeader" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PublicFilingHeaderType" minOccurs="0"/>
 *         &lt;element name="LegalEvents" type="{http://services.dnb.com/AssessmentProductServiceV2.0}LegalEvents" minOccurs="0"/>
 *         &lt;element name="FinancingEvents" type="{http://services.dnb.com/AssessmentProductServiceV2.0}FinancingEvents" minOccurs="0"/>
 *         &lt;element name="SignificantEvents" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SignificantEvents" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Events", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "publicFilingHeader",
    "legalEvents",
    "financingEvents",
    "significantEvents"
})
public class Events {

    @XmlElement(name = "PublicFilingHeader")
    protected PublicFilingHeaderType publicFilingHeader;
    @XmlElement(name = "LegalEvents")
    protected LegalEvents legalEvents;
    @XmlElement(name = "FinancingEvents")
    protected FinancingEvents financingEvents;
    @XmlElement(name = "SignificantEvents")
    protected SignificantEvents significantEvents;

    /**
     * Gets the value of the publicFilingHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PublicFilingHeaderType }
     *     
     */
    public PublicFilingHeaderType getPublicFilingHeader() {
        return publicFilingHeader;
    }

    /**
     * Sets the value of the publicFilingHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicFilingHeaderType }
     *     
     */
    public void setPublicFilingHeader(PublicFilingHeaderType value) {
        this.publicFilingHeader = value;
    }

    /**
     * Gets the value of the legalEvents property.
     * 
     * @return
     *     possible object is
     *     {@link LegalEvents }
     *     
     */
    public LegalEvents getLegalEvents() {
        return legalEvents;
    }

    /**
     * Sets the value of the legalEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEvents }
     *     
     */
    public void setLegalEvents(LegalEvents value) {
        this.legalEvents = value;
    }

    /**
     * Gets the value of the financingEvents property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingEvents }
     *     
     */
    public FinancingEvents getFinancingEvents() {
        return financingEvents;
    }

    /**
     * Sets the value of the financingEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingEvents }
     *     
     */
    public void setFinancingEvents(FinancingEvents value) {
        this.financingEvents = value;
    }

    /**
     * Gets the value of the significantEvents property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantEvents }
     *     
     */
    public SignificantEvents getSignificantEvents() {
        return significantEvents;
    }

    /**
     * Sets the value of the significantEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantEvents }
     *     
     */
    public void setSignificantEvents(SignificantEvents value) {
        this.significantEvents = value;
    }

}

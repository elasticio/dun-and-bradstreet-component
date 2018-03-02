
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the statistical information based on the trade payment data available for this organization.
 *          
 * 
 * <p>Java class for TradeDataAvailabilityDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeDataAvailabilityDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradeDataAvailableIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssessmentText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
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
@XmlType(name = "TradeDataAvailabilityDetail", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "tradeDataAvailableIndicator",
    "assessmentText"
})
public class TradeDataAvailabilityDetail {

    @XmlElement(name = "TradeDataAvailableIndicator")
    protected Boolean tradeDataAvailableIndicator;
    @XmlElement(name = "AssessmentText")
    protected List<String> assessmentText;

    /**
     * Gets the value of the tradeDataAvailableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradeDataAvailableIndicator() {
        return tradeDataAvailableIndicator;
    }

    /**
     * Sets the value of the tradeDataAvailableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradeDataAvailableIndicator(Boolean value) {
        this.tradeDataAvailableIndicator = value;
    }

    /**
     * Gets the value of the assessmentText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentText() {
        if (assessmentText == null) {
            assessmentText = new ArrayList<String>();
        }
        return this.assessmentText;
    }

}

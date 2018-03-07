
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for FinancialAccountSummaryDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountSummaryDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MostRecentDelinquencyDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *         &lt;element name="OldestOpenAccountDuration" type="{http://services.dnb.com/CustomProductServiceV2.0}DurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountSummaryDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "mostRecentDelinquencyDuration",
    "oldestOpenAccountDuration"
})
public class FinancialAccountSummaryDetailType {

    @XmlElement(name = "MostRecentDelinquencyDuration")
    protected Duration mostRecentDelinquencyDuration;
    @XmlElement(name = "OldestOpenAccountDuration")
    protected Duration oldestOpenAccountDuration;

    /**
     * Gets the value of the mostRecentDelinquencyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMostRecentDelinquencyDuration() {
        return mostRecentDelinquencyDuration;
    }

    /**
     * Sets the value of the mostRecentDelinquencyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMostRecentDelinquencyDuration(Duration value) {
        this.mostRecentDelinquencyDuration = value;
    }

    /**
     * Gets the value of the oldestOpenAccountDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOldestOpenAccountDuration() {
        return oldestOpenAccountDuration;
    }

    /**
     * Sets the value of the oldestOpenAccountDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOldestOpenAccountDuration(Duration value) {
        this.oldestOpenAccountDuration = value;
    }

}

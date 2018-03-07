
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherActivitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherActivitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherActivitiesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RevenuePercentage" minOccurs="0">
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
@XmlType(name = "OtherActivitiesType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "otherActivitiesIndicator",
    "revenuePercentage"
})
public class OtherActivitiesType {

    @XmlElement(name = "OtherActivitiesIndicator")
    protected boolean otherActivitiesIndicator;
    @XmlElement(name = "RevenuePercentage")
    protected BigDecimal revenuePercentage;

    /**
     * Gets the value of the otherActivitiesIndicator property.
     * 
     */
    public boolean isOtherActivitiesIndicator() {
        return otherActivitiesIndicator;
    }

    /**
     * Sets the value of the otherActivitiesIndicator property.
     * 
     */
    public void setOtherActivitiesIndicator(boolean value) {
        this.otherActivitiesIndicator = value;
    }

    /**
     * Gets the value of the revenuePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRevenuePercentage() {
        return revenuePercentage;
    }

    /**
     * Sets the value of the revenuePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRevenuePercentage(BigDecimal value) {
        this.revenuePercentage = value;
    }

}

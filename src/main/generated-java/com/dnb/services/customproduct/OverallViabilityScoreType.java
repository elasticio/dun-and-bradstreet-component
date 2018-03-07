
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallViabilityScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallViabilityScoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}ViabilityScoreType">
 *       &lt;sequence>
 *         &lt;element name="OverallBadRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallViabilityScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "overallBadRate"
})
public class OverallViabilityScoreType
    extends ViabilityScoreType
{

    @XmlElement(name = "OverallBadRate")
    protected BigDecimal overallBadRate;

    /**
     * Gets the value of the overallBadRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallBadRate() {
        return overallBadRate;
    }

    /**
     * Sets the value of the overallBadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallBadRate(BigDecimal value) {
        this.overallBadRate = value;
    }

}

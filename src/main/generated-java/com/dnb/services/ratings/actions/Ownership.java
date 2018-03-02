
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ownership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Ownership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/AssessmentProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ownership", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "dunsNumber"
})
@XmlSeeAlso({
    Shareholder.class
})
public class Ownership
    extends Association
{

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

}

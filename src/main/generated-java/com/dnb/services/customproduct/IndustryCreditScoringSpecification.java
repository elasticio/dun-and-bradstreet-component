
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This specification is applicable only for Industry Credit Scoring products
 *          
 * 
 * <p>Java class for IndustryCreditScoringSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryCreditScoringSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryClassificationText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryCreditScoringSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryClassificationText"
})
public class IndustryCreditScoringSpecification {

    @XmlElement(name = "IndustryClassificationText", required = true)
    protected String industryClassificationText;

    /**
     * Gets the value of the industryClassificationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryClassificationText() {
        return industryClassificationText;
    }

    /**
     * Sets the value of the industryClassificationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryClassificationText(String value) {
        this.industryClassificationText = value;
    }

}

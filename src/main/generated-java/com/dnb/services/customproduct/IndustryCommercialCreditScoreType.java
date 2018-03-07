
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryCommercialCreditScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryCommercialCreditScoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCreditScoreType">
 *       &lt;sequence>
 *         &lt;element name="IndustryClassificationText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="ScoreUnavailabilityReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryCommercialCreditScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryClassificationText",
    "scoreUnavailabilityReasonText"
})
public class IndustryCommercialCreditScoreType
    extends CommercialCreditScoreType
{

    @XmlElement(name = "IndustryClassificationText")
    protected String industryClassificationText;
    @XmlElement(name = "ScoreUnavailabilityReasonText")
    protected String scoreUnavailabilityReasonText;

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

    /**
     * Gets the value of the scoreUnavailabilityReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScoreUnavailabilityReasonText() {
        return scoreUnavailabilityReasonText;
    }

    /**
     * Sets the value of the scoreUnavailabilityReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScoreUnavailabilityReasonText(String value) {
        this.scoreUnavailabilityReasonText = value;
    }

}

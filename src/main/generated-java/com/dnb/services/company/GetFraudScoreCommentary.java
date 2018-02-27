
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFraudScoreCommentary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudScoreCommentary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReasonCommentaryText" type="{http://services.dnb.com/CompanyServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="ImportanceLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFraudScoreCommentary", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "reasonCommentaryText",
    "importanceLevel"
})
public class GetFraudScoreCommentary {

    @XmlElement(name = "ReasonCommentaryText", required = true)
    protected DNBDecodedStringType reasonCommentaryText;
    @XmlElement(name = "ImportanceLevel")
    protected Integer importanceLevel;

    /**
     * Gets the value of the reasonCommentaryText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getReasonCommentaryText() {
        return reasonCommentaryText;
    }

    /**
     * Sets the value of the reasonCommentaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setReasonCommentaryText(DNBDecodedStringType value) {
        this.reasonCommentaryText = value;
    }

    /**
     * Gets the value of the importanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportanceLevel() {
        return importanceLevel;
    }

    /**
     * Sets the value of the importanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImportanceLevel(Integer value) {
        this.importanceLevel = value;
    }

}

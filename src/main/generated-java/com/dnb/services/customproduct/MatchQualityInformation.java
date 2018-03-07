
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchQualityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchQualityInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfidenceCodeValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MatchBasis" type="{http://services.dnb.com/CustomProductServiceV2.0}MatchBasis" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchQualityInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "confidenceCodeValue",
    "matchBasis"
})
public class MatchQualityInformation {

    @XmlElement(name = "ConfidenceCodeValue")
    protected Integer confidenceCodeValue;
    @XmlElement(name = "MatchBasis")
    protected List<MatchBasis> matchBasis;

    /**
     * Gets the value of the confidenceCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConfidenceCodeValue() {
        return confidenceCodeValue;
    }

    /**
     * Sets the value of the confidenceCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConfidenceCodeValue(Integer value) {
        this.confidenceCodeValue = value;
    }

    /**
     * Gets the value of the matchBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchBasis }
     * 
     * 
     */
    public List<MatchBasis> getMatchBasis() {
        if (matchBasis == null) {
            matchBasis = new ArrayList<MatchBasis>();
        }
        return this.matchBasis;
    }

}

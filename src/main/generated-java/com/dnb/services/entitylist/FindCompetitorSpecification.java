
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the parameters for refining the search result.
 *          
 * 
 * <p>Java class for FindCompetitorSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompetitorSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnOnlyTopCompetitorIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompetitorSpecification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "returnOnlyTopCompetitorIndicator"
})
public class FindCompetitorSpecification {

    @XmlElement(name = "ReturnOnlyTopCompetitorIndicator")
    protected Boolean returnOnlyTopCompetitorIndicator;

    /**
     * Gets the value of the returnOnlyTopCompetitorIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnlyTopCompetitorIndicator() {
        return returnOnlyTopCompetitorIndicator;
    }

    /**
     * Sets the value of the returnOnlyTopCompetitorIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyTopCompetitorIndicator(Boolean value) {
        this.returnOnlyTopCompetitorIndicator = value;
    }

}


package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsolvencyProcessinformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsolvencyProcessinformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsolvencyProcessSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}InsolvencyProcessSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsolvencyProcessinformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "insolvencyProcessSummary"
})
public class InsolvencyProcessinformation {

    @XmlElement(name = "InsolvencyProcessSummary")
    protected InsolvencyProcessSummaryType insolvencyProcessSummary;

    /**
     * Gets the value of the insolvencyProcessSummary property.
     * 
     * @return
     *     possible object is
     *     {@link InsolvencyProcessSummaryType }
     *     
     */
    public InsolvencyProcessSummaryType getInsolvencyProcessSummary() {
        return insolvencyProcessSummary;
    }

    /**
     * Sets the value of the insolvencyProcessSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsolvencyProcessSummaryType }
     *     
     */
    public void setInsolvencyProcessSummary(InsolvencyProcessSummaryType value) {
        this.insolvencyProcessSummary = value;
    }

}

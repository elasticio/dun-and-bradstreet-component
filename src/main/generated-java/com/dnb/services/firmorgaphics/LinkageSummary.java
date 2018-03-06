
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkageSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkageSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GlobalUltimateFamilyTreeLinkageCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
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
@XmlType(name = "LinkageSummary", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "globalUltimateFamilyTreeLinkageCount"
})
public class LinkageSummary {

    @XmlElement(name = "GlobalUltimateFamilyTreeLinkageCount")
    protected Integer globalUltimateFamilyTreeLinkageCount;

    /**
     * Gets the value of the globalUltimateFamilyTreeLinkageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGlobalUltimateFamilyTreeLinkageCount() {
        return globalUltimateFamilyTreeLinkageCount;
    }

    /**
     * Sets the value of the globalUltimateFamilyTreeLinkageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGlobalUltimateFamilyTreeLinkageCount(Integer value) {
        this.globalUltimateFamilyTreeLinkageCount = value;
    }

}


package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesUsageDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesUsageDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesUsageFunctionDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PremisesUsageFunctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesUsageTypeText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesUsageDetail", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "premisesUsageFunctionDetail",
    "premisesUsageTypeText"
})
public class PremisesUsageDetail {

    @XmlElement(name = "PremisesUsageFunctionDetail")
    protected List<PremisesUsageFunctionDetail> premisesUsageFunctionDetail;
    @XmlElement(name = "PremisesUsageTypeText")
    protected DNBDecodedStringType premisesUsageTypeText;

    /**
     * Gets the value of the premisesUsageFunctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesUsageFunctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesUsageFunctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremisesUsageFunctionDetail }
     * 
     * 
     */
    public List<PremisesUsageFunctionDetail> getPremisesUsageFunctionDetail() {
        if (premisesUsageFunctionDetail == null) {
            premisesUsageFunctionDetail = new ArrayList<PremisesUsageFunctionDetail>();
        }
        return this.premisesUsageFunctionDetail;
    }

    /**
     * Gets the value of the premisesUsageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesUsageTypeText() {
        return premisesUsageTypeText;
    }

    /**
     * Sets the value of the premisesUsageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesUsageTypeText(DNBDecodedStringType value) {
        this.premisesUsageTypeText = value;
    }

}

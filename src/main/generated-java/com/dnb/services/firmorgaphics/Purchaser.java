
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Purchaser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Purchaser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPaydexScore" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CurrentPaydexScoreType" minOccurs="0"/>
 *         &lt;element name="PurchaserDerivedData" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PurchaserDerivedData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchaser", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "currentPaydexScore",
    "purchaserDerivedData"
})
public class Purchaser {

    @XmlElement(name = "CurrentPaydexScore")
    protected CurrentPaydexScoreType currentPaydexScore;
    @XmlElement(name = "PurchaserDerivedData")
    protected List<PurchaserDerivedData> purchaserDerivedData;

    /**
     * Gets the value of the currentPaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentPaydexScoreType }
     *     
     */
    public CurrentPaydexScoreType getCurrentPaydexScore() {
        return currentPaydexScore;
    }

    /**
     * Sets the value of the currentPaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentPaydexScoreType }
     *     
     */
    public void setCurrentPaydexScore(CurrentPaydexScoreType value) {
        this.currentPaydexScore = value;
    }

    /**
     * Gets the value of the purchaserDerivedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaserDerivedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaserDerivedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaserDerivedData }
     * 
     * 
     */
    public List<PurchaserDerivedData> getPurchaserDerivedData() {
        if (purchaserDerivedData == null) {
            purchaserDerivedData = new ArrayList<PurchaserDerivedData>();
        }
        return this.purchaserDerivedData;
    }

}

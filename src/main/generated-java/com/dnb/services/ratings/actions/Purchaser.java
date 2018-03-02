
package com.dnb.services.ratings.actions;

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
 *         &lt;element name="CurrentPaydexScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}CurrentPaydexScoreType" minOccurs="0"/>
 *         &lt;element name="PaydexScoreHistory" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PaydexScoreHistoryType" minOccurs="0"/>
 *         &lt;element name="CurrentCompositePaydexScore" type="{http://services.dnb.com/AssessmentProductServiceV2.0}CompositePaydexScoreType" minOccurs="0"/>
 *         &lt;element name="CompositePaydexScoreHistory" type="{http://services.dnb.com/AssessmentProductServiceV2.0}CompositePaydexScoreType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PurchaserDerivedData" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PurchaserDerivedData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Purchaser", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "currentPaydexScore",
    "paydexScoreHistory",
    "currentCompositePaydexScore",
    "compositePaydexScoreHistory",
    "purchaserDerivedData"
})
public class Purchaser {

    @XmlElement(name = "CurrentPaydexScore")
    protected CurrentPaydexScoreType currentPaydexScore;
    @XmlElement(name = "PaydexScoreHistory")
    protected PaydexScoreHistoryType paydexScoreHistory;
    @XmlElement(name = "CurrentCompositePaydexScore")
    protected CompositePaydexScoreType currentCompositePaydexScore;
    @XmlElement(name = "CompositePaydexScoreHistory")
    protected List<CompositePaydexScoreType> compositePaydexScoreHistory;
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
     * Gets the value of the paydexScoreHistory property.
     * 
     * @return
     *     possible object is
     *     {@link PaydexScoreHistoryType }
     *     
     */
    public PaydexScoreHistoryType getPaydexScoreHistory() {
        return paydexScoreHistory;
    }

    /**
     * Sets the value of the paydexScoreHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaydexScoreHistoryType }
     *     
     */
    public void setPaydexScoreHistory(PaydexScoreHistoryType value) {
        this.paydexScoreHistory = value;
    }

    /**
     * Gets the value of the currentCompositePaydexScore property.
     * 
     * @return
     *     possible object is
     *     {@link CompositePaydexScoreType }
     *     
     */
    public CompositePaydexScoreType getCurrentCompositePaydexScore() {
        return currentCompositePaydexScore;
    }

    /**
     * Sets the value of the currentCompositePaydexScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositePaydexScoreType }
     *     
     */
    public void setCurrentCompositePaydexScore(CompositePaydexScoreType value) {
        this.currentCompositePaydexScore = value;
    }

    /**
     * Gets the value of the compositePaydexScoreHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compositePaydexScoreHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompositePaydexScoreHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompositePaydexScoreType }
     * 
     * 
     */
    public List<CompositePaydexScoreType> getCompositePaydexScoreHistory() {
        if (compositePaydexScoreHistory == null) {
            compositePaydexScoreHistory = new ArrayList<CompositePaydexScoreType>();
        }
        return this.compositePaydexScoreHistory;
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

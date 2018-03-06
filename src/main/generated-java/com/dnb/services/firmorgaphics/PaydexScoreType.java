
package com.dnb.services.firmorgaphics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaydexScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalPaymentExperiencesUsedCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreType", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "paydexScore",
    "totalPaymentExperiencesUsedCount"
})
public class PaydexScoreType {

    @XmlElement(name = "PaydexScore")
    protected int paydexScore;
    @XmlElement(name = "TotalPaymentExperiencesUsedCount")
    protected Long totalPaymentExperiencesUsedCount;

    /**
     * Gets the value of the paydexScore property.
     * 
     */
    public int getPaydexScore() {
        return paydexScore;
    }

    /**
     * Sets the value of the paydexScore property.
     * 
     */
    public void setPaydexScore(int value) {
        this.paydexScore = value;
    }

    /**
     * Gets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPaymentExperiencesUsedCount() {
        return totalPaymentExperiencesUsedCount;
    }

    /**
     * Sets the value of the totalPaymentExperiencesUsedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPaymentExperiencesUsedCount(Long value) {
        this.totalPaymentExperiencesUsedCount = value;
    }

}

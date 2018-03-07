
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMannerSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMannerSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExperiencesTotalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ExperiencesTotalAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="PaymentWithinTermsPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SummarizedPastDue" type="{http://services.dnb.com/CustomProductServiceV2.0}SummarizedPastDue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMannerSummaryType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "experiencesTotalCount",
    "experiencesTotalAmount",
    "paymentWithinTermsPercentage",
    "summarizedPastDue"
})
public class PaymentMannerSummaryType {

    @XmlElement(name = "ExperiencesTotalCount")
    protected Integer experiencesTotalCount;
    @XmlElement(name = "ExperiencesTotalAmount")
    protected AmountType experiencesTotalAmount;
    @XmlElement(name = "PaymentWithinTermsPercentage")
    protected BigDecimal paymentWithinTermsPercentage;
    @XmlElement(name = "SummarizedPastDue")
    protected List<SummarizedPastDue> summarizedPastDue;

    /**
     * Gets the value of the experiencesTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExperiencesTotalCount() {
        return experiencesTotalCount;
    }

    /**
     * Sets the value of the experiencesTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExperiencesTotalCount(Integer value) {
        this.experiencesTotalCount = value;
    }

    /**
     * Gets the value of the experiencesTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getExperiencesTotalAmount() {
        return experiencesTotalAmount;
    }

    /**
     * Sets the value of the experiencesTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setExperiencesTotalAmount(AmountType value) {
        this.experiencesTotalAmount = value;
    }

    /**
     * Gets the value of the paymentWithinTermsPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentWithinTermsPercentage() {
        return paymentWithinTermsPercentage;
    }

    /**
     * Sets the value of the paymentWithinTermsPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentWithinTermsPercentage(BigDecimal value) {
        this.paymentWithinTermsPercentage = value;
    }

    /**
     * Gets the value of the summarizedPastDue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summarizedPastDue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummarizedPastDue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummarizedPastDue }
     * 
     * 
     */
    public List<SummarizedPastDue> getSummarizedPastDue() {
        if (summarizedPastDue == null) {
            summarizedPastDue = new ArrayList<SummarizedPastDue>();
        }
        return this.summarizedPastDue;
    }

}

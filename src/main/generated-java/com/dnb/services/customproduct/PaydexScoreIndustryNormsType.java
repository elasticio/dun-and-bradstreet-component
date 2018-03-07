
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PaydexScoreIndustryNormsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreIndustryNormsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculationDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CalculationTimestamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="NormPeriodStartDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="NormPeriodEndDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SubjectQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaydexUpperQuartileScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaydexMedianQuartileScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaydexLowerQuartileScore" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentBehaviorUpperQuartileDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorMedianQuartileDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorLowerQuartileDaysQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}NormsIndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviourText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviourDaysQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentBehaviorMedianQuartileText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorUpperQuartileText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentBehaviorLowerQuartileText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreIndustryNormsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "calculationDate",
    "calculationTimestamp",
    "normPeriodStartDate",
    "normPeriodEndDate",
    "subjectQuantity",
    "paydexUpperQuartileScore",
    "paydexMedianQuartileScore",
    "paydexLowerQuartileScore",
    "paymentBehaviorUpperQuartileDaysQuantity",
    "paymentBehaviorMedianQuartileDaysQuantity",
    "paymentBehaviorLowerQuartileDaysQuantity",
    "industryCode",
    "paymentBehaviourText",
    "paymentBehaviourDaysQuantity",
    "paymentBehaviorMedianQuartileText",
    "paymentBehaviorUpperQuartileText",
    "paymentBehaviorLowerQuartileText"
})
public class PaydexScoreIndustryNormsType {

    @XmlElement(name = "CalculationDate")
    protected DNBDateType calculationDate;
    @XmlElement(name = "CalculationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar calculationTimestamp;
    @XmlElement(name = "NormPeriodStartDate")
    protected DNBDateType normPeriodStartDate;
    @XmlElement(name = "NormPeriodEndDate")
    protected DNBDateType normPeriodEndDate;
    @XmlElement(name = "SubjectQuantity")
    protected Integer subjectQuantity;
    @XmlElement(name = "PaydexUpperQuartileScore")
    protected Integer paydexUpperQuartileScore;
    @XmlElement(name = "PaydexMedianQuartileScore")
    protected Integer paydexMedianQuartileScore;
    @XmlElement(name = "PaydexLowerQuartileScore")
    protected Integer paydexLowerQuartileScore;
    @XmlElement(name = "PaymentBehaviorUpperQuartileDaysQuantity")
    protected Integer paymentBehaviorUpperQuartileDaysQuantity;
    @XmlElement(name = "PaymentBehaviorMedianQuartileDaysQuantity")
    protected Integer paymentBehaviorMedianQuartileDaysQuantity;
    @XmlElement(name = "PaymentBehaviorLowerQuartileDaysQuantity")
    protected Integer paymentBehaviorLowerQuartileDaysQuantity;
    @XmlElement(name = "IndustryCode")
    protected List<NormsIndustryCodeType> industryCode;
    @XmlElement(name = "PaymentBehaviourText")
    protected String paymentBehaviourText;
    @XmlElement(name = "PaymentBehaviourDaysQuantity")
    protected BigInteger paymentBehaviourDaysQuantity;
    @XmlElement(name = "PaymentBehaviorMedianQuartileText")
    protected String paymentBehaviorMedianQuartileText;
    @XmlElement(name = "PaymentBehaviorUpperQuartileText")
    protected String paymentBehaviorUpperQuartileText;
    @XmlElement(name = "PaymentBehaviorLowerQuartileText")
    protected String paymentBehaviorLowerQuartileText;

    /**
     * Gets the value of the calculationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCalculationDate() {
        return calculationDate;
    }

    /**
     * Sets the value of the calculationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCalculationDate(DNBDateType value) {
        this.calculationDate = value;
    }

    /**
     * Gets the value of the calculationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCalculationTimestamp() {
        return calculationTimestamp;
    }

    /**
     * Sets the value of the calculationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCalculationTimestamp(XMLGregorianCalendar value) {
        this.calculationTimestamp = value;
    }

    /**
     * Gets the value of the normPeriodStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNormPeriodStartDate() {
        return normPeriodStartDate;
    }

    /**
     * Sets the value of the normPeriodStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNormPeriodStartDate(DNBDateType value) {
        this.normPeriodStartDate = value;
    }

    /**
     * Gets the value of the normPeriodEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getNormPeriodEndDate() {
        return normPeriodEndDate;
    }

    /**
     * Sets the value of the normPeriodEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setNormPeriodEndDate(DNBDateType value) {
        this.normPeriodEndDate = value;
    }

    /**
     * Gets the value of the subjectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubjectQuantity() {
        return subjectQuantity;
    }

    /**
     * Sets the value of the subjectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubjectQuantity(Integer value) {
        this.subjectQuantity = value;
    }

    /**
     * Gets the value of the paydexUpperQuartileScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexUpperQuartileScore() {
        return paydexUpperQuartileScore;
    }

    /**
     * Sets the value of the paydexUpperQuartileScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexUpperQuartileScore(Integer value) {
        this.paydexUpperQuartileScore = value;
    }

    /**
     * Gets the value of the paydexMedianQuartileScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexMedianQuartileScore() {
        return paydexMedianQuartileScore;
    }

    /**
     * Sets the value of the paydexMedianQuartileScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexMedianQuartileScore(Integer value) {
        this.paydexMedianQuartileScore = value;
    }

    /**
     * Gets the value of the paydexLowerQuartileScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaydexLowerQuartileScore() {
        return paydexLowerQuartileScore;
    }

    /**
     * Sets the value of the paydexLowerQuartileScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaydexLowerQuartileScore(Integer value) {
        this.paydexLowerQuartileScore = value;
    }

    /**
     * Gets the value of the paymentBehaviorUpperQuartileDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentBehaviorUpperQuartileDaysQuantity() {
        return paymentBehaviorUpperQuartileDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviorUpperQuartileDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentBehaviorUpperQuartileDaysQuantity(Integer value) {
        this.paymentBehaviorUpperQuartileDaysQuantity = value;
    }

    /**
     * Gets the value of the paymentBehaviorMedianQuartileDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentBehaviorMedianQuartileDaysQuantity() {
        return paymentBehaviorMedianQuartileDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviorMedianQuartileDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentBehaviorMedianQuartileDaysQuantity(Integer value) {
        this.paymentBehaviorMedianQuartileDaysQuantity = value;
    }

    /**
     * Gets the value of the paymentBehaviorLowerQuartileDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaymentBehaviorLowerQuartileDaysQuantity() {
        return paymentBehaviorLowerQuartileDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviorLowerQuartileDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaymentBehaviorLowerQuartileDaysQuantity(Integer value) {
        this.paymentBehaviorLowerQuartileDaysQuantity = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormsIndustryCodeType }
     * 
     * 
     */
    public List<NormsIndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<NormsIndustryCodeType>();
        }
        return this.industryCode;
    }

    /**
     * Gets the value of the paymentBehaviourText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviourText() {
        return paymentBehaviourText;
    }

    /**
     * Sets the value of the paymentBehaviourText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviourText(String value) {
        this.paymentBehaviourText = value;
    }

    /**
     * Gets the value of the paymentBehaviourDaysQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentBehaviourDaysQuantity() {
        return paymentBehaviourDaysQuantity;
    }

    /**
     * Sets the value of the paymentBehaviourDaysQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentBehaviourDaysQuantity(BigInteger value) {
        this.paymentBehaviourDaysQuantity = value;
    }

    /**
     * Gets the value of the paymentBehaviorMedianQuartileText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviorMedianQuartileText() {
        return paymentBehaviorMedianQuartileText;
    }

    /**
     * Sets the value of the paymentBehaviorMedianQuartileText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviorMedianQuartileText(String value) {
        this.paymentBehaviorMedianQuartileText = value;
    }

    /**
     * Gets the value of the paymentBehaviorUpperQuartileText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviorUpperQuartileText() {
        return paymentBehaviorUpperQuartileText;
    }

    /**
     * Sets the value of the paymentBehaviorUpperQuartileText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviorUpperQuartileText(String value) {
        this.paymentBehaviorUpperQuartileText = value;
    }

    /**
     * Gets the value of the paymentBehaviorLowerQuartileText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBehaviorLowerQuartileText() {
        return paymentBehaviorLowerQuartileText;
    }

    /**
     * Sets the value of the paymentBehaviorLowerQuartileText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBehaviorLowerQuartileText(String value) {
        this.paymentBehaviorLowerQuartileText = value;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OverallSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalMinimumPaymentAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalPastDueCycleSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}TotalPastDueCycleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "totalMinimumPaymentAmount",
    "totalCurrentBalanceAmount",
    "totalCurrentDueAmount",
    "totalPastDueAmount",
    "totalPastDueCycleSummary"
})
@XmlSeeAlso({
    CurrentPaymentSummary.class
})
public class OverallSummary {

    @XmlElementRef(name = "TotalMinimumPaymentAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalMinimumPaymentAmount;
    @XmlElementRef(name = "TotalCurrentBalanceAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalCurrentBalanceAmount;
    @XmlElementRef(name = "TotalCurrentDueAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalCurrentDueAmount;
    @XmlElementRef(name = "TotalPastDueAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalPastDueAmount;
    @XmlElement(name = "TotalPastDueCycleSummary", nillable = true)
    protected List<TotalPastDueCycleSummary> totalPastDueCycleSummary;

    /**
     * Gets the value of the totalMinimumPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalMinimumPaymentAmount() {
        return totalMinimumPaymentAmount;
    }

    /**
     * Sets the value of the totalMinimumPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalMinimumPaymentAmount(JAXBElement<AmountType> value) {
        this.totalMinimumPaymentAmount = value;
    }

    /**
     * Gets the value of the totalCurrentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalCurrentBalanceAmount() {
        return totalCurrentBalanceAmount;
    }

    /**
     * Sets the value of the totalCurrentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalCurrentBalanceAmount(JAXBElement<AmountType> value) {
        this.totalCurrentBalanceAmount = value;
    }

    /**
     * Gets the value of the totalCurrentDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalCurrentDueAmount() {
        return totalCurrentDueAmount;
    }

    /**
     * Sets the value of the totalCurrentDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalCurrentDueAmount(JAXBElement<AmountType> value) {
        this.totalCurrentDueAmount = value;
    }

    /**
     * Gets the value of the totalPastDueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPastDueAmount() {
        return totalPastDueAmount;
    }

    /**
     * Sets the value of the totalPastDueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPastDueAmount(JAXBElement<AmountType> value) {
        this.totalPastDueAmount = value;
    }

    /**
     * Gets the value of the totalPastDueCycleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalPastDueCycleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalPastDueCycleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TotalPastDueCycleSummary }
     * 
     * 
     */
    public List<TotalPastDueCycleSummary> getTotalPastDueCycleSummary() {
        if (totalPastDueCycleSummary == null) {
            totalPastDueCycleSummary = new ArrayList<TotalPastDueCycleSummary>();
        }
        return this.totalPastDueCycleSummary;
    }

}

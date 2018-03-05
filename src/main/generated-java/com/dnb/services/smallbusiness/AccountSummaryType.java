
package com.dnb.services.smallbusiness;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalBalloonAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentCreditLineAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAvailableCreditAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalCurrentBalanceAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSummaryType", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "totalBalloonAmount",
    "totalCurrentCreditLineAmount",
    "totalAvailableCreditAmount",
    "totalCurrentBalanceAmount"
})
public class AccountSummaryType {

    @XmlElementRef(name = "TotalBalloonAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalBalloonAmount;
    @XmlElementRef(name = "TotalCurrentCreditLineAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalCurrentCreditLineAmount;
    @XmlElementRef(name = "TotalAvailableCreditAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalAvailableCreditAmount;
    @XmlElementRef(name = "TotalCurrentBalanceAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalCurrentBalanceAmount;

    /**
     * Gets the value of the totalBalloonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalBalloonAmount() {
        return totalBalloonAmount;
    }

    /**
     * Sets the value of the totalBalloonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalBalloonAmount(JAXBElement<AmountType> value) {
        this.totalBalloonAmount = value;
    }

    /**
     * Gets the value of the totalCurrentCreditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalCurrentCreditLineAmount() {
        return totalCurrentCreditLineAmount;
    }

    /**
     * Sets the value of the totalCurrentCreditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalCurrentCreditLineAmount(JAXBElement<AmountType> value) {
        this.totalCurrentCreditLineAmount = value;
    }

    /**
     * Gets the value of the totalAvailableCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalAvailableCreditAmount() {
        return totalAvailableCreditAmount;
    }

    /**
     * Sets the value of the totalAvailableCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalAvailableCreditAmount(JAXBElement<AmountType> value) {
        this.totalAvailableCreditAmount = value;
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

}


package com.dnb.services.smallbusiness;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LenderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentReportedDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OpenAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AccountRelationshipText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="OpenedDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ClosedDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="VoluntarilyClosedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaturityDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="SecuredAccountIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CollateralTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PaymentTypeText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PaymentFrequencyText" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="BalloonPaymentDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="BalloonAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="LastPaymentDate" type="{http://services.dnb.com/SBRIProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="OriginalAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentCreditLineAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="HighBalanceAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="AvailableCreditAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="CurrentBalanceAmount" type="{http://services.dnb.com/SBRIProductServiceV2.0}AmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetail", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "lenderName",
    "lenderID",
    "paymentReportedDate",
    "openAccountIndicator",
    "accountRelationshipText",
    "openedDate",
    "closedDate",
    "voluntarilyClosedIndicator",
    "maturityDate",
    "securedAccountIndicator",
    "collateralTypeText",
    "paymentTypeText",
    "paymentFrequencyText",
    "balloonPaymentDate",
    "balloonAmount",
    "lastPaymentDate",
    "originalAmount",
    "currentCreditLineAmount",
    "highBalanceAmount",
    "availableCreditAmount",
    "currentBalanceAmount"
})
public class AccountDetail {

    @XmlElementRef(name = "LenderName", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lenderName;
    @XmlElementRef(name = "LenderID", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> lenderID;
    @XmlElementRef(name = "PaymentReportedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> paymentReportedDate;
    @XmlElementRef(name = "OpenAccountIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> openAccountIndicator;
    @XmlElementRef(name = "AccountRelationshipText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> accountRelationshipText;
    @XmlElementRef(name = "OpenedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> openedDate;
    @XmlElementRef(name = "ClosedDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> closedDate;
    @XmlElementRef(name = "VoluntarilyClosedIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> voluntarilyClosedIndicator;
    @XmlElementRef(name = "MaturityDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> maturityDate;
    @XmlElementRef(name = "SecuredAccountIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> securedAccountIndicator;
    @XmlElementRef(name = "CollateralTypeText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> collateralTypeText;
    @XmlElementRef(name = "PaymentTypeText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> paymentTypeText;
    @XmlElementRef(name = "PaymentFrequencyText", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDecodedStringType> paymentFrequencyText;
    @XmlElementRef(name = "BalloonPaymentDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> balloonPaymentDate;
    @XmlElementRef(name = "BalloonAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> balloonAmount;
    @XmlElementRef(name = "LastPaymentDate", type = JAXBElement.class, required = false)
    protected JAXBElement<DNBDateType> lastPaymentDate;
    @XmlElementRef(name = "OriginalAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> originalAmount;
    @XmlElementRef(name = "CurrentCreditLineAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentCreditLineAmount;
    @XmlElementRef(name = "HighBalanceAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> highBalanceAmount;
    @XmlElementRef(name = "AvailableCreditAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> availableCreditAmount;
    @XmlElementRef(name = "CurrentBalanceAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentBalanceAmount;

    /**
     * Gets the value of the lenderName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLenderName() {
        return lenderName;
    }

    /**
     * Sets the value of the lenderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLenderName(JAXBElement<String> value) {
        this.lenderName = value;
    }

    /**
     * Gets the value of the lenderID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLenderID() {
        return lenderID;
    }

    /**
     * Sets the value of the lenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLenderID(JAXBElement<Integer> value) {
        this.lenderID = value;
    }

    /**
     * Gets the value of the paymentReportedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getPaymentReportedDate() {
        return paymentReportedDate;
    }

    /**
     * Sets the value of the paymentReportedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setPaymentReportedDate(JAXBElement<DNBDateType> value) {
        this.paymentReportedDate = value;
    }

    /**
     * Gets the value of the openAccountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getOpenAccountIndicator() {
        return openAccountIndicator;
    }

    /**
     * Sets the value of the openAccountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setOpenAccountIndicator(JAXBElement<Boolean> value) {
        this.openAccountIndicator = value;
    }

    /**
     * Gets the value of the accountRelationshipText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getAccountRelationshipText() {
        return accountRelationshipText;
    }

    /**
     * Sets the value of the accountRelationshipText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setAccountRelationshipText(JAXBElement<DNBDecodedStringType> value) {
        this.accountRelationshipText = value;
    }

    /**
     * Gets the value of the openedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getOpenedDate() {
        return openedDate;
    }

    /**
     * Sets the value of the openedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setOpenedDate(JAXBElement<DNBDateType> value) {
        this.openedDate = value;
    }

    /**
     * Gets the value of the closedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getClosedDate() {
        return closedDate;
    }

    /**
     * Sets the value of the closedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setClosedDate(JAXBElement<DNBDateType> value) {
        this.closedDate = value;
    }

    /**
     * Gets the value of the voluntarilyClosedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVoluntarilyClosedIndicator() {
        return voluntarilyClosedIndicator;
    }

    /**
     * Sets the value of the voluntarilyClosedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVoluntarilyClosedIndicator(JAXBElement<Boolean> value) {
        this.voluntarilyClosedIndicator = value;
    }

    /**
     * Gets the value of the maturityDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getMaturityDate() {
        return maturityDate;
    }

    /**
     * Sets the value of the maturityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setMaturityDate(JAXBElement<DNBDateType> value) {
        this.maturityDate = value;
    }

    /**
     * Gets the value of the securedAccountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSecuredAccountIndicator() {
        return securedAccountIndicator;
    }

    /**
     * Sets the value of the securedAccountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSecuredAccountIndicator(JAXBElement<Boolean> value) {
        this.securedAccountIndicator = value;
    }

    /**
     * Gets the value of the collateralTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getCollateralTypeText() {
        return collateralTypeText;
    }

    /**
     * Sets the value of the collateralTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setCollateralTypeText(JAXBElement<DNBDecodedStringType> value) {
        this.collateralTypeText = value;
    }

    /**
     * Gets the value of the paymentTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getPaymentTypeText() {
        return paymentTypeText;
    }

    /**
     * Sets the value of the paymentTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setPaymentTypeText(JAXBElement<DNBDecodedStringType> value) {
        this.paymentTypeText = value;
    }

    /**
     * Gets the value of the paymentFrequencyText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public JAXBElement<DNBDecodedStringType> getPaymentFrequencyText() {
        return paymentFrequencyText;
    }

    /**
     * Sets the value of the paymentFrequencyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDecodedStringType }{@code >}
     *     
     */
    public void setPaymentFrequencyText(JAXBElement<DNBDecodedStringType> value) {
        this.paymentFrequencyText = value;
    }

    /**
     * Gets the value of the balloonPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getBalloonPaymentDate() {
        return balloonPaymentDate;
    }

    /**
     * Sets the value of the balloonPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setBalloonPaymentDate(JAXBElement<DNBDateType> value) {
        this.balloonPaymentDate = value;
    }

    /**
     * Gets the value of the balloonAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBalloonAmount() {
        return balloonAmount;
    }

    /**
     * Sets the value of the balloonAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBalloonAmount(JAXBElement<AmountType> value) {
        this.balloonAmount = value;
    }

    /**
     * Gets the value of the lastPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public JAXBElement<DNBDateType> getLastPaymentDate() {
        return lastPaymentDate;
    }

    /**
     * Sets the value of the lastPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DNBDateType }{@code >}
     *     
     */
    public void setLastPaymentDate(JAXBElement<DNBDateType> value) {
        this.lastPaymentDate = value;
    }

    /**
     * Gets the value of the originalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getOriginalAmount() {
        return originalAmount;
    }

    /**
     * Sets the value of the originalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setOriginalAmount(JAXBElement<AmountType> value) {
        this.originalAmount = value;
    }

    /**
     * Gets the value of the currentCreditLineAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentCreditLineAmount() {
        return currentCreditLineAmount;
    }

    /**
     * Sets the value of the currentCreditLineAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentCreditLineAmount(JAXBElement<AmountType> value) {
        this.currentCreditLineAmount = value;
    }

    /**
     * Gets the value of the highBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getHighBalanceAmount() {
        return highBalanceAmount;
    }

    /**
     * Sets the value of the highBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setHighBalanceAmount(JAXBElement<AmountType> value) {
        this.highBalanceAmount = value;
    }

    /**
     * Gets the value of the availableCreditAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAvailableCreditAmount() {
        return availableCreditAmount;
    }

    /**
     * Sets the value of the availableCreditAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAvailableCreditAmount(JAXBElement<AmountType> value) {
        this.availableCreditAmount = value;
    }

    /**
     * Gets the value of the currentBalanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    /**
     * Sets the value of the currentBalanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentBalanceAmount(JAXBElement<AmountType> value) {
        this.currentBalanceAmount = value;
    }

}

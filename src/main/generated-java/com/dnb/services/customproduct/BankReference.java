
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ReferenceDetailTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="AccountFiguresDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountFiguresDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankReference", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "referenceDate",
    "referenceDetailTypeText",
    "accountFiguresDetail"
})
public class BankReference {

    @XmlElement(name = "ReferenceDate")
    protected DNBDateType referenceDate;
    @XmlElement(name = "ReferenceDetailTypeText")
    protected DNBDecodedStringType referenceDetailTypeText;
    @XmlElement(name = "AccountFiguresDetail")
    protected List<AccountFiguresDetail> accountFiguresDetail;

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setReferenceDate(DNBDateType value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceDetailTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getReferenceDetailTypeText() {
        return referenceDetailTypeText;
    }

    /**
     * Sets the value of the referenceDetailTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setReferenceDetailTypeText(DNBDecodedStringType value) {
        this.referenceDetailTypeText = value;
    }

    /**
     * Gets the value of the accountFiguresDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountFiguresDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountFiguresDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountFiguresDetail }
     * 
     * 
     */
    public List<AccountFiguresDetail> getAccountFiguresDetail() {
        if (accountFiguresDetail == null) {
            accountFiguresDetail = new ArrayList<AccountFiguresDetail>();
        }
        return this.accountFiguresDetail;
    }

}

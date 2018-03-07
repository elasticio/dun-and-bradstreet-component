
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of the supplier.
 *          
 * 
 * <p>Java class for SupplierDetailForCustomerProvidedInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierDetailForCustomerProvidedInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnnualPurchaseAmount" type="{http://services.dnb.com/CustomProductServiceV2.0}AmountType" minOccurs="0"/>
 *         &lt;element name="Shareholder" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierShareholderType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierDetailForCustomerProvidedInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "supplierID",
    "annualPurchaseAmount",
    "shareholder"
})
public class SupplierDetailForCustomerProvidedInformation {

    @XmlElement(name = "SupplierID")
    protected String supplierID;
    @XmlElement(name = "AnnualPurchaseAmount")
    protected AmountType annualPurchaseAmount;
    @XmlElement(name = "Shareholder")
    protected List<SupplierShareholderType> shareholder;

    /**
     * Gets the value of the supplierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierID() {
        return supplierID;
    }

    /**
     * Sets the value of the supplierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierID(String value) {
        this.supplierID = value;
    }

    /**
     * Gets the value of the annualPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAnnualPurchaseAmount() {
        return annualPurchaseAmount;
    }

    /**
     * Sets the value of the annualPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAnnualPurchaseAmount(AmountType value) {
        this.annualPurchaseAmount = value;
    }

    /**
     * Gets the value of the shareholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierShareholderType }
     * 
     * 
     */
    public List<SupplierShareholderType> getShareholder() {
        if (shareholder == null) {
            shareholder = new ArrayList<SupplierShareholderType>();
        }
        return this.shareholder;
    }

}

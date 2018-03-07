
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRatioCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatioCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialRatioCategoryText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FinancialRatioItem" type="{http://services.dnb.com/CustomProductServiceV2.0}FinancialRatioItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatioCategory", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "financialRatioCategoryText",
    "financialRatioItem"
})
public class FinancialRatioCategory {

    @XmlElement(name = "FinancialRatioCategoryText")
    protected DNBDecodedStringType financialRatioCategoryText;
    @XmlElement(name = "FinancialRatioItem")
    protected List<FinancialRatioItem> financialRatioItem;

    /**
     * Gets the value of the financialRatioCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFinancialRatioCategoryText() {
        return financialRatioCategoryText;
    }

    /**
     * Sets the value of the financialRatioCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFinancialRatioCategoryText(DNBDecodedStringType value) {
        this.financialRatioCategoryText = value;
    }

    /**
     * Gets the value of the financialRatioItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialRatioItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialRatioItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialRatioItem }
     * 
     * 
     */
    public List<FinancialRatioItem> getFinancialRatioItem() {
        if (financialRatioItem == null) {
            financialRatioItem = new ArrayList<FinancialRatioItem>();
        }
        return this.financialRatioItem;
    }

}

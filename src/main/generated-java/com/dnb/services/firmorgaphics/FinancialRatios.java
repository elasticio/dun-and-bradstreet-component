
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialRatios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialRatios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialRatioCategory" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}FinancialRatioCategory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialRatios", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "financialRatioCategory"
})
public class FinancialRatios {

    @XmlElement(name = "FinancialRatioCategory")
    protected List<FinancialRatioCategory> financialRatioCategory;

    /**
     * Gets the value of the financialRatioCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialRatioCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialRatioCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialRatioCategory }
     * 
     * 
     */
    public List<FinancialRatioCategory> getFinancialRatioCategory() {
        if (financialRatioCategory == null) {
            financialRatioCategory = new ArrayList<FinancialRatioCategory>();
        }
        return this.financialRatioCategory;
    }

}


package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details and the summarized views about the legally declared inability or impairment of ability of an individual or organization to pay its creditors.
 *          
 * 
 * <p>Java class for BankruptcyInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bankruptcy" type="{http://services.dnb.com/AssessmentProductServiceV2.0}BankruptcyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyInformation", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "bankruptcy"
})
public class BankruptcyInformation {

    @XmlElement(name = "Bankruptcy")
    protected List<BankruptcyType> bankruptcy;

    /**
     * Gets the value of the bankruptcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankruptcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankruptcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankruptcyType }
     * 
     * 
     */
    public List<BankruptcyType> getBankruptcy() {
        if (bankruptcy == null) {
            bankruptcy = new ArrayList<BankruptcyType>();
        }
        return this.bankruptcy;
    }

}

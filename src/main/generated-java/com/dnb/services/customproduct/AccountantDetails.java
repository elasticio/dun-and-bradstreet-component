
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountantDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountantDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountantName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndividualNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccountantOpinion" type="{http://services.dnb.com/CustomProductServiceV2.0}AccountantOpinion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountantDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "accountantName",
    "accountantOpinion"
})
public class AccountantDetails {

    @XmlElement(name = "AccountantName")
    protected List<IndividualNameType> accountantName;
    @XmlElement(name = "AccountantOpinion")
    protected List<AccountantOpinion> accountantOpinion;

    /**
     * Gets the value of the accountantName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountantName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountantName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameType }
     * 
     * 
     */
    public List<IndividualNameType> getAccountantName() {
        if (accountantName == null) {
            accountantName = new ArrayList<IndividualNameType>();
        }
        return this.accountantName;
    }

    /**
     * Gets the value of the accountantOpinion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountantOpinion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountantOpinion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountantOpinion }
     * 
     * 
     */
    public List<AccountantOpinion> getAccountantOpinion() {
        if (accountantOpinion == null) {
            accountantOpinion = new ArrayList<AccountantOpinion>();
        }
        return this.accountantOpinion;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommercialCollectionClaims complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommercialCollectionClaims">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommercialCollectionClaimDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}CommercialCollectionClaimDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommercialCollectionClaims", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "commercialCollectionClaimDetails"
})
public class CommercialCollectionClaims {

    @XmlElement(name = "CommercialCollectionClaimDetails")
    protected List<CommercialCollectionClaimDetails> commercialCollectionClaimDetails;

    /**
     * Gets the value of the commercialCollectionClaimDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialCollectionClaimDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialCollectionClaimDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommercialCollectionClaimDetails }
     * 
     * 
     */
    public List<CommercialCollectionClaimDetails> getCommercialCollectionClaimDetails() {
        if (commercialCollectionClaimDetails == null) {
            commercialCollectionClaimDetails = new ArrayList<CommercialCollectionClaimDetails>();
        }
        return this.commercialCollectionClaimDetails;
    }

}

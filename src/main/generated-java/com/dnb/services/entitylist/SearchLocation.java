
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://services.dnb.com/EntityListServiceV2.0}SearchBaseAddressType" minOccurs="0"/>
 *         &lt;element name="RadiusDetail" type="{http://services.dnb.com/EntityListServiceV2.0}RadiusSearchDetail" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://services.dnb.com/EntityListServiceV2.0}SearchTelephoneNumber" maxOccurs="100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchLocation", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "address",
    "radiusDetail",
    "telephoneNumber"
})
public class SearchLocation {

    @XmlElement(name = "Address")
    protected SearchBaseAddressType address;
    @XmlElement(name = "RadiusDetail")
    protected RadiusSearchDetail radiusDetail;
    @XmlElement(name = "TelephoneNumber")
    protected List<SearchTelephoneNumber> telephoneNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBaseAddressType }
     *     
     */
    public SearchBaseAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBaseAddressType }
     *     
     */
    public void setAddress(SearchBaseAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the radiusDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RadiusSearchDetail }
     *     
     */
    public RadiusSearchDetail getRadiusDetail() {
        return radiusDetail;
    }

    /**
     * Sets the value of the radiusDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadiusSearchDetail }
     *     
     */
    public void setRadiusDetail(RadiusSearchDetail value) {
        this.radiusDetail = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchTelephoneNumber }
     * 
     * 
     */
    public List<SearchTelephoneNumber> getTelephoneNumber() {
        if (telephoneNumber == null) {
            telephoneNumber = new ArrayList<SearchTelephoneNumber>();
        }
        return this.telephoneNumber;
    }

}

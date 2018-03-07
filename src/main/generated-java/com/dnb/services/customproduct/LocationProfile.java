
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the market analysis information on locations as recorded by the data provider. The market analysis information may include deliver industry and economic insight, employment and real estate trends, and valuable resource links for the location.
 *          
 * 
 * <p>Java class for LocationProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationProfileDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LocationProfileDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationProfile", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "locationProfileDetail"
})
public class LocationProfile {

    @XmlElement(name = "LocationProfileDetail")
    protected List<LocationProfileDetail> locationProfileDetail;

    /**
     * Gets the value of the locationProfileDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationProfileDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationProfileDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationProfileDetail }
     * 
     * 
     */
    public List<LocationProfileDetail> getLocationProfileDetail() {
        if (locationProfileDetail == null) {
            locationProfileDetail = new ArrayList<LocationProfileDetail>();
        }
        return this.locationProfileDetail;
    }

}

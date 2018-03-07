
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchBaseAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchBaseAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetropolitanStatisticalAreaUSCensusCode" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchBaseAddressType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "metropolitanStatisticalAreaUSCensusCode"
})
public class SearchBaseAddressType {

    @XmlElement(name = "MetropolitanStatisticalAreaUSCensusCode")
    protected List<String> metropolitanStatisticalAreaUSCensusCode;

    /**
     * Gets the value of the metropolitanStatisticalAreaUSCensusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metropolitanStatisticalAreaUSCensusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetropolitanStatisticalAreaUSCensusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetropolitanStatisticalAreaUSCensusCode() {
        if (metropolitanStatisticalAreaUSCensusCode == null) {
            metropolitanStatisticalAreaUSCensusCode = new ArrayList<String>();
        }
        return this.metropolitanStatisticalAreaUSCensusCode;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the birth location details of the supplier.
 *          
 * 
 * <p>Java class for SupplierAddressDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierAddressDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetAddressLine" type="{http://services.dnb.com/CustomProductServiceV2.0}StreetAddressLine" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierAddressDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "streetAddressLine"
})
public class SupplierAddressDetail {

    @XmlElement(name = "StreetAddressLine")
    protected List<StreetAddressLine> streetAddressLine;

    /**
     * Gets the value of the streetAddressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetAddressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetAddressLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StreetAddressLine }
     * 
     * 
     */
    public List<StreetAddressLine> getStreetAddressLine() {
        if (streetAddressLine == null) {
            streetAddressLine = new ArrayList<StreetAddressLine>();
        }
        return this.streetAddressLine;
    }

}

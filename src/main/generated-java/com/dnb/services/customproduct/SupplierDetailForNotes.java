
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierDetailForNotes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierDetailForNotes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierDetailForNotes", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "organizationIdentificationNumberDetail"
})
public class SupplierDetailForNotes {

    @XmlElement(name = "OrganizationIdentificationNumberDetail")
    protected List<OrganizationIdentificationNumberSimpleType> organizationIdentificationNumberDetail;

    /**
     * Gets the value of the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationIdentificationNumberSimpleType }
     * 
     * 
     */
    public List<OrganizationIdentificationNumberSimpleType> getOrganizationIdentificationNumberDetail() {
        if (organizationIdentificationNumberDetail == null) {
            organizationIdentificationNumberDetail = new ArrayList<OrganizationIdentificationNumberSimpleType>();
        }
        return this.organizationIdentificationNumberDetail;
    }

}


package com.dnb.services.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the constitutional status of a subject as defined under the laws of a country E.g.; Limited Company, Partnership, co-operative Society and the Stock Equity or share structure employed by a business according to the legal form and rules of incorporation. The owners of the stock or shares are the owners of the business.
 *          
 * 
 * <p>Java class for RegisteredDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisteredDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/ReportProductServiceV2.0}OrganizationIdentificationNumberSimpleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisteredDetail", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "organizationIdentificationNumberDetail"
})
public class RegisteredDetail {

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

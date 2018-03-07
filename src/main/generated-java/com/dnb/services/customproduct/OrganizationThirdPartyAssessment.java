
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationThirdPartyAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationThirdPartyAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThirdPartyAssessment" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyAssessment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationThirdPartyAssessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "thirdPartyAssessment"
})
public class OrganizationThirdPartyAssessment {

    @XmlElement(name = "ThirdPartyAssessment")
    protected List<ThirdPartyAssessment> thirdPartyAssessment;

    /**
     * Gets the value of the thirdPartyAssessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thirdPartyAssessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThirdPartyAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdPartyAssessment }
     * 
     * 
     */
    public List<ThirdPartyAssessment> getThirdPartyAssessment() {
        if (thirdPartyAssessment == null) {
            thirdPartyAssessment = new ArrayList<ThirdPartyAssessment>();
        }
        return this.thirdPartyAssessment;
    }

}

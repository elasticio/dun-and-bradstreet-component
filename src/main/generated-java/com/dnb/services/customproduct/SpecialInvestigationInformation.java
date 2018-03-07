
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the most recent and accurate information on the subject collected through research followed by an investigation request submitted by the customer. This section records very specific information on the subject which is not recorded under usual investigation process; e.g., litigation information, internet search results.
 *          
 * 
 * <p>Java class for SpecialInvestigationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialInvestigationInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecialInvestigationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SpecialInvestigationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialInvestigationInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "specialInvestigationDetail"
})
public class SpecialInvestigationInformation {

    @XmlElement(name = "SpecialInvestigationDetail")
    protected List<SpecialInvestigationDetail> specialInvestigationDetail;

    /**
     * Gets the value of the specialInvestigationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialInvestigationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialInvestigationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialInvestigationDetail }
     * 
     * 
     */
    public List<SpecialInvestigationDetail> getSpecialInvestigationDetail() {
        if (specialInvestigationDetail == null) {
            specialInvestigationDetail = new ArrayList<SpecialInvestigationDetail>();
        }
        return this.specialInvestigationDetail;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of supplier provided by the customer.
 *          
 * 
 * <p>Java class for CustomerProvidedSubjectInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProvidedSubjectInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisterSupplierInquiryDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerProvidedSubjectInformation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectDetail"
})
public class CustomerProvidedSubjectInformation {

    @XmlElement(name = "SubjectDetail")
    protected List<RegisterSupplierInquiryDetail> subjectDetail;

    /**
     * Gets the value of the subjectDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterSupplierInquiryDetail }
     * 
     * 
     */
    public List<RegisterSupplierInquiryDetail> getSubjectDetail() {
        if (subjectDetail == null) {
            subjectDetail = new ArrayList<RegisterSupplierInquiryDetail>();
        }
        return this.subjectDetail;
    }

}

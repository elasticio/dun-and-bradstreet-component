
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of the comments posted by the users on the suppliers.
 *          
 * 
 * <p>Java class for SubjectComplianceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectComplianceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assessment" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierThirdPartyAssessment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AlertDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AlertDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectComplianceDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessment",
    "alertDetail"
})
public class SubjectComplianceDetail {

    @XmlElement(name = "Assessment")
    protected List<SupplierThirdPartyAssessment> assessment;
    @XmlElement(name = "AlertDetail")
    protected List<AlertDetail> alertDetail;

    /**
     * Gets the value of the assessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierThirdPartyAssessment }
     * 
     * 
     */
    public List<SupplierThirdPartyAssessment> getAssessment() {
        if (assessment == null) {
            assessment = new ArrayList<SupplierThirdPartyAssessment>();
        }
        return this.assessment;
    }

    /**
     * Gets the value of the alertDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertDetail }
     * 
     * 
     */
    public List<AlertDetail> getAlertDetail() {
        if (alertDetail == null) {
            alertDetail = new ArrayList<AlertDetail>();
        }
        return this.alertDetail;
    }

}

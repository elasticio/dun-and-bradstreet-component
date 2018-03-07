
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details of the supplier existing in a specific customer created workflow queue.
 *          
 * 
 * <p>Java class for SupplierDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectName" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationIdentificationNumberSimpleType" maxOccurs="unbounded"/>
 *         &lt;element name="SubjectTypeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DivisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DivisionDetail"/>
 *         &lt;element name="ThirdPartyAssessment" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierThirdPartyAssessment" maxOccurs="unbounded"/>
 *         &lt;element name="AuditSnapshotDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierQueueDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConsolidatedAssessmentReportAvailabilityIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectName",
    "dunsNumber",
    "organizationIdentificationNumberDetail",
    "subjectTypeText",
    "divisionDetail",
    "thirdPartyAssessment",
    "auditSnapshotDetail",
    "consolidatedAssessmentReportAvailabilityIndicator"
})
public class SupplierDetail {

    @XmlElement(name = "SubjectName")
    protected SubjectName subjectName;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationIdentificationNumberDetail", required = true)
    protected List<OrganizationIdentificationNumberSimpleType> organizationIdentificationNumberDetail;
    @XmlElement(name = "SubjectTypeText")
    protected String subjectTypeText;
    @XmlElement(name = "DivisionDetail", required = true)
    protected DivisionDetail divisionDetail;
    @XmlElement(name = "ThirdPartyAssessment", required = true)
    protected List<SupplierThirdPartyAssessment> thirdPartyAssessment;
    @XmlElement(name = "AuditSnapshotDetail")
    protected List<SupplierQueueDetail> auditSnapshotDetail;
    @XmlElement(name = "ConsolidatedAssessmentReportAvailabilityIndicator")
    protected Boolean consolidatedAssessmentReportAvailabilityIndicator;

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectName }
     *     
     */
    public SubjectName getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectName }
     *     
     */
    public void setSubjectName(SubjectName value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNSNumber(String value) {
        this.dunsNumber = value;
    }

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

    /**
     * Gets the value of the subjectTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectTypeText() {
        return subjectTypeText;
    }

    /**
     * Sets the value of the subjectTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectTypeText(String value) {
        this.subjectTypeText = value;
    }

    /**
     * Gets the value of the divisionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionDetail }
     *     
     */
    public DivisionDetail getDivisionDetail() {
        return divisionDetail;
    }

    /**
     * Sets the value of the divisionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionDetail }
     *     
     */
    public void setDivisionDetail(DivisionDetail value) {
        this.divisionDetail = value;
    }

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
     * {@link SupplierThirdPartyAssessment }
     * 
     * 
     */
    public List<SupplierThirdPartyAssessment> getThirdPartyAssessment() {
        if (thirdPartyAssessment == null) {
            thirdPartyAssessment = new ArrayList<SupplierThirdPartyAssessment>();
        }
        return this.thirdPartyAssessment;
    }

    /**
     * Gets the value of the auditSnapshotDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditSnapshotDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditSnapshotDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierQueueDetail }
     * 
     * 
     */
    public List<SupplierQueueDetail> getAuditSnapshotDetail() {
        if (auditSnapshotDetail == null) {
            auditSnapshotDetail = new ArrayList<SupplierQueueDetail>();
        }
        return this.auditSnapshotDetail;
    }

    /**
     * Gets the value of the consolidatedAssessmentReportAvailabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidatedAssessmentReportAvailabilityIndicator() {
        return consolidatedAssessmentReportAvailabilityIndicator;
    }

    /**
     * Sets the value of the consolidatedAssessmentReportAvailabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidatedAssessmentReportAvailabilityIndicator(Boolean value) {
        this.consolidatedAssessmentReportAvailabilityIndicator = value;
    }

}

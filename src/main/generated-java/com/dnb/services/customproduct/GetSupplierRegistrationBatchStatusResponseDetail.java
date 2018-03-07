
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the details returned based on the request for the status of supplier registration batch.
 *          
 * 
 * <p>Java class for GetSupplierRegistrationBatchStatusResponseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSupplierRegistrationBatchStatusResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierBatchFileDetail" minOccurs="0"/>
 *         &lt;element name="StatusReportSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierRecordStatusSummary" minOccurs="0"/>
 *         &lt;element name="StatusReportDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}StatusReportDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSupplierRegistrationBatchStatusResponseDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "fileDetail",
    "statusReportSummary",
    "statusReportDetail"
})
public class GetSupplierRegistrationBatchStatusResponseDetail {

    @XmlElement(name = "FileDetail")
    protected SupplierBatchFileDetail fileDetail;
    @XmlElement(name = "StatusReportSummary")
    protected SupplierRecordStatusSummary statusReportSummary;
    @XmlElement(name = "StatusReportDetail")
    protected StatusReportDetail statusReportDetail;

    /**
     * Gets the value of the fileDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierBatchFileDetail }
     *     
     */
    public SupplierBatchFileDetail getFileDetail() {
        return fileDetail;
    }

    /**
     * Sets the value of the fileDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBatchFileDetail }
     *     
     */
    public void setFileDetail(SupplierBatchFileDetail value) {
        this.fileDetail = value;
    }

    /**
     * Gets the value of the statusReportSummary property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierRecordStatusSummary }
     *     
     */
    public SupplierRecordStatusSummary getStatusReportSummary() {
        return statusReportSummary;
    }

    /**
     * Sets the value of the statusReportSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRecordStatusSummary }
     *     
     */
    public void setStatusReportSummary(SupplierRecordStatusSummary value) {
        this.statusReportSummary = value;
    }

    /**
     * Gets the value of the statusReportDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReportDetail }
     *     
     */
    public StatusReportDetail getStatusReportDetail() {
        return statusReportDetail;
    }

    /**
     * Sets the value of the statusReportDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReportDetail }
     *     
     */
    public void setStatusReportDetail(StatusReportDetail value) {
        this.statusReportDetail = value;
    }

}

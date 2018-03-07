
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the information on the subject collected through the special investigation process.
 *          
 * 
 * <p>Java class for SpecialInvestigationDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialInvestigationDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryDetailForAlert" minOccurs="0"/>
 *         &lt;element name="LitigationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LawSuitType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Principal" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierPrincipal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Shareholder" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierShareholderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ParentOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}ParentOrganizationForSpecialInvestigation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateOrganization" type="{http://services.dnb.com/CustomProductServiceV2.0}GlobalUltimateOrganizationForSupplier" minOccurs="0"/>
 *         &lt;element name="InternetReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InternetReferenceDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialInvestigationDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "litigationDetail",
    "principal",
    "shareholder",
    "parentOrganization",
    "globalUltimateOrganization",
    "internetReferenceDetail"
})
public class SpecialInvestigationDetail {

    @XmlElement(name = "InquiryDetail")
    protected InquiryDetailForAlert inquiryDetail;
    @XmlElement(name = "LitigationDetail")
    protected List<LawSuitType> litigationDetail;
    @XmlElement(name = "Principal")
    protected List<SupplierPrincipal> principal;
    @XmlElement(name = "Shareholder")
    protected List<SupplierShareholderType> shareholder;
    @XmlElement(name = "ParentOrganization")
    protected List<ParentOrganizationForSpecialInvestigation> parentOrganization;
    @XmlElement(name = "GlobalUltimateOrganization")
    protected GlobalUltimateOrganizationForSupplier globalUltimateOrganization;
    @XmlElement(name = "InternetReferenceDetail")
    protected List<InternetReferenceDetail> internetReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetailForAlert }
     *     
     */
    public InquiryDetailForAlert getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetailForAlert }
     *     
     */
    public void setInquiryDetail(InquiryDetailForAlert value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the litigationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the litigationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLitigationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LawSuitType }
     * 
     * 
     */
    public List<LawSuitType> getLitigationDetail() {
        if (litigationDetail == null) {
            litigationDetail = new ArrayList<LawSuitType>();
        }
        return this.litigationDetail;
    }

    /**
     * Gets the value of the principal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierPrincipal }
     * 
     * 
     */
    public List<SupplierPrincipal> getPrincipal() {
        if (principal == null) {
            principal = new ArrayList<SupplierPrincipal>();
        }
        return this.principal;
    }

    /**
     * Gets the value of the shareholder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shareholder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShareholder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierShareholderType }
     * 
     * 
     */
    public List<SupplierShareholderType> getShareholder() {
        if (shareholder == null) {
            shareholder = new ArrayList<SupplierShareholderType>();
        }
        return this.shareholder;
    }

    /**
     * Gets the value of the parentOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentOrganizationForSpecialInvestigation }
     * 
     * 
     */
    public List<ParentOrganizationForSpecialInvestigation> getParentOrganization() {
        if (parentOrganization == null) {
            parentOrganization = new ArrayList<ParentOrganizationForSpecialInvestigation>();
        }
        return this.parentOrganization;
    }

    /**
     * Gets the value of the globalUltimateOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalUltimateOrganizationForSupplier }
     *     
     */
    public GlobalUltimateOrganizationForSupplier getGlobalUltimateOrganization() {
        return globalUltimateOrganization;
    }

    /**
     * Sets the value of the globalUltimateOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalUltimateOrganizationForSupplier }
     *     
     */
    public void setGlobalUltimateOrganization(GlobalUltimateOrganizationForSupplier value) {
        this.globalUltimateOrganization = value;
    }

    /**
     * Gets the value of the internetReferenceDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetReferenceDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetReferenceDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetReferenceDetail }
     * 
     * 
     */
    public List<InternetReferenceDetail> getInternetReferenceDetail() {
        if (internetReferenceDetail == null) {
            internetReferenceDetail = new ArrayList<InternetReferenceDetail>();
        }
        return this.internetReferenceDetail;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalUltimateOrganizationForSupplier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalUltimateOrganizationForSupplier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationPrimaryName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationNameBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="AssociationTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SubjectTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LitigationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}LawSuitType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "GlobalUltimateOrganizationForSupplier", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationPrimaryName",
    "countryISOAlpha2Code",
    "associationTypeText",
    "subjectTypeText",
    "litigationDetail",
    "internetReferenceDetail"
})
public class GlobalUltimateOrganizationForSupplier {

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationPrimaryName")
    protected List<OrganizationNameBaseType> organizationPrimaryName;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "AssociationTypeText")
    protected DNBDecodedStringType associationTypeText;
    @XmlElement(name = "SubjectTypeText")
    protected DNBDecodedStringType subjectTypeText;
    @XmlElement(name = "LitigationDetail")
    protected List<LawSuitType> litigationDetail;
    @XmlElement(name = "InternetReferenceDetail")
    protected List<InternetReferenceDetail> internetReferenceDetail;

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
     * Gets the value of the organizationPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizationPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganizationPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganizationNameBaseType }
     * 
     * 
     */
    public List<OrganizationNameBaseType> getOrganizationPrimaryName() {
        if (organizationPrimaryName == null) {
            organizationPrimaryName = new ArrayList<OrganizationNameBaseType>();
        }
        return this.organizationPrimaryName;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the associationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAssociationTypeText() {
        return associationTypeText;
    }

    /**
     * Sets the value of the associationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAssociationTypeText(DNBDecodedStringType value) {
        this.associationTypeText = value;
    }

    /**
     * Gets the value of the subjectTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getSubjectTypeText() {
        return subjectTypeText;
    }

    /**
     * Sets the value of the subjectTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setSubjectTypeText(DNBDecodedStringType value) {
        this.subjectTypeText = value;
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

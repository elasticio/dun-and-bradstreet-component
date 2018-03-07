
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildAssociation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}FamilyTreeAssociation">
 *       &lt;sequence>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationName" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}PrimaryAddressType" minOccurs="0"/>
 *         &lt;element name="ShareHoldingPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubjectHeader" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectHeader" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/CustomProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="Financial" type="{http://services.dnb.com/CustomProductServiceV2.0}Financial" minOccurs="0"/>
 *         &lt;element name="OrganizationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}OrganizationDetail" minOccurs="0"/>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryCode" minOccurs="0"/>
 *         &lt;element name="RegisteredDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredDetail" minOccurs="0"/>
 *         &lt;element name="Linkage" type="{http://services.dnb.com/CustomProductServiceV2.0}Linkage" minOccurs="0"/>
 *         &lt;element name="DNBStandardRating" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStandardRatingTypeForPrincipal" minOccurs="0"/>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="RegisteredAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisteredAddressNewType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NameAddressText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildAssociation", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dunsNumber",
    "organizationName",
    "primaryAddress",
    "shareHoldingPercentage",
    "subjectHeader",
    "location",
    "telecommunication",
    "financial",
    "organizationDetail",
    "industryCode",
    "registeredDetail",
    "linkage",
    "dnbStandardRating",
    "operatingStatusText",
    "registeredAddress",
    "nameAddressText"
})
public class ChildAssociation
    extends FamilyTreeAssociation
{

    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "OrganizationName")
    protected OrganizationName organizationName;
    @XmlElement(name = "PrimaryAddress")
    protected PrimaryAddressType primaryAddress;
    @XmlElement(name = "ShareHoldingPercentage")
    protected BigDecimal shareHoldingPercentage;
    @XmlElement(name = "SubjectHeader")
    protected SubjectHeader subjectHeader;
    @XmlElement(name = "Location")
    protected Location location;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "Financial")
    protected Financial financial;
    @XmlElement(name = "OrganizationDetail")
    protected OrganizationDetail organizationDetail;
    @XmlElement(name = "IndustryCode")
    protected IndustryCode industryCode;
    @XmlElement(name = "RegisteredDetail")
    protected RegisteredDetail registeredDetail;
    @XmlElement(name = "Linkage")
    protected Linkage linkage;
    @XmlElement(name = "DNBStandardRating")
    protected DNBStandardRatingTypeForPrincipal dnbStandardRating;
    @XmlElement(name = "OperatingStatusText")
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "RegisteredAddress")
    protected List<RegisteredAddressNewType> registeredAddress;
    @XmlElement(name = "NameAddressText")
    protected DNBStringType256 nameAddressText;

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
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationName }
     *     
     */
    public OrganizationName getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationName }
     *     
     */
    public void setOrganizationName(OrganizationName value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryAddressType }
     *     
     */
    public PrimaryAddressType getPrimaryAddress() {
        return primaryAddress;
    }

    /**
     * Sets the value of the primaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryAddressType }
     *     
     */
    public void setPrimaryAddress(PrimaryAddressType value) {
        this.primaryAddress = value;
    }

    /**
     * Gets the value of the shareHoldingPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShareHoldingPercentage() {
        return shareHoldingPercentage;
    }

    /**
     * Sets the value of the shareHoldingPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShareHoldingPercentage(BigDecimal value) {
        this.shareHoldingPercentage = value;
    }

    /**
     * Gets the value of the subjectHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHeader }
     *     
     */
    public SubjectHeader getSubjectHeader() {
        return subjectHeader;
    }

    /**
     * Sets the value of the subjectHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHeader }
     *     
     */
    public void setSubjectHeader(SubjectHeader value) {
        this.subjectHeader = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the telecommunication property.
     * 
     * @return
     *     possible object is
     *     {@link Telecommunication }
     *     
     */
    public Telecommunication getTelecommunication() {
        return telecommunication;
    }

    /**
     * Sets the value of the telecommunication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telecommunication }
     *     
     */
    public void setTelecommunication(Telecommunication value) {
        this.telecommunication = value;
    }

    /**
     * Gets the value of the financial property.
     * 
     * @return
     *     possible object is
     *     {@link Financial }
     *     
     */
    public Financial getFinancial() {
        return financial;
    }

    /**
     * Sets the value of the financial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financial }
     *     
     */
    public void setFinancial(Financial value) {
        this.financial = value;
    }

    /**
     * Gets the value of the organizationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetail }
     *     
     */
    public OrganizationDetail getOrganizationDetail() {
        return organizationDetail;
    }

    /**
     * Sets the value of the organizationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetail }
     *     
     */
    public void setOrganizationDetail(OrganizationDetail value) {
        this.organizationDetail = value;
    }

    /**
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IndustryCode }
     *     
     */
    public IndustryCode getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustryCode }
     *     
     */
    public void setIndustryCode(IndustryCode value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the registeredDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegisteredDetail }
     *     
     */
    public RegisteredDetail getRegisteredDetail() {
        return registeredDetail;
    }

    /**
     * Sets the value of the registeredDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisteredDetail }
     *     
     */
    public void setRegisteredDetail(RegisteredDetail value) {
        this.registeredDetail = value;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * @return
     *     possible object is
     *     {@link Linkage }
     *     
     */
    public Linkage getLinkage() {
        return linkage;
    }

    /**
     * Sets the value of the linkage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linkage }
     *     
     */
    public void setLinkage(Linkage value) {
        this.linkage = value;
    }

    /**
     * Gets the value of the dnbStandardRating property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public DNBStandardRatingTypeForPrincipal getDNBStandardRating() {
        return dnbStandardRating;
    }

    /**
     * Sets the value of the dnbStandardRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStandardRatingTypeForPrincipal }
     *     
     */
    public void setDNBStandardRating(DNBStandardRatingTypeForPrincipal value) {
        this.dnbStandardRating = value;
    }

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

    /**
     * Gets the value of the registeredAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registeredAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisteredAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredAddressNewType }
     * 
     * 
     */
    public List<RegisteredAddressNewType> getRegisteredAddress() {
        if (registeredAddress == null) {
            registeredAddress = new ArrayList<RegisteredAddressNewType>();
        }
        return this.registeredAddress;
    }

    /**
     * Gets the value of the nameAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getNameAddressText() {
        return nameAddressText;
    }

    /**
     * Sets the value of the nameAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setNameAddressText(DNBStringType256 value) {
        this.nameAddressText = value;
    }

}

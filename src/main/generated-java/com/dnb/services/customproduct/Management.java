
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Management complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Management">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="EstateHoldsPropertyIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DayToDayManagementInactiveIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}DUNSNumberType" minOccurs="0"/>
 *         &lt;element name="GenderText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="BirthYear" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="PrincipalAge" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/CustomProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="EmploymentBiography" type="{http://services.dnb.com/CustomProductServiceV2.0}EmploymentBiography" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponsibleArea" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponsibleArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentManagementResponsibility" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrentManagementResponsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerManagementResponsibility" type="{http://services.dnb.com/CustomProductServiceV2.0}FormerManagementResponsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FamilyRelationship" type="{http://services.dnb.com/CustomProductServiceV2.0}FamilyRelationship" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalAssociation" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentCompensation" type="{http://services.dnb.com/CustomProductServiceV2.0}Compensation" minOccurs="0"/>
 *         &lt;element name="FormerCompensation" type="{http://services.dnb.com/CustomProductServiceV2.0}Compensation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartnershipInterestPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NominalOwnershipIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AntecedentInformationUndisclosedReasonText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonEmploymentDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}PreviousNonEmploymentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SelfEmploymentDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}PreviousSelfEmploymentDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConnectMailNameIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectMailTelephoneIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectMailEmailIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SocialNetworkingDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SocialNetworkingDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}Location" minOccurs="0"/>
 *         &lt;element name="FilingReferenceNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAssessment" type="{http://services.dnb.com/CustomProductServiceV2.0}ThirdPartyAssessment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PrincipalLinkedToFailureOrClosureIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="BirthLocation" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalBirthAddressType" minOccurs="0"/>
 *         &lt;element name="NationalityISOAlpha2Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nationality" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="OccupationText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalEventAssociation" type="{http://services.dnb.com/CustomProductServiceV2.0}LegalEventAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalOfPrincipalDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalOfPrincipalDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "estateHoldsPropertyIndicator",
    "dayToDayManagementInactiveIndicator",
    "dunsNumber",
    "genderText",
    "principalName",
    "birthYear",
    "principalAge",
    "telecommunication",
    "employmentBiography",
    "position",
    "jobTitle",
    "responsibleArea",
    "currentManagementResponsibility",
    "formerManagementResponsibility",
    "familyRelationship",
    "principalAssociation",
    "mostSeniorPrincipalIndicator",
    "principalIdentificationNumberDetail",
    "currentCompensation",
    "formerCompensation",
    "partnershipInterestPercentage",
    "nominalOwnershipIndicator",
    "antecedentInformationUndisclosedReasonText",
    "textEntry",
    "nonEmploymentDetails",
    "selfEmploymentDetails",
    "displaySequence",
    "connectMailNameIndicator",
    "connectMailTelephoneIndicator",
    "connectMailEmailIndicator",
    "socialNetworkingDetail",
    "principalLocation",
    "filingReferenceNumber",
    "thirdPartyAssessment",
    "principalTypeText",
    "principalLinkedToFailureOrClosureIndicator",
    "birthDate",
    "birthLocation",
    "nationalityISOAlpha2Code",
    "nationality",
    "occupationText",
    "legalEventAssociation",
    "principalOfPrincipalDetails"
})
public class Management
    extends Association
{

    @XmlElement(name = "EstateHoldsPropertyIndicator")
    protected Boolean estateHoldsPropertyIndicator;
    @XmlElement(name = "DayToDayManagementInactiveIndicator")
    protected Boolean dayToDayManagementInactiveIndicator;
    @XmlElement(name = "DUNSNumber")
    protected String dunsNumber;
    @XmlElement(name = "GenderText")
    protected DNBDecodedStringType genderText;
    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "BirthYear")
    protected String birthYear;
    @XmlElement(name = "PrincipalAge")
    protected String principalAge;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "EmploymentBiography")
    protected List<EmploymentBiography> employmentBiography;
    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "ResponsibleArea")
    protected List<ResponsibleArea> responsibleArea;
    @XmlElement(name = "CurrentManagementResponsibility")
    protected List<CurrentManagementResponsibility> currentManagementResponsibility;
    @XmlElement(name = "FormerManagementResponsibility")
    protected List<FormerManagementResponsibility> formerManagementResponsibility;
    @XmlElement(name = "FamilyRelationship")
    protected List<FamilyRelationship> familyRelationship;
    @XmlElement(name = "PrincipalAssociation")
    protected List<PrincipalAssociation> principalAssociation;
    @XmlElement(name = "MostSeniorPrincipalIndicator")
    protected Boolean mostSeniorPrincipalIndicator;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected List<PrincipalIdentificationNumberType> principalIdentificationNumberDetail;
    @XmlElement(name = "CurrentCompensation")
    protected Compensation currentCompensation;
    @XmlElement(name = "FormerCompensation")
    protected List<Compensation> formerCompensation;
    @XmlElement(name = "PartnershipInterestPercentage")
    protected BigDecimal partnershipInterestPercentage;
    @XmlElement(name = "NominalOwnershipIndicator")
    protected Boolean nominalOwnershipIndicator;
    @XmlElement(name = "AntecedentInformationUndisclosedReasonText")
    protected DNBDecodedStringType antecedentInformationUndisclosedReasonText;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "NonEmploymentDetails")
    protected List<PreviousNonEmploymentDetailsType> nonEmploymentDetails;
    @XmlElement(name = "SelfEmploymentDetails")
    protected List<PreviousSelfEmploymentDetailsType> selfEmploymentDetails;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;
    @XmlElement(name = "ConnectMailNameIndicator")
    protected Boolean connectMailNameIndicator;
    @XmlElement(name = "ConnectMailTelephoneIndicator")
    protected Boolean connectMailTelephoneIndicator;
    @XmlElement(name = "ConnectMailEmailIndicator")
    protected Boolean connectMailEmailIndicator;
    @XmlElement(name = "SocialNetworkingDetail")
    protected List<SocialNetworkingDetail> socialNetworkingDetail;
    @XmlElement(name = "PrincipalLocation")
    protected Location principalLocation;
    @XmlElement(name = "FilingReferenceNumber")
    protected String filingReferenceNumber;
    @XmlElement(name = "ThirdPartyAssessment")
    protected List<ThirdPartyAssessment> thirdPartyAssessment;
    @XmlElement(name = "PrincipalTypeText")
    protected DNBDecodedStringType principalTypeText;
    @XmlElement(name = "PrincipalLinkedToFailureOrClosureIndicator")
    protected Boolean principalLinkedToFailureOrClosureIndicator;
    @XmlElement(name = "BirthDate")
    protected DNBDateType birthDate;
    @XmlElement(name = "BirthLocation")
    protected PrincipalBirthAddressType birthLocation;
    @XmlElement(name = "NationalityISOAlpha2Code")
    protected String nationalityISOAlpha2Code;
    @XmlElement(name = "Nationality")
    protected String nationality;
    @XmlElement(name = "OccupationText")
    protected String occupationText;
    @XmlElement(name = "LegalEventAssociation")
    protected List<LegalEventAssociationType> legalEventAssociation;
    @XmlElement(name = "PrincipalOfPrincipalDetails")
    protected List<PrincipalOfPrincipalDetailsType> principalOfPrincipalDetails;

    /**
     * Gets the value of the estateHoldsPropertyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstateHoldsPropertyIndicator() {
        return estateHoldsPropertyIndicator;
    }

    /**
     * Sets the value of the estateHoldsPropertyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstateHoldsPropertyIndicator(Boolean value) {
        this.estateHoldsPropertyIndicator = value;
    }

    /**
     * Gets the value of the dayToDayManagementInactiveIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDayToDayManagementInactiveIndicator() {
        return dayToDayManagementInactiveIndicator;
    }

    /**
     * Sets the value of the dayToDayManagementInactiveIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDayToDayManagementInactiveIndicator(Boolean value) {
        this.dayToDayManagementInactiveIndicator = value;
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
     * Gets the value of the genderText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getGenderText() {
        return genderText;
    }

    /**
     * Sets the value of the genderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setGenderText(DNBDecodedStringType value) {
        this.genderText = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectName }
     *     
     */
    public SubjectName getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectName }
     *     
     */
    public void setPrincipalName(SubjectName value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the birthYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the value of the birthYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthYear(String value) {
        this.birthYear = value;
    }

    /**
     * Gets the value of the principalAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalAge() {
        return principalAge;
    }

    /**
     * Sets the value of the principalAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalAge(String value) {
        this.principalAge = value;
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
     * Gets the value of the employmentBiography property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentBiography property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentBiography().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentBiography }
     * 
     * 
     */
    public List<EmploymentBiography> getEmploymentBiography() {
        if (employmentBiography == null) {
            employmentBiography = new ArrayList<EmploymentBiography>();
        }
        return this.employmentBiography;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JobTitle }
     * 
     * 
     */
    public List<JobTitle> getJobTitle() {
        if (jobTitle == null) {
            jobTitle = new ArrayList<JobTitle>();
        }
        return this.jobTitle;
    }

    /**
     * Gets the value of the responsibleArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsibleArea }
     * 
     * 
     */
    public List<ResponsibleArea> getResponsibleArea() {
        if (responsibleArea == null) {
            responsibleArea = new ArrayList<ResponsibleArea>();
        }
        return this.responsibleArea;
    }

    /**
     * Gets the value of the currentManagementResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentManagementResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentManagementResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrentManagementResponsibility }
     * 
     * 
     */
    public List<CurrentManagementResponsibility> getCurrentManagementResponsibility() {
        if (currentManagementResponsibility == null) {
            currentManagementResponsibility = new ArrayList<CurrentManagementResponsibility>();
        }
        return this.currentManagementResponsibility;
    }

    /**
     * Gets the value of the formerManagementResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerManagementResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerManagementResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormerManagementResponsibility }
     * 
     * 
     */
    public List<FormerManagementResponsibility> getFormerManagementResponsibility() {
        if (formerManagementResponsibility == null) {
            formerManagementResponsibility = new ArrayList<FormerManagementResponsibility>();
        }
        return this.formerManagementResponsibility;
    }

    /**
     * Gets the value of the familyRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyRelationship }
     * 
     * 
     */
    public List<FamilyRelationship> getFamilyRelationship() {
        if (familyRelationship == null) {
            familyRelationship = new ArrayList<FamilyRelationship>();
        }
        return this.familyRelationship;
    }

    /**
     * Gets the value of the principalAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalAssociation }
     * 
     * 
     */
    public List<PrincipalAssociation> getPrincipalAssociation() {
        if (principalAssociation == null) {
            principalAssociation = new ArrayList<PrincipalAssociation>();
        }
        return this.principalAssociation;
    }

    /**
     * Gets the value of the mostSeniorPrincipalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMostSeniorPrincipalIndicator() {
        return mostSeniorPrincipalIndicator;
    }

    /**
     * Sets the value of the mostSeniorPrincipalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMostSeniorPrincipalIndicator(Boolean value) {
        this.mostSeniorPrincipalIndicator = value;
    }

    /**
     * Gets the value of the principalIdentificationNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalIdentificationNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalIdentificationNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalIdentificationNumberType }
     * 
     * 
     */
    public List<PrincipalIdentificationNumberType> getPrincipalIdentificationNumberDetail() {
        if (principalIdentificationNumberDetail == null) {
            principalIdentificationNumberDetail = new ArrayList<PrincipalIdentificationNumberType>();
        }
        return this.principalIdentificationNumberDetail;
    }

    /**
     * Gets the value of the currentCompensation property.
     * 
     * @return
     *     possible object is
     *     {@link Compensation }
     *     
     */
    public Compensation getCurrentCompensation() {
        return currentCompensation;
    }

    /**
     * Sets the value of the currentCompensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compensation }
     *     
     */
    public void setCurrentCompensation(Compensation value) {
        this.currentCompensation = value;
    }

    /**
     * Gets the value of the formerCompensation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerCompensation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerCompensation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Compensation }
     * 
     * 
     */
    public List<Compensation> getFormerCompensation() {
        if (formerCompensation == null) {
            formerCompensation = new ArrayList<Compensation>();
        }
        return this.formerCompensation;
    }

    /**
     * Gets the value of the partnershipInterestPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartnershipInterestPercentage() {
        return partnershipInterestPercentage;
    }

    /**
     * Sets the value of the partnershipInterestPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartnershipInterestPercentage(BigDecimal value) {
        this.partnershipInterestPercentage = value;
    }

    /**
     * Gets the value of the nominalOwnershipIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNominalOwnershipIndicator() {
        return nominalOwnershipIndicator;
    }

    /**
     * Sets the value of the nominalOwnershipIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNominalOwnershipIndicator(Boolean value) {
        this.nominalOwnershipIndicator = value;
    }

    /**
     * Gets the value of the antecedentInformationUndisclosedReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getAntecedentInformationUndisclosedReasonText() {
        return antecedentInformationUndisclosedReasonText;
    }

    /**
     * Sets the value of the antecedentInformationUndisclosedReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setAntecedentInformationUndisclosedReasonText(DNBDecodedStringType value) {
        this.antecedentInformationUndisclosedReasonText = value;
    }

    /**
     * Gets the value of the textEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getTextEntry() {
        if (textEntry == null) {
            textEntry = new ArrayList<TextEntryType>();
        }
        return this.textEntry;
    }

    /**
     * Gets the value of the nonEmploymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonEmploymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonEmploymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousNonEmploymentDetailsType }
     * 
     * 
     */
    public List<PreviousNonEmploymentDetailsType> getNonEmploymentDetails() {
        if (nonEmploymentDetails == null) {
            nonEmploymentDetails = new ArrayList<PreviousNonEmploymentDetailsType>();
        }
        return this.nonEmploymentDetails;
    }

    /**
     * Gets the value of the selfEmploymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selfEmploymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelfEmploymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreviousSelfEmploymentDetailsType }
     * 
     * 
     */
    public List<PreviousSelfEmploymentDetailsType> getSelfEmploymentDetails() {
        if (selfEmploymentDetails == null) {
            selfEmploymentDetails = new ArrayList<PreviousSelfEmploymentDetailsType>();
        }
        return this.selfEmploymentDetails;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

    /**
     * Gets the value of the connectMailNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectMailNameIndicator() {
        return connectMailNameIndicator;
    }

    /**
     * Sets the value of the connectMailNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectMailNameIndicator(Boolean value) {
        this.connectMailNameIndicator = value;
    }

    /**
     * Gets the value of the connectMailTelephoneIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectMailTelephoneIndicator() {
        return connectMailTelephoneIndicator;
    }

    /**
     * Sets the value of the connectMailTelephoneIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectMailTelephoneIndicator(Boolean value) {
        this.connectMailTelephoneIndicator = value;
    }

    /**
     * Gets the value of the connectMailEmailIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectMailEmailIndicator() {
        return connectMailEmailIndicator;
    }

    /**
     * Sets the value of the connectMailEmailIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectMailEmailIndicator(Boolean value) {
        this.connectMailEmailIndicator = value;
    }

    /**
     * Gets the value of the socialNetworkingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialNetworkingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialNetworkingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialNetworkingDetail }
     * 
     * 
     */
    public List<SocialNetworkingDetail> getSocialNetworkingDetail() {
        if (socialNetworkingDetail == null) {
            socialNetworkingDetail = new ArrayList<SocialNetworkingDetail>();
        }
        return this.socialNetworkingDetail;
    }

    /**
     * Gets the value of the principalLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getPrincipalLocation() {
        return principalLocation;
    }

    /**
     * Sets the value of the principalLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setPrincipalLocation(Location value) {
        this.principalLocation = value;
    }

    /**
     * Gets the value of the filingReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingReferenceNumber() {
        return filingReferenceNumber;
    }

    /**
     * Sets the value of the filingReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingReferenceNumber(String value) {
        this.filingReferenceNumber = value;
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

    /**
     * Gets the value of the principalTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPrincipalTypeText() {
        return principalTypeText;
    }

    /**
     * Sets the value of the principalTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPrincipalTypeText(DNBDecodedStringType value) {
        this.principalTypeText = value;
    }

    /**
     * Gets the value of the principalLinkedToFailureOrClosureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalLinkedToFailureOrClosureIndicator() {
        return principalLinkedToFailureOrClosureIndicator;
    }

    /**
     * Sets the value of the principalLinkedToFailureOrClosureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalLinkedToFailureOrClosureIndicator(Boolean value) {
        this.principalLinkedToFailureOrClosureIndicator = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setBirthDate(DNBDateType value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the birthLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalBirthAddressType }
     *     
     */
    public PrincipalBirthAddressType getBirthLocation() {
        return birthLocation;
    }

    /**
     * Sets the value of the birthLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalBirthAddressType }
     *     
     */
    public void setBirthLocation(PrincipalBirthAddressType value) {
        this.birthLocation = value;
    }

    /**
     * Gets the value of the nationalityISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityISOAlpha2Code() {
        return nationalityISOAlpha2Code;
    }

    /**
     * Sets the value of the nationalityISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityISOAlpha2Code(String value) {
        this.nationalityISOAlpha2Code = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the occupationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationText() {
        return occupationText;
    }

    /**
     * Sets the value of the occupationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationText(String value) {
        this.occupationText = value;
    }

    /**
     * Gets the value of the legalEventAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legalEventAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegalEventAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegalEventAssociationType }
     * 
     * 
     */
    public List<LegalEventAssociationType> getLegalEventAssociation() {
        if (legalEventAssociation == null) {
            legalEventAssociation = new ArrayList<LegalEventAssociationType>();
        }
        return this.legalEventAssociation;
    }

    /**
     * Gets the value of the principalOfPrincipalDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalOfPrincipalDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalOfPrincipalDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalOfPrincipalDetailsType }
     * 
     * 
     */
    public List<PrincipalOfPrincipalDetailsType> getPrincipalOfPrincipalDetails() {
        if (principalOfPrincipalDetails == null) {
            principalOfPrincipalDetails = new ArrayList<PrincipalOfPrincipalDetailsType>();
        }
        return this.principalOfPrincipalDetails;
    }

}


package com.dnb.services.contact;

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
 *     &lt;extension base="{http://services.dnb.com/ContactProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/ContactProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="BirthYear" type="{http://services.dnb.com/ContactProductServiceV2.0}DNBYearSimpleType" minOccurs="0"/>
 *         &lt;element name="PrincipalAge" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Telecommunication" type="{http://services.dnb.com/ContactProductServiceV2.0}Telecommunication" minOccurs="0"/>
 *         &lt;element name="EmploymentBiography" type="{http://services.dnb.com/ContactProductServiceV2.0}EmploymentBiography" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/ContactProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/ContactProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponsibleArea" type="{http://services.dnb.com/ContactProductServiceV2.0}ResponsibleArea" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentManagementResponsibility" type="{http://services.dnb.com/ContactProductServiceV2.0}CurrentManagementResponsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerManagementResponsibility" type="{http://services.dnb.com/ContactProductServiceV2.0}FormerManagementResponsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/ContactProductServiceV2.0}PrincipalIdentificationNumberType" minOccurs="0"/>
 *         &lt;element name="CurrentCompensation" type="{http://services.dnb.com/ContactProductServiceV2.0}Compensation" minOccurs="0"/>
 *         &lt;element name="FormerCompensation" type="{http://services.dnb.com/ContactProductServiceV2.0}Compensation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ConnectMailNameIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectMailTelephoneIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConnectMailEmailIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
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
    "mostSeniorPrincipalIndicator",
    "principalIdentificationNumberDetail",
    "currentCompensation",
    "formerCompensation",
    "connectMailNameIndicator",
    "connectMailTelephoneIndicator",
    "connectMailEmailIndicator"
})
public class Management
    extends Association
{

    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "BirthYear")
    protected String birthYear;
    @XmlElement(name = "PrincipalAge")
    protected Integer principalAge;
    @XmlElement(name = "Telecommunication")
    protected Telecommunication telecommunication;
    @XmlElement(name = "EmploymentBiography")
    protected EmploymentBiography employmentBiography;
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
    @XmlElement(name = "MostSeniorPrincipalIndicator")
    protected Boolean mostSeniorPrincipalIndicator;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected PrincipalIdentificationNumberType principalIdentificationNumberDetail;
    @XmlElement(name = "CurrentCompensation")
    protected Compensation currentCompensation;
    @XmlElement(name = "FormerCompensation")
    protected List<Compensation> formerCompensation;
    @XmlElement(name = "ConnectMailNameIndicator")
    protected Boolean connectMailNameIndicator;
    @XmlElement(name = "ConnectMailTelephoneIndicator")
    protected Boolean connectMailTelephoneIndicator;
    @XmlElement(name = "ConnectMailEmailIndicator")
    protected Boolean connectMailEmailIndicator;

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
     *     {@link Integer }
     *     
     */
    public Integer getPrincipalAge() {
        return principalAge;
    }

    /**
     * Sets the value of the principalAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrincipalAge(Integer value) {
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
     * @return
     *     possible object is
     *     {@link EmploymentBiography }
     *     
     */
    public EmploymentBiography getEmploymentBiography() {
        return employmentBiography;
    }

    /**
     * Sets the value of the employmentBiography property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentBiography }
     *     
     */
    public void setEmploymentBiography(EmploymentBiography value) {
        this.employmentBiography = value;
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
     * @return
     *     possible object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public PrincipalIdentificationNumberType getPrincipalIdentificationNumberDetail() {
        return principalIdentificationNumberDetail;
    }

    /**
     * Sets the value of the principalIdentificationNumberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalIdentificationNumberType }
     *     
     */
    public void setPrincipalIdentificationNumberDetail(PrincipalIdentificationNumberType value) {
        this.principalIdentificationNumberDetail = value;
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

}


package com.dnb.services.firmorgaphics;

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
 *     &lt;extension base="{http://services.dnb.com/FirmographicsProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="GenderText" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="PrincipalAge" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EmploymentBiography" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}EmploymentBiography" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentManagementResponsibility" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CurrentManagementResponsibility" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalIdentificationNumberDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}PrincipalIdentificationNumberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CurrentCompensation" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}Compensation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "genderText",
    "principalName",
    "principalAge",
    "employmentBiography",
    "jobTitle",
    "currentManagementResponsibility",
    "principalIdentificationNumberDetail",
    "currentCompensation"
})
public class Management
    extends Association
{

    @XmlElement(name = "GenderText")
    protected DNBDecodedStringType genderText;
    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "PrincipalAge")
    protected String principalAge;
    @XmlElement(name = "EmploymentBiography")
    protected List<EmploymentBiography> employmentBiography;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "CurrentManagementResponsibility")
    protected List<CurrentManagementResponsibility> currentManagementResponsibility;
    @XmlElement(name = "PrincipalIdentificationNumberDetail")
    protected List<PrincipalIdentificationNumberType> principalIdentificationNumberDetail;
    @XmlElement(name = "CurrentCompensation")
    protected Compensation currentCompensation;

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

}

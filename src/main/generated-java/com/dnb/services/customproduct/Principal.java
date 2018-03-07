
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the information of each principal that are actively associated with the subject organization.
 *          
 * 
 * <p>Java class for Principal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Principal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefixText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/CustomProductServiceV2.0}CustomerProvidedSubjectNameType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Principal", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "namePrefixText",
    "principalName",
    "jobTitle",
    "countryISOAlpha2Code",
    "dataProviderName"
})
@XmlSeeAlso({
    SupplierPrincipal.class
})
public class Principal {

    @XmlElement(name = "NamePrefixText")
    protected String namePrefixText;
    @XmlElement(name = "PrincipalName")
    protected List<CustomerProvidedSubjectNameType> principalName;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;

    /**
     * Gets the value of the namePrefixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamePrefixText() {
        return namePrefixText;
    }

    /**
     * Sets the value of the namePrefixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamePrefixText(String value) {
        this.namePrefixText = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerProvidedSubjectNameType }
     * 
     * 
     */
    public List<CustomerProvidedSubjectNameType> getPrincipalName() {
        if (principalName == null) {
            principalName = new ArrayList<CustomerProvidedSubjectNameType>();
        }
        return this.principalName;
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
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

}

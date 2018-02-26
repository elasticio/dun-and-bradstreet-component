
package com.dnb.services.entitylist;

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
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/EntityListServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/EntityListServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "principalName",
    "jobTitle",
    "mostSeniorPrincipalIndicator"
})
public class Management
    extends Association
{

    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "MostSeniorPrincipalIndicator")
    protected Boolean mostSeniorPrincipalIndicator;

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

}

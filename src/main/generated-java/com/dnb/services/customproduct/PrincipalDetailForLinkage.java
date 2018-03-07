
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalDetailForLinkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalDetailForLinkage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobTitle" type="{http://services.dnb.com/CustomProductServiceV2.0}JobTitle" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PrincipalDetailForLinkage", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "principalName",
    "jobTitle",
    "litigationDetail",
    "internetReferenceDetail"
})
public class PrincipalDetailForLinkage {

    @XmlElement(name = "PrincipalName")
    protected String principalName;
    @XmlElement(name = "JobTitle")
    protected List<JobTitle> jobTitle;
    @XmlElement(name = "LitigationDetail")
    protected List<LawSuitType> litigationDetail;
    @XmlElement(name = "InternetReferenceDetail")
    protected List<InternetReferenceDetail> internetReferenceDetail;

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalName(String value) {
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

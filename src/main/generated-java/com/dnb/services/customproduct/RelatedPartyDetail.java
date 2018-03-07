
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPartyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPartyDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssociationTypeText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Assessment" type="{http://services.dnb.com/CustomProductServiceV2.0}SupplierThirdPartyAssessment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPartyDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "subjectName",
    "associationTypeText",
    "assessment"
})
public class RelatedPartyDetail {

    @XmlElement(name = "SubjectName")
    protected String subjectName;
    @XmlElement(name = "AssociationTypeText")
    protected String associationTypeText;
    @XmlElement(name = "Assessment")
    protected List<SupplierThirdPartyAssessment> assessment;

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the associationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationTypeText() {
        return associationTypeText;
    }

    /**
     * Sets the value of the associationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationTypeText(String value) {
        this.associationTypeText = value;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierThirdPartyAssessment }
     * 
     * 
     */
    public List<SupplierThirdPartyAssessment> getAssessment() {
        if (assessment == null) {
            assessment = new ArrayList<SupplierThirdPartyAssessment>();
        }
        return this.assessment;
    }

}

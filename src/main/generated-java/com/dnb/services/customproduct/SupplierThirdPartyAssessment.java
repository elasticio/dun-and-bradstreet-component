
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the appraisal/opinion assigned to this subject by an external entity.
 *          
 * 
 * <p>Java class for SupplierThirdPartyAssessment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierThirdPartyAssessment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssessmentTypeValue" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="AssessmentValue" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *         &lt;element name="AssessmentCommentaryText" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierThirdPartyAssessment", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assessmentTypeValue",
    "assessmentValue",
    "assessmentCommentaryText"
})
public class SupplierThirdPartyAssessment {

    @XmlElement(name = "AssessmentTypeValue")
    protected String assessmentTypeValue;
    @XmlElement(name = "AssessmentValue")
    protected String assessmentValue;
    @XmlElement(name = "AssessmentCommentaryText")
    protected List<String> assessmentCommentaryText;

    /**
     * Gets the value of the assessmentTypeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeValue() {
        return assessmentTypeValue;
    }

    /**
     * Sets the value of the assessmentTypeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeValue(String value) {
        this.assessmentTypeValue = value;
    }

    /**
     * Gets the value of the assessmentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentValue() {
        return assessmentValue;
    }

    /**
     * Sets the value of the assessmentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentValue(String value) {
        this.assessmentValue = value;
    }

    /**
     * Gets the value of the assessmentCommentaryText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentCommentaryText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentCommentaryText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentCommentaryText() {
        if (assessmentCommentaryText == null) {
            assessmentCommentaryText = new ArrayList<String>();
        }
        return this.assessmentCommentaryText;
    }

}

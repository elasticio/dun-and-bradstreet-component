
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the statistical information based on the number of years since this organization commenced its operation.
 *          
 * 
 * <p>Java class for YearsInBusinessDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearsInBusinessDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YearsInBusinessCategoryText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssessmentText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearsInBusinessDetail", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "yearsInBusinessCategoryText",
    "assessmentText"
})
public class YearsInBusinessDetail {

    @XmlElement(name = "YearsInBusinessCategoryText", required = true)
    protected String yearsInBusinessCategoryText;
    @XmlElement(name = "AssessmentText")
    protected List<String> assessmentText;

    /**
     * Gets the value of the yearsInBusinessCategoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYearsInBusinessCategoryText() {
        return yearsInBusinessCategoryText;
    }

    /**
     * Sets the value of the yearsInBusinessCategoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYearsInBusinessCategoryText(String value) {
        this.yearsInBusinessCategoryText = value;
    }

    /**
     * Gets the value of the assessmentText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssessmentText() {
        if (assessmentText == null) {
            assessmentText = new ArrayList<String>();
        }
        return this.assessmentText;
    }

}

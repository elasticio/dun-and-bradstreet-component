
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records D&amp;B's proprietary analytics information that identifies the level of predictive data available with D&amp;B to assess the organization’s  viability or to identify the high risk category to which the organization belongs.
 *          
 * 
 * <p>Java class for DataDepthDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDepthDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataDepthIndicator">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AssessmentText" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="512"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDepthDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dataDepthIndicator",
    "assessmentText"
})
public class DataDepthDetailType {

    @XmlElement(name = "DataDepthIndicator", required = true)
    protected String dataDepthIndicator;
    @XmlElement(name = "AssessmentText", required = true)
    protected List<String> assessmentText;

    /**
     * Gets the value of the dataDepthIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDepthIndicator() {
        return dataDepthIndicator;
    }

    /**
     * Sets the value of the dataDepthIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDepthIndicator(String value) {
        this.dataDepthIndicator = value;
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

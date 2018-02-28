
package com.dnb.services.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubjectHeader" type="{http://services.dnb.com/ReportProductServiceV2.0}SubjectHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subject", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "subjectHeader"
})
@XmlSeeAlso({
    Organization.class
})
public class Subject {

    @XmlElement(name = "SubjectHeader", required = true)
    protected SubjectHeader subjectHeader;

    /**
     * Gets the value of the subjectHeader property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectHeader }
     *     
     */
    public SubjectHeader getSubjectHeader() {
        return subjectHeader;
    }

    /**
     * Sets the value of the subjectHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectHeader }
     *     
     */
    public void setSubjectHeader(SubjectHeader value) {
        this.subjectHeader = value;
    }

}

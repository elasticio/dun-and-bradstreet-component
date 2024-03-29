//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.22 at 01:48:05 PM EET 
//


package com.dnb.services.industry;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details on the minor divisions of the industry profile information.
 *          
 * 
 * <p>Java class for ProfileSubChapterDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfileSubChapterDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubChapterName" type="{http://services.dnb.com/IndustryProductServiceV2.0}StringBaseType256"/>
 *         &lt;element name="SubChapterContentDetail" type="{http://services.dnb.com/IndustryProductServiceV2.0}SubChapterContentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileSubChapterDetail", propOrder = {
    "subChapterName",
    "subChapterContentDetail"
})
public class ProfileSubChapterDetail {

    @XmlElement(name = "SubChapterName", required = true)
    protected String subChapterName;
    @XmlElement(name = "SubChapterContentDetail")
    protected List<SubChapterContentDetail> subChapterContentDetail;

    /**
     * Gets the value of the subChapterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubChapterName() {
        return subChapterName;
    }

    /**
     * Sets the value of the subChapterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubChapterName(String value) {
        this.subChapterName = value;
    }

    /**
     * Gets the value of the subChapterContentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subChapterContentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubChapterContentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubChapterContentDetail }
     * 
     * 
     */
    public List<SubChapterContentDetail> getSubChapterContentDetail() {
        if (subChapterContentDetail == null) {
            subChapterContentDetail = new ArrayList<SubChapterContentDetail>();
        }
        return this.subChapterContentDetail;
    }

}

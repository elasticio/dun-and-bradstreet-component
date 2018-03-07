
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryChapterDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryChapterDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChapterName" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType256"/>
 *         &lt;element name="ChapterContentDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ChapterContentDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryChapterDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "chapterName",
    "chapterContentDetail"
})
public class IndustryChapterDetail {

    @XmlElement(name = "ChapterName", required = true)
    protected String chapterName;
    @XmlElement(name = "ChapterContentDetail")
    protected List<ChapterContentDetail> chapterContentDetail;

    /**
     * Gets the value of the chapterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapterName() {
        return chapterName;
    }

    /**
     * Sets the value of the chapterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapterName(String value) {
        this.chapterName = value;
    }

    /**
     * Gets the value of the chapterContentDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapterContentDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapterContentDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChapterContentDetail }
     * 
     * 
     */
    public List<ChapterContentDetail> getChapterContentDetail() {
        if (chapterContentDetail == null) {
            chapterContentDetail = new ArrayList<ChapterContentDetail>();
        }
        return this.chapterContentDetail;
    }

}

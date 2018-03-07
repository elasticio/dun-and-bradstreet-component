
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChapterConversionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChapterConversionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConversionDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="ConversionChapterNumber" type="{http://services.dnb.com/CustomProductServiceV2.0}StringBaseType128" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChapterConversionDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "conversionDate",
    "conversionChapterNumber"
})
public class ChapterConversionDetailsType {

    @XmlElement(name = "ConversionDate")
    protected DNBDateType conversionDate;
    @XmlElement(name = "ConversionChapterNumber")
    protected String conversionChapterNumber;

    /**
     * Gets the value of the conversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getConversionDate() {
        return conversionDate;
    }

    /**
     * Sets the value of the conversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setConversionDate(DNBDateType value) {
        this.conversionDate = value;
    }

    /**
     * Gets the value of the conversionChapterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionChapterNumber() {
        return conversionChapterNumber;
    }

    /**
     * Sets the value of the conversionChapterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionChapterNumber(String value) {
        this.conversionChapterNumber = value;
    }

}

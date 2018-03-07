
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessSizeNorm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessSizeNorm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NormCalculationTimeStamp" type="{http://services.dnb.com/CustomProductServiceV2.0}DateTimestamp" minOccurs="0"/>
 *         &lt;element name="NormDimension" type="{http://services.dnb.com/CustomProductServiceV2.0}NormDimension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NormTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="LowerQuartileValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MedianValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UpperQuartileValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessSizeNorm", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "normCalculationTimeStamp",
    "normDimension",
    "normTypeText",
    "lowerQuartileValue",
    "medianValue",
    "upperQuartileValue"
})
public class BusinessSizeNorm {

    @XmlElement(name = "NormCalculationTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar normCalculationTimeStamp;
    @XmlElement(name = "NormDimension")
    protected List<NormDimension> normDimension;
    @XmlElement(name = "NormTypeText")
    protected DNBDecodedStringType normTypeText;
    @XmlElement(name = "LowerQuartileValue")
    protected BigDecimal lowerQuartileValue;
    @XmlElement(name = "MedianValue")
    protected BigDecimal medianValue;
    @XmlElement(name = "UpperQuartileValue")
    protected BigDecimal upperQuartileValue;

    /**
     * Gets the value of the normCalculationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNormCalculationTimeStamp() {
        return normCalculationTimeStamp;
    }

    /**
     * Sets the value of the normCalculationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNormCalculationTimeStamp(XMLGregorianCalendar value) {
        this.normCalculationTimeStamp = value;
    }

    /**
     * Gets the value of the normDimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normDimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormDimension }
     * 
     * 
     */
    public List<NormDimension> getNormDimension() {
        if (normDimension == null) {
            normDimension = new ArrayList<NormDimension>();
        }
        return this.normDimension;
    }

    /**
     * Gets the value of the normTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getNormTypeText() {
        return normTypeText;
    }

    /**
     * Sets the value of the normTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setNormTypeText(DNBDecodedStringType value) {
        this.normTypeText = value;
    }

    /**
     * Gets the value of the lowerQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerQuartileValue() {
        return lowerQuartileValue;
    }

    /**
     * Sets the value of the lowerQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerQuartileValue(BigDecimal value) {
        this.lowerQuartileValue = value;
    }

    /**
     * Gets the value of the medianValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedianValue() {
        return medianValue;
    }

    /**
     * Sets the value of the medianValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedianValue(BigDecimal value) {
        this.medianValue = value;
    }

    /**
     * Gets the value of the upperQuartileValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperQuartileValue() {
        return upperQuartileValue;
    }

    /**
     * Sets the value of the upperQuartileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperQuartileValue(BigDecimal value) {
        this.upperQuartileValue = value;
    }

}

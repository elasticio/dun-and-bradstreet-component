
package com.dnb.services.ratings.actions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for FullName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullName">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/AssessmentProductServiceV2.0>StringBaseType256">
 *       &lt;attribute name="FormatText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}StringBaseType256" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullName", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "value"
})
public class FullName {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "FormatText")
    protected String formatText;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the formatText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatText() {
        return formatText;
    }

    /**
     * Sets the value of the formatText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatText(String value) {
        this.formatText = value;
    }

}

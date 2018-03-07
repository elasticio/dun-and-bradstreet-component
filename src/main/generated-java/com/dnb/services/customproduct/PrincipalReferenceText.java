
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for PrincipalReferenceText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalReferenceText">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/CustomProductServiceV2.0>StringBaseType256">
 *       &lt;attribute name="PrincipalImportanceLevel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;totalDigits value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalReferenceText", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "value"
})
public class PrincipalReferenceText {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "PrincipalImportanceLevel")
    protected Integer principalImportanceLevel;

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
     * Gets the value of the principalImportanceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrincipalImportanceLevel() {
        return principalImportanceLevel;
    }

    /**
     * Sets the value of the principalImportanceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrincipalImportanceLevel(Integer value) {
        this.principalImportanceLevel = value;
    }

}

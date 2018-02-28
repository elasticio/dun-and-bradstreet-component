
package com.dnb.services.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ManagementResponsibilityText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementResponsibilityText">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/ContactProductServiceV2.0>StringBaseType256">
 *       &lt;attribute name="ManagementResponsibilityCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="16"/>
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
@XmlType(name = "ManagementResponsibilityText", namespace = "http://services.dnb.com/ContactProductServiceV2.0", propOrder = {
    "value"
})
public class ManagementResponsibilityText {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "ManagementResponsibilityCode")
    protected String managementResponsibilityCode;

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
     * Gets the value of the managementResponsibilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementResponsibilityCode() {
        return managementResponsibilityCode;
    }

    /**
     * Sets the value of the managementResponsibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementResponsibilityCode(String value) {
        this.managementResponsibilityCode = value;
    }

}

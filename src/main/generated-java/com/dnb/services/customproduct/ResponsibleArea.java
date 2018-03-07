
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of several different areas for which the Subject has responsibility which are not evident from the position(s) this business entity holds as a principal of this child entity.
 *          
 * 
 * <p>Java class for ResponsibleArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsibleArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResponsibilityAreaText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibleArea", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "responsibilityAreaText"
})
public class ResponsibleArea {

    @XmlElement(name = "ResponsibilityAreaText")
    protected DNBDecodedStringType responsibilityAreaText;

    /**
     * Gets the value of the responsibilityAreaText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getResponsibilityAreaText() {
        return responsibilityAreaText;
    }

    /**
     * Sets the value of the responsibilityAreaText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setResponsibilityAreaText(DNBDecodedStringType value) {
        this.responsibilityAreaText = value;
    }

}

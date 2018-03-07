
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Directors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Directors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DirectorDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Directors", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "directorDetailText"
})
public class Directors {

    @XmlElement(name = "DirectorDetailText", required = true)
    protected List<DNBStringType> directorDetailText;

    /**
     * Gets the value of the directorDetailText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directorDetailText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectorDetailText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBStringType }
     * 
     * 
     */
    public List<DNBStringType> getDirectorDetailText() {
        if (directorDetailText == null) {
            directorDetailText = new ArrayList<DNBStringType>();
        }
        return this.directorDetailText;
    }

}

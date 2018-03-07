
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Officers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Officers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OfficerDetailText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Officers", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "officerDetailText"
})
public class Officers {

    @XmlElement(name = "OfficerDetailText", required = true)
    protected List<DNBStringType> officerDetailText;

    /**
     * Gets the value of the officerDetailText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officerDetailText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficerDetailText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBStringType }
     * 
     * 
     */
    public List<DNBStringType> getOfficerDetailText() {
        if (officerDetailText == null) {
            officerDetailText = new ArrayList<DNBStringType>();
        }
        return this.officerDetailText;
    }

}

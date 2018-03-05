
package com.dnb.services.smallbusiness;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivitiesAndOperations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivitiesAndOperations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LineOfBusinessDetails" type="{http://services.dnb.com/SBRIProductServiceV2.0}LineOfBusinessDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivitiesAndOperations", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "lineOfBusinessDetails"
})
public class ActivitiesAndOperations {

    @XmlElement(name = "LineOfBusinessDetails")
    protected List<LineOfBusinessDetailsType> lineOfBusinessDetails;

    /**
     * Gets the value of the lineOfBusinessDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOfBusinessDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOfBusinessDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineOfBusinessDetailsType }
     * 
     * 
     */
    public List<LineOfBusinessDetailsType> getLineOfBusinessDetails() {
        if (lineOfBusinessDetails == null) {
            lineOfBusinessDetails = new ArrayList<LineOfBusinessDetailsType>();
        }
        return this.lineOfBusinessDetails;
    }

}

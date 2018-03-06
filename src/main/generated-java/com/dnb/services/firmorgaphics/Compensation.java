
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Compensation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Compensation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompensationDate" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="CompensationDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CompensationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Compensation", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "compensationDate",
    "compensationDetail"
})
public class Compensation {

    @XmlElement(name = "CompensationDate")
    protected DNBDateType compensationDate;
    @XmlElement(name = "CompensationDetail")
    protected List<CompensationDetail> compensationDetail;

    /**
     * Gets the value of the compensationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getCompensationDate() {
        return compensationDate;
    }

    /**
     * Sets the value of the compensationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setCompensationDate(DNBDateType value) {
        this.compensationDate = value;
    }

    /**
     * Gets the value of the compensationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompensationDetail }
     * 
     * 
     */
    public List<CompensationDetail> getCompensationDetail() {
        if (compensationDetail == null) {
            compensationDetail = new ArrayList<CompensationDetail>();
        }
        return this.compensationDetail;
    }

}

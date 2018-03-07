
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingStatusDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingStatusDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatingStatusText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *         &lt;element name="OperatingStatusComment" type="{http://services.dnb.com/CustomProductServiceV2.0}OperatingStatusComment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OperatingStatusFromDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingStatusDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "operatingStatusText",
    "operatingStatusComment",
    "operatingStatusFromDate"
})
@XmlSeeAlso({
    OperatingStatusDetailHistory.class
})
public class OperatingStatusDetail {

    @XmlElement(name = "OperatingStatusText", required = true)
    protected DNBDecodedStringType operatingStatusText;
    @XmlElement(name = "OperatingStatusComment")
    protected List<OperatingStatusComment> operatingStatusComment;
    @XmlElement(name = "OperatingStatusFromDate")
    protected DNBDateType operatingStatusFromDate;

    /**
     * Gets the value of the operatingStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getOperatingStatusText() {
        return operatingStatusText;
    }

    /**
     * Sets the value of the operatingStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setOperatingStatusText(DNBDecodedStringType value) {
        this.operatingStatusText = value;
    }

    /**
     * Gets the value of the operatingStatusComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingStatusComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingStatusComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatingStatusComment }
     * 
     * 
     */
    public List<OperatingStatusComment> getOperatingStatusComment() {
        if (operatingStatusComment == null) {
            operatingStatusComment = new ArrayList<OperatingStatusComment>();
        }
        return this.operatingStatusComment;
    }

    /**
     * Gets the value of the operatingStatusFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getOperatingStatusFromDate() {
        return operatingStatusFromDate;
    }

    /**
     * Sets the value of the operatingStatusFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setOperatingStatusFromDate(DNBDateType value) {
        this.operatingStatusFromDate = value;
    }

}

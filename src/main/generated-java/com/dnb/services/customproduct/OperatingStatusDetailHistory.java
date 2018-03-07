
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingStatusDetailHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingStatusDetailHistory">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}OperatingStatusDetail">
 *       &lt;sequence>
 *         &lt;element name="OperatingStatusToDate" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDateType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingStatusDetailHistory", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "operatingStatusToDate"
})
public class OperatingStatusDetailHistory
    extends OperatingStatusDetail
{

    @XmlElement(name = "OperatingStatusToDate", required = true)
    protected DNBDateType operatingStatusToDate;

    /**
     * Gets the value of the operatingStatusToDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getOperatingStatusToDate() {
        return operatingStatusToDate;
    }

    /**
     * Sets the value of the operatingStatusToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setOperatingStatusToDate(DNBDateType value) {
        this.operatingStatusToDate = value;
    }

}

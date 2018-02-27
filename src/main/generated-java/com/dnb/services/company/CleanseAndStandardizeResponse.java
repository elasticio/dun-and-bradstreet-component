
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation enables the Standardize engine to respond with the corrected and/or standardized name and/or address in real time based on the information provided by the Customer/User.
 *          
 * 
 * <p>Java class for CleanseAndStandardizeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleanseAndStandardizeResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="CleanseAndStandardizeResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CleanseAndStandardizeResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanseAndStandardizeResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "cleanseAndStandardizeResponseDetail"
})
public class CleanseAndStandardizeResponse
    extends Response
{

    @XmlElement(name = "CleanseAndStandardizeResponseDetail")
    protected CleanseAndStandardizeResponseDetail cleanseAndStandardizeResponseDetail;

    /**
     * Gets the value of the cleanseAndStandardizeResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleanseAndStandardizeResponseDetail }
     *     
     */
    public CleanseAndStandardizeResponseDetail getCleanseAndStandardizeResponseDetail() {
        return cleanseAndStandardizeResponseDetail;
    }

    /**
     * Sets the value of the cleanseAndStandardizeResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanseAndStandardizeResponseDetail }
     *     
     */
    public void setCleanseAndStandardizeResponseDetail(CleanseAndStandardizeResponseDetail value) {
        this.cleanseAndStandardizeResponseDetail = value;
    }

}

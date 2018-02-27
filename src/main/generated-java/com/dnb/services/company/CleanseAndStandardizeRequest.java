
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the Customer/User to request the name and/or address for an organization be corrected and/or standardized in real time.
 *          
 * 
 * <p>Java class for CleanseAndStandardizeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CleanseAndStandardizeRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="CleanseAndStandardizeRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CleanseAndStandardizeRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CleanseAndStandardizeRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "cleanseAndStandardizeRequestDetail"
})
public class CleanseAndStandardizeRequest
    extends Request
{

    @XmlElement(name = "CleanseAndStandardizeRequestDetail", required = true)
    protected CleanseAndStandardizeRequestDetail cleanseAndStandardizeRequestDetail;

    /**
     * Gets the value of the cleanseAndStandardizeRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CleanseAndStandardizeRequestDetail }
     *     
     */
    public CleanseAndStandardizeRequestDetail getCleanseAndStandardizeRequestDetail() {
        return cleanseAndStandardizeRequestDetail;
    }

    /**
     * Sets the value of the cleanseAndStandardizeRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CleanseAndStandardizeRequestDetail }
     *     
     */
    public void setCleanseAndStandardizeRequestDetail(CleanseAndStandardizeRequestDetail value) {
        this.cleanseAndStandardizeRequestDetail = value;
    }

}

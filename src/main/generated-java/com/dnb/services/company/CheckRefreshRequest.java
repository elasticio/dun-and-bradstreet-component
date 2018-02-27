
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckRefreshRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRefreshRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="CheckRefreshRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CheckRefreshRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRefreshRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "checkRefreshRequestDetail"
})
public class CheckRefreshRequest
    extends Request
{

    @XmlElement(name = "CheckRefreshRequestDetail", required = true)
    protected CheckRefreshRequestDetail checkRefreshRequestDetail;

    /**
     * Gets the value of the checkRefreshRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRefreshRequestDetail }
     *     
     */
    public CheckRefreshRequestDetail getCheckRefreshRequestDetail() {
        return checkRefreshRequestDetail;
    }

    /**
     * Sets the value of the checkRefreshRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRefreshRequestDetail }
     *     
     */
    public void setCheckRefreshRequestDetail(CheckRefreshRequestDetail value) {
        this.checkRefreshRequestDetail = value;
    }

}

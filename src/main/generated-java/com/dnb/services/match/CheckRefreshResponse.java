
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckRefreshResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRefreshResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="CheckRefreshResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}CheckRefreshResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRefreshResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "checkRefreshResponseDetail"
})
public class CheckRefreshResponse
    extends Response
{

    @XmlElement(name = "CheckRefreshResponseDetail")
    protected CheckRefreshResponseDetail checkRefreshResponseDetail;

    /**
     * Gets the value of the checkRefreshResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CheckRefreshResponseDetail }
     *     
     */
    public CheckRefreshResponseDetail getCheckRefreshResponseDetail() {
        return checkRefreshResponseDetail;
    }

    /**
     * Sets the value of the checkRefreshResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckRefreshResponseDetail }
     *     
     */
    public void setCheckRefreshResponseDetail(CheckRefreshResponseDetail value) {
        this.checkRefreshResponseDetail = value;
    }

}


package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCleanseMatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCleanseMatchResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetCleanseMatchResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetCleanseMatchResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCleanseMatchResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getCleanseMatchResponseDetail"
})
public class GetCleanseMatchResponse
    extends Response
{

    @XmlElement(name = "GetCleanseMatchResponseDetail")
    protected GetCleanseMatchResponseDetail getCleanseMatchResponseDetail;

    /**
     * Gets the value of the getCleanseMatchResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetCleanseMatchResponseDetail }
     *     
     */
    public GetCleanseMatchResponseDetail getGetCleanseMatchResponseDetail() {
        return getCleanseMatchResponseDetail;
    }

    /**
     * Sets the value of the getCleanseMatchResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCleanseMatchResponseDetail }
     *     
     */
    public void setGetCleanseMatchResponseDetail(GetCleanseMatchResponseDetail value) {
        this.getCleanseMatchResponseDetail = value;
    }

}

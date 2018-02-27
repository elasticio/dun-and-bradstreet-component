
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFraudScoreResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudScoreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetFraudScoreResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFraudScoreResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getFraudScoreResponseDetail"
})
public class GetFraudScoreResponse
    extends Response
{

    @XmlElement(name = "GetFraudScoreResponseDetail")
    protected GetFraudScoreResponseDetail getFraudScoreResponseDetail;

    /**
     * Gets the value of the getFraudScoreResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetFraudScoreResponseDetail }
     *     
     */
    public GetFraudScoreResponseDetail getGetFraudScoreResponseDetail() {
        return getFraudScoreResponseDetail;
    }

    /**
     * Sets the value of the getFraudScoreResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFraudScoreResponseDetail }
     *     
     */
    public void setGetFraudScoreResponseDetail(GetFraudScoreResponseDetail value) {
        this.getFraudScoreResponseDetail = value;
    }

}

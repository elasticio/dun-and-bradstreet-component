
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetFraudScoreRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetFraudScoreRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetFraudScoreRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetFraudScoreRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetFraudScoreRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getFraudScoreRequestDetail"
})
public class GetFraudScoreRequest
    extends Request
{

    @XmlElement(name = "GetFraudScoreRequestDetail", required = true)
    protected GetFraudScoreRequestDetail getFraudScoreRequestDetail;

    /**
     * Gets the value of the getFraudScoreRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetFraudScoreRequestDetail }
     *     
     */
    public GetFraudScoreRequestDetail getGetFraudScoreRequestDetail() {
        return getFraudScoreRequestDetail;
    }

    /**
     * Sets the value of the getFraudScoreRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetFraudScoreRequestDetail }
     *     
     */
    public void setGetFraudScoreRequestDetail(GetFraudScoreRequestDetail value) {
        this.getFraudScoreRequestDetail = value;
    }

}


package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMatchAndFraudScoreRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMatchAndFraudScoreRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetMatchAndFraudScoreRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetMatchAndFraudScoreRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMatchAndFraudScoreRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getMatchAndFraudScoreRequestDetail"
})
public class GetMatchAndFraudScoreRequest
    extends Request
{

    @XmlElement(name = "GetMatchAndFraudScoreRequestDetail", required = true)
    protected GetMatchAndFraudScoreRequestDetail getMatchAndFraudScoreRequestDetail;

    /**
     * Gets the value of the getMatchAndFraudScoreRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetMatchAndFraudScoreRequestDetail }
     *     
     */
    public GetMatchAndFraudScoreRequestDetail getGetMatchAndFraudScoreRequestDetail() {
        return getMatchAndFraudScoreRequestDetail;
    }

    /**
     * Sets the value of the getMatchAndFraudScoreRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMatchAndFraudScoreRequestDetail }
     *     
     */
    public void setGetMatchAndFraudScoreRequestDetail(GetMatchAndFraudScoreRequestDetail value) {
        this.getMatchAndFraudScoreRequestDetail = value;
    }

}

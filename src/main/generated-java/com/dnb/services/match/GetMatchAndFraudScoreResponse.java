
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetMatchAndFraudScoreResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetMatchAndFraudScoreResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetMatchAndFraudScoreResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetMatchAndFraudScoreResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMatchAndFraudScoreResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getMatchAndFraudScoreResponseDetail"
})
public class GetMatchAndFraudScoreResponse
    extends Response
{

    @XmlElement(name = "GetMatchAndFraudScoreResponseDetail")
    protected GetMatchAndFraudScoreResponseDetail getMatchAndFraudScoreResponseDetail;

    /**
     * Gets the value of the getMatchAndFraudScoreResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetMatchAndFraudScoreResponseDetail }
     *     
     */
    public GetMatchAndFraudScoreResponseDetail getGetMatchAndFraudScoreResponseDetail() {
        return getMatchAndFraudScoreResponseDetail;
    }

    /**
     * Sets the value of the getMatchAndFraudScoreResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMatchAndFraudScoreResponseDetail }
     *     
     */
    public void setGetMatchAndFraudScoreResponseDetail(GetMatchAndFraudScoreResponseDetail value) {
        this.getMatchAndFraudScoreResponseDetail = value;
    }

}

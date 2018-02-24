
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="MatchResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}MatchResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchResponseDetail"
})
public class MatchResponse
    extends Response
{

    @XmlElement(name = "MatchResponseDetail")
    protected MatchResponseDetail matchResponseDetail;

    /**
     * Gets the value of the matchResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MatchResponseDetail }
     *     
     */
    public MatchResponseDetail getMatchResponseDetail() {
        return matchResponseDetail;
    }

    /**
     * Sets the value of the matchResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchResponseDetail }
     *     
     */
    public void setMatchResponseDetail(MatchResponseDetail value) {
        this.matchResponseDetail = value;
    }

}

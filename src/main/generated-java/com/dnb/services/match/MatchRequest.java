
package com.dnb.services.match;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for MatchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="MatchRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}MatchRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "matchRequestDetail"
})
@XmlRootElement(name = "MatchRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0")
public class MatchRequest
    extends Request
{

    @XmlElement(name = "MatchRequestDetail", required = true)
    protected MatchRequestDetail matchRequestDetail;

    /**
     * Gets the value of the matchRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MatchRequestDetail }
     *     
     */
    public MatchRequestDetail getMatchRequestDetail() {
        return matchRequestDetail;
    }

    /**
     * Sets the value of the matchRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchRequestDetail }
     *     
     */
    public void setMatchRequestDetail(MatchRequestDetail value) {
        this.matchRequestDetail = value;
    }

}

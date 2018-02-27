
package com.dnb.services.company;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetCleanseMatchRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetCleanseMatchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetCleanseMatchRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetCleanseMatchRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCleanseMatchRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getCleanseMatchRequestDetail"
})
@XmlRootElement(name = "GetCleanseMatchRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0")
public class GetCleanseMatchRequest
    extends Request
{

    @XmlElement(name = "GetCleanseMatchRequestDetail", required = true)
    protected GetCleanseMatchRequestDetail getCleanseMatchRequestDetail;

    /**
     * Gets the value of the getCleanseMatchRequestDetail property.
     *
     * @return
     *     possible object is
     *     {@link GetCleanseMatchRequestDetail }
     *
     */
    public GetCleanseMatchRequestDetail getGetCleanseMatchRequestDetail() {
        return getCleanseMatchRequestDetail;
    }

    /**
     * Sets the value of the getCleanseMatchRequestDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link GetCleanseMatchRequestDetail }
     *
     */
    public void setGetCleanseMatchRequestDetail(GetCleanseMatchRequestDetail value) {
        this.getCleanseMatchRequestDetail = value;
    }

}

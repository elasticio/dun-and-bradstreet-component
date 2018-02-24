
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRefreshByOrganizationsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRefreshByOrganizationsRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="GetRefreshByOrganizationsRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetRefreshByOrganizationsRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRefreshByOrganizationsRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getRefreshByOrganizationsRequestDetail"
})
public class GetRefreshByOrganizationsRequest
    extends Request
{

    @XmlElement(name = "GetRefreshByOrganizationsRequestDetail", required = true)
    protected GetRefreshByOrganizationsRequestDetail getRefreshByOrganizationsRequestDetail;

    /**
     * Gets the value of the getRefreshByOrganizationsRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetRefreshByOrganizationsRequestDetail }
     *     
     */
    public GetRefreshByOrganizationsRequestDetail getGetRefreshByOrganizationsRequestDetail() {
        return getRefreshByOrganizationsRequestDetail;
    }

    /**
     * Sets the value of the getRefreshByOrganizationsRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRefreshByOrganizationsRequestDetail }
     *     
     */
    public void setGetRefreshByOrganizationsRequestDetail(GetRefreshByOrganizationsRequestDetail value) {
        this.getRefreshByOrganizationsRequestDetail = value;
    }

}

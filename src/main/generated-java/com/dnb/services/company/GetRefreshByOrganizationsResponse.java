
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRefreshByOrganizationsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRefreshByOrganizationsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="GetRefreshByOrganizationsResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}GetRefreshByOrganizationsResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRefreshByOrganizationsResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "getRefreshByOrganizationsResponseDetail"
})
public class GetRefreshByOrganizationsResponse
    extends Response
{

    @XmlElement(name = "GetRefreshByOrganizationsResponseDetail")
    protected GetRefreshByOrganizationsResponseDetail getRefreshByOrganizationsResponseDetail;

    /**
     * Gets the value of the getRefreshByOrganizationsResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GetRefreshByOrganizationsResponseDetail }
     *     
     */
    public GetRefreshByOrganizationsResponseDetail getGetRefreshByOrganizationsResponseDetail() {
        return getRefreshByOrganizationsResponseDetail;
    }

    /**
     * Sets the value of the getRefreshByOrganizationsResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRefreshByOrganizationsResponseDetail }
     *     
     */
    public void setGetRefreshByOrganizationsResponseDetail(GetRefreshByOrganizationsResponseDetail value) {
        this.getRefreshByOrganizationsResponseDetail = value;
    }

}

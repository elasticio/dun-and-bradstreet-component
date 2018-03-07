
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.*;


/**
 * 
 * This operation allows the Customer/User to find a potential list of prospects from the D&B database based on search criteria.
 *          
 * 
 * <p>Java class for FindCompanyRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompanyRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="FindCompanyRequestDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompanyRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompanyRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findCompanyRequestDetail"
})
@XmlRootElement(name = "FindCompanyRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0")
public class FindCompanyRequest
    extends Request
{

    @XmlElement(name = "FindCompanyRequestDetail", required = true)
    protected FindCompanyRequestDetail findCompanyRequestDetail;

    /**
     * Gets the value of the findCompanyRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompanyRequestDetail }
     *     
     */
    public FindCompanyRequestDetail getFindCompanyRequestDetail() {
        return findCompanyRequestDetail;
    }

    /**
     * Sets the value of the findCompanyRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompanyRequestDetail }
     *     
     */
    public void setFindCompanyRequestDetail(FindCompanyRequestDetail value) {
        this.findCompanyRequestDetail = value;
    }

}

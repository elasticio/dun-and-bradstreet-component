
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This operation allows the Customer/User to find a potential list of industries represented by D&B Hoovers Industry Coding scheme from the D&B database based on search criteria.
 *          
 * 
 * <p>Java class for FindIndustryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="FindIndustryRequestDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustryRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindIndustryRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findIndustryRequestDetail"
})
public class FindIndustryRequest
    extends Request
{

    @XmlElement(name = "FindIndustryRequestDetail", required = true)
    protected FindIndustryRequestDetail findIndustryRequestDetail;

    /**
     * Gets the value of the findIndustryRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindIndustryRequestDetail }
     *     
     */
    public FindIndustryRequestDetail getFindIndustryRequestDetail() {
        return findIndustryRequestDetail;
    }

    /**
     * Sets the value of the findIndustryRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindIndustryRequestDetail }
     *     
     */
    public void setFindIndustryRequestDetail(FindIndustryRequestDetail value) {
        this.findIndustryRequestDetail = value;
    }

}


package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data on industries represented by D&B Hoovers Industry Coding scheme from the D&B database based on search criteria.
 *          
 * 
 * <p>Java class for FindIndustryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustryResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="FindIndustryResponseDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustryResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindIndustryResponse", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findIndustryResponseDetail"
})
public class FindIndustryResponse
    extends Response
{

    @XmlElement(name = "FindIndustryResponseDetail")
    protected FindIndustryResponseDetail findIndustryResponseDetail;

    /**
     * Gets the value of the findIndustryResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindIndustryResponseDetail }
     *     
     */
    public FindIndustryResponseDetail getFindIndustryResponseDetail() {
        return findIndustryResponseDetail;
    }

    /**
     * Sets the value of the findIndustryResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindIndustryResponseDetail }
     *     
     */
    public void setFindIndustryResponseDetail(FindIndustryResponseDetail value) {
        this.findIndustryResponseDetail = value;
    }

}

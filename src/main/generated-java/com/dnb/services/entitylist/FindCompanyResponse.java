
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to responses for search based on organization related information. This may include such details as the number of candidates that matched the search criteria,candidate information etc.
 *          
 * 
 * <p>Java class for FindCompanyResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompanyResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="FindCompanyResponseDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompanyResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompanyResponse", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findCompanyResponseDetail"
})
public class FindCompanyResponse
    extends Response
{

    @XmlElement(name = "FindCompanyResponseDetail")
    protected FindCompanyResponseDetail findCompanyResponseDetail;

    /**
     * Gets the value of the findCompanyResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompanyResponseDetail }
     *     
     */
    public FindCompanyResponseDetail getFindCompanyResponseDetail() {
        return findCompanyResponseDetail;
    }

    /**
     * Sets the value of the findCompanyResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompanyResponseDetail }
     *     
     */
    public void setFindCompanyResponseDetail(FindCompanyResponseDetail value) {
        this.findCompanyResponseDetail = value;
    }

}


package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNumberResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNumberResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="SearchByFilingNumberResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNumberResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNumberResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "searchByFilingNumberResponseDetail"
})
public class SearchByFilingNumberResponse
    extends Response
{

    @XmlElement(name = "SearchByFilingNumberResponseDetail")
    protected SearchByFilingNumberResponseDetail searchByFilingNumberResponseDetail;

    /**
     * Gets the value of the searchByFilingNumberResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNumberResponseDetail }
     *     
     */
    public SearchByFilingNumberResponseDetail getSearchByFilingNumberResponseDetail() {
        return searchByFilingNumberResponseDetail;
    }

    /**
     * Sets the value of the searchByFilingNumberResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNumberResponseDetail }
     *     
     */
    public void setSearchByFilingNumberResponseDetail(SearchByFilingNumberResponseDetail value) {
        this.searchByFilingNumberResponseDetail = value;
    }

}

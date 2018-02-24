
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNumberRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNumberRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="SearchByFilingNumberRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNumberRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNumberRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "searchByFilingNumberRequestDetail"
})
public class SearchByFilingNumberRequest
    extends Request
{

    @XmlElement(name = "SearchByFilingNumberRequestDetail", required = true)
    protected SearchByFilingNumberRequestDetail searchByFilingNumberRequestDetail;

    /**
     * Gets the value of the searchByFilingNumberRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNumberRequestDetail }
     *     
     */
    public SearchByFilingNumberRequestDetail getSearchByFilingNumberRequestDetail() {
        return searchByFilingNumberRequestDetail;
    }

    /**
     * Sets the value of the searchByFilingNumberRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNumberRequestDetail }
     *     
     */
    public void setSearchByFilingNumberRequestDetail(SearchByFilingNumberRequestDetail value) {
        this.searchByFilingNumberRequestDetail = value;
    }

}

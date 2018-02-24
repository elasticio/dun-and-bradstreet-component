
package com.dnb.services.match;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="SearchByFilingNameRequestDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNameRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameRequest", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "searchByFilingNameRequestDetail"
})
public class SearchByFilingNameRequest
    extends Request
{

    @XmlElement(name = "SearchByFilingNameRequestDetail", required = true)
    protected SearchByFilingNameRequestDetail searchByFilingNameRequestDetail;

    /**
     * Gets the value of the searchByFilingNameRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNameRequestDetail }
     *     
     */
    public SearchByFilingNameRequestDetail getSearchByFilingNameRequestDetail() {
        return searchByFilingNameRequestDetail;
    }

    /**
     * Sets the value of the searchByFilingNameRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNameRequestDetail }
     *     
     */
    public void setSearchByFilingNameRequestDetail(SearchByFilingNameRequestDetail value) {
        this.searchByFilingNameRequestDetail = value;
    }

}

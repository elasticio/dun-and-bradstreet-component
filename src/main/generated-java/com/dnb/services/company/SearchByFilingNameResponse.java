
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="SearchByFilingNameResponseDetail" type="{http://services.dnb.com/CompanyServiceV2.0}SearchByFilingNameResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameResponse", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "searchByFilingNameResponseDetail"
})
public class SearchByFilingNameResponse
    extends Response
{

    @XmlElement(name = "SearchByFilingNameResponseDetail")
    protected SearchByFilingNameResponseDetail searchByFilingNameResponseDetail;

    /**
     * Gets the value of the searchByFilingNameResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SearchByFilingNameResponseDetail }
     *     
     */
    public SearchByFilingNameResponseDetail getSearchByFilingNameResponseDetail() {
        return searchByFilingNameResponseDetail;
    }

    /**
     * Sets the value of the searchByFilingNameResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByFilingNameResponseDetail }
     *     
     */
    public void setSearchByFilingNameResponseDetail(SearchByFilingNameResponseDetail value) {
        this.searchByFilingNameResponseDetail = value;
    }

}

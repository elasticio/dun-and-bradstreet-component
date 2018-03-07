
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AirportConcessionDisadvantagedBusinessEnterpriseDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportConcessionDisadvantagedBusinessEnterpriseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataProviderDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}DataProviderDetailForAirportConcession" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportConcessionDisadvantagedBusinessEnterpriseDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dataProviderDetail"
})
public class AirportConcessionDisadvantagedBusinessEnterpriseDetail {

    @XmlElement(name = "DataProviderDetail")
    protected DataProviderDetailForAirportConcession dataProviderDetail;

    /**
     * Gets the value of the dataProviderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DataProviderDetailForAirportConcession }
     *     
     */
    public DataProviderDetailForAirportConcession getDataProviderDetail() {
        return dataProviderDetail;
    }

    /**
     * Sets the value of the dataProviderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataProviderDetailForAirportConcession }
     *     
     */
    public void setDataProviderDetail(DataProviderDetailForAirportConcession value) {
        this.dataProviderDetail = value;
    }

}


package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveProductResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveProductResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/SBRIProductServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="RetrieveProductResponseDetail" type="{http://services.dnb.com/SBRIProductServiceV2.0}RetrieveProductResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveProductResponse", namespace = "http://services.dnb.com/SBRIProductServiceV2.0", propOrder = {
    "retrieveProductResponseDetail"
})
public class RetrieveProductResponse
    extends Response
{

    @XmlElement(name = "RetrieveProductResponseDetail")
    protected RetrieveProductResponseDetail retrieveProductResponseDetail;

    /**
     * Gets the value of the retrieveProductResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveProductResponseDetail }
     *     
     */
    public RetrieveProductResponseDetail getRetrieveProductResponseDetail() {
        return retrieveProductResponseDetail;
    }

    /**
     * Sets the value of the retrieveProductResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveProductResponseDetail }
     *     
     */
    public void setRetrieveProductResponseDetail(RetrieveProductResponseDetail value) {
        this.retrieveProductResponseDetail = value;
    }

}

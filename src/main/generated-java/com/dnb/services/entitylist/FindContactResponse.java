
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindContactResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindContactResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="FindContactResponseDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindContactResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindContactResponse", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findContactResponseDetail"
})
public class FindContactResponse
    extends Response
{

    @XmlElement(name = "FindContactResponseDetail")
    protected FindContactResponseDetail findContactResponseDetail;

    /**
     * Gets the value of the findContactResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindContactResponseDetail }
     *     
     */
    public FindContactResponseDetail getFindContactResponseDetail() {
        return findContactResponseDetail;
    }

    /**
     * Sets the value of the findContactResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindContactResponseDetail }
     *     
     */
    public void setFindContactResponseDetail(FindContactResponseDetail value) {
        this.findContactResponseDetail = value;
    }

}

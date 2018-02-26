
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindContactRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindContactRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="FindContactRequestDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindContactRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindContactRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findContactRequestDetail"
})
public class FindContactRequest
    extends Request
{

    @XmlElement(name = "FindContactRequestDetail", required = true)
    protected FindContactRequestDetail findContactRequestDetail;

    /**
     * Gets the value of the findContactRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindContactRequestDetail }
     *     
     */
    public FindContactRequestDetail getFindContactRequestDetail() {
        return findContactRequestDetail;
    }

    /**
     * Sets the value of the findContactRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindContactRequestDetail }
     *     
     */
    public void setFindContactRequestDetail(FindContactRequestDetail value) {
        this.findContactRequestDetail = value;
    }

}

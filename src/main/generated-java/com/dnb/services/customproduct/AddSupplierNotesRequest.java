
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data required for notes posted by the users to other users.
 *          
 * 
 * <p>Java class for AddSupplierNotesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddSupplierNotesRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="AddSupplierNotesRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AddSupplierNotesRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSupplierNotesRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "addSupplierNotesRequestDetail"
})
public class AddSupplierNotesRequest
    extends Request
{

    @XmlElement(name = "AddSupplierNotesRequestDetail", required = true)
    protected AddSupplierNotesRequestDetail addSupplierNotesRequestDetail;

    /**
     * Gets the value of the addSupplierNotesRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddSupplierNotesRequestDetail }
     *     
     */
    public AddSupplierNotesRequestDetail getAddSupplierNotesRequestDetail() {
        return addSupplierNotesRequestDetail;
    }

    /**
     * Sets the value of the addSupplierNotesRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddSupplierNotesRequestDetail }
     *     
     */
    public void setAddSupplierNotesRequestDetail(AddSupplierNotesRequestDetail value) {
        this.addSupplierNotesRequestDetail = value;
    }

}

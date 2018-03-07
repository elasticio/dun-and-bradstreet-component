
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data relating to requests for supplier registration. This may include such details as the type of product required, the subject about which the product should be produced, the content of the product.
 *          
 * 
 * <p>Java class for RegisterSupplierRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSupplierRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="RegisterSupplierRequestDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegisterSupplierRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterSupplierRequest", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "registerSupplierRequestDetail"
})
public class RegisterSupplierRequest
    extends Request
{

    @XmlElement(name = "RegisterSupplierRequestDetail", required = true)
    protected RegisterSupplierRequestDetail registerSupplierRequestDetail;

    /**
     * Gets the value of the registerSupplierRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterSupplierRequestDetail }
     *     
     */
    public RegisterSupplierRequestDetail getRegisterSupplierRequestDetail() {
        return registerSupplierRequestDetail;
    }

    /**
     * Sets the value of the registerSupplierRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterSupplierRequestDetail }
     *     
     */
    public void setRegisterSupplierRequestDetail(RegisterSupplierRequestDetail value) {
        this.registerSupplierRequestDetail = value;
    }

}

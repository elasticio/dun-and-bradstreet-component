
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentFinancialStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParentFinancialStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}FinancialStatement">
 *       &lt;sequence>
 *         &lt;element name="RolePlayerDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}RolePlayerDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentFinancialStatement", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "rolePlayerDetails"
})
public class ParentFinancialStatement
    extends FinancialStatement
{

    @XmlElement(name = "RolePlayerDetails")
    protected List<RolePlayerDetailsType> rolePlayerDetails;

    /**
     * Gets the value of the rolePlayerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayerDetailsType }
     * 
     * 
     */
    public List<RolePlayerDetailsType> getRolePlayerDetails() {
        if (rolePlayerDetails == null) {
            rolePlayerDetails = new ArrayList<RolePlayerDetailsType>();
        }
        return this.rolePlayerDetails;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of  information about the characterization of the organization as minority owned. A minority owned organization is a business that is greater than 50% owned by, and whose management and daily business operations are controlled by, one or more minority group members.
 * Note: The percentage of ownership requirement may differ by country. For example, in the US, for a business to be considered minority owned, the percentage of ownership must be at least 51%.
 *          
 * 
 * <p>Java class for MinorityOwnedDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MinorityOwnedDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}SocioEconomicReferenceDetailType">
 *       &lt;sequence>
 *         &lt;element name="OwnershipEthnicity" type="{http://services.dnb.com/CustomProductServiceV2.0}OwnershipEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinorityOwnedDetails", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "ownershipEthnicity"
})
public class MinorityOwnedDetails
    extends SocioEconomicReferenceDetailType
{

    @XmlElement(name = "OwnershipEthnicity")
    protected List<OwnershipEthnicityType> ownershipEthnicity;

    /**
     * Gets the value of the ownershipEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnershipEthnicityType }
     * 
     * 
     */
    public List<OwnershipEthnicityType> getOwnershipEthnicity() {
        if (ownershipEthnicity == null) {
            ownershipEthnicity = new ArrayList<OwnershipEthnicityType>();
        }
        return this.ownershipEthnicity;
    }

}

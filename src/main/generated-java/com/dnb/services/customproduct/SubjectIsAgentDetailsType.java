
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectIsAgentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectIsAgentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SoleAgentIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AgencyDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AgencyDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectIsAgentDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "agentIndicator",
    "soleAgentIndicator",
    "agencyDetail"
})
public class SubjectIsAgentDetailsType {

    @XmlElement(name = "AgentIndicator")
    protected Boolean agentIndicator;
    @XmlElement(name = "SoleAgentIndicator")
    protected Boolean soleAgentIndicator;
    @XmlElement(name = "AgencyDetail")
    protected List<AgencyDetailType> agencyDetail;

    /**
     * Gets the value of the agentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgentIndicator() {
        return agentIndicator;
    }

    /**
     * Sets the value of the agentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgentIndicator(Boolean value) {
        this.agentIndicator = value;
    }

    /**
     * Gets the value of the soleAgentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoleAgentIndicator() {
        return soleAgentIndicator;
    }

    /**
     * Sets the value of the soleAgentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoleAgentIndicator(Boolean value) {
        this.soleAgentIndicator = value;
    }

    /**
     * Gets the value of the agencyDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agencyDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgencyDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgencyDetailType }
     * 
     * 
     */
    public List<AgencyDetailType> getAgencyDetail() {
        if (agencyDetail == null) {
            agencyDetail = new ArrayList<AgencyDetailType>();
        }
        return this.agencyDetail;
    }

}

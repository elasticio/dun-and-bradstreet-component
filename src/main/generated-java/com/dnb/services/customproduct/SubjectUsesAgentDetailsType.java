
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubjectUsesAgentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectUsesAgentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgentUsedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectUsesAgentDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "agentUsedIndicator"
})
public class SubjectUsesAgentDetailsType {

    @XmlElement(name = "AgentUsedIndicator")
    protected Boolean agentUsedIndicator;

    /**
     * Gets the value of the agentUsedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAgentUsedIndicator() {
        return agentUsedIndicator;
    }

    /**
     * Sets the value of the agentUsedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAgentUsedIndicator(Boolean value) {
        this.agentUsedIndicator = value;
    }

}

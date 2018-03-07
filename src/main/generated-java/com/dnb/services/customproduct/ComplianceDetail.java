
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SanctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SanctionDetail" minOccurs="0"/>
 *         &lt;element name="RegulationDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}RegulationDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "sanctionDetail",
    "regulationDetail"
})
public class ComplianceDetail {

    @XmlElement(name = "SanctionDetail")
    protected SanctionDetail sanctionDetail;
    @XmlElement(name = "RegulationDetail")
    protected List<RegulationDetail> regulationDetail;

    /**
     * Gets the value of the sanctionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SanctionDetail }
     *     
     */
    public SanctionDetail getSanctionDetail() {
        return sanctionDetail;
    }

    /**
     * Sets the value of the sanctionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanctionDetail }
     *     
     */
    public void setSanctionDetail(SanctionDetail value) {
        this.sanctionDetail = value;
    }

    /**
     * Gets the value of the regulationDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulationDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulationDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegulationDetail }
     * 
     * 
     */
    public List<RegulationDetail> getRegulationDetail() {
        if (regulationDetail == null) {
            regulationDetail = new ArrayList<RegulationDetail>();
        }
        return this.regulationDetail;
    }

}

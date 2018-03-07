
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the market analysis information on the industries as recorded by the data provider. The market analysis information may include critical analysis, statistics and forecasts to help your engage key prospects, coach key clients, and deepen customer relationships.
 *          
 * 
 * <p>Java class for IndustryProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryProfileDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryProfileDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryProfile", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryProfileDetail"
})
public class IndustryProfile {

    @XmlElement(name = "IndustryProfileDetail")
    protected List<IndustryProfileDetail> industryProfileDetail;

    /**
     * Gets the value of the industryProfileDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryProfileDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryProfileDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryProfileDetail }
     * 
     * 
     */
    public List<IndustryProfileDetail> getIndustryProfileDetail() {
        if (industryProfileDetail == null) {
            industryProfileDetail = new ArrayList<IndustryProfileDetail>();
        }
        return this.industryProfileDetail;
    }

}


package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop that repeats multiple times to allow the recording of percentile value which represents statistical standards, such as the average or quartile results, of the national percentile, categorized by industrial sector.
 *          
 * 
 * <p>Java class for NationalPercentileIndustryNorm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalPercentileIndustryNorm">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}NormType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCode" type="{http://services.dnb.com/CustomProductServiceV2.0}NormsIndustryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalPercentileIndustryNorm", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "industryCode"
})
public class NationalPercentileIndustryNorm
    extends NormType
{

    @XmlElement(name = "IndustryCode")
    protected List<NormsIndustryCodeType> industryCode;

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NormsIndustryCodeType }
     * 
     * 
     */
    public List<NormsIndustryCodeType> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<NormsIndustryCodeType>();
        }
        return this.industryCode;
    }

}

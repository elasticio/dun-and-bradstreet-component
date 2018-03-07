
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreNorms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreNorms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaydexScoreIndustryNorms" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreIndustryNormsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreNorms", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "paydexScoreIndustryNorms"
})
public class PaydexScoreNorms {

    @XmlElement(name = "PaydexScoreIndustryNorms")
    protected List<PaydexScoreIndustryNormsType> paydexScoreIndustryNorms;

    /**
     * Gets the value of the paydexScoreIndustryNorms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paydexScoreIndustryNorms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaydexScoreIndustryNorms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaydexScoreIndustryNormsType }
     * 
     * 
     */
    public List<PaydexScoreIndustryNormsType> getPaydexScoreIndustryNorms() {
        if (paydexScoreIndustryNorms == null) {
            paydexScoreIndustryNorms = new ArrayList<PaydexScoreIndustryNormsType>();
        }
        return this.paydexScoreIndustryNorms;
    }

}

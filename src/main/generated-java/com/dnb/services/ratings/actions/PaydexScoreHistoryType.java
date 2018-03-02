
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaydexScoreHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaydexScoreHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TwentyFourMonthsPaydex" type="{http://services.dnb.com/AssessmentProductServiceV2.0}PaydexScoreType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaydexScoreHistoryType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "twentyFourMonthsPaydex"
})
public class PaydexScoreHistoryType {

    @XmlElement(name = "TwentyFourMonthsPaydex")
    protected List<PaydexScoreType> twentyFourMonthsPaydex;

    /**
     * Gets the value of the twentyFourMonthsPaydex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twentyFourMonthsPaydex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwentyFourMonthsPaydex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaydexScoreType }
     * 
     * 
     */
    public List<PaydexScoreType> getTwentyFourMonthsPaydex() {
        if (twentyFourMonthsPaydex == null) {
            twentyFourMonthsPaydex = new ArrayList<PaydexScoreType>();
        }
        return this.twentyFourMonthsPaydex;
    }

}

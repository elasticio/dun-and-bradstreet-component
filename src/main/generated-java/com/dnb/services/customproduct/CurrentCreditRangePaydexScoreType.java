
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrentCreditRangePaydexScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentCreditRangePaydexScoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThreeMonthsPaydex" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TwelveMonthsPaydex" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="TwentyFourMonthsPaydex" type="{http://services.dnb.com/CustomProductServiceV2.0}PaydexScoreType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentCreditRangePaydexScoreType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "threeMonthsPaydex",
    "twelveMonthsPaydex",
    "twentyFourMonthsPaydex"
})
public class CurrentCreditRangePaydexScoreType {

    @XmlElement(name = "ThreeMonthsPaydex")
    protected List<PaydexScoreType> threeMonthsPaydex;
    @XmlElement(name = "TwelveMonthsPaydex")
    protected List<PaydexScoreType> twelveMonthsPaydex;
    @XmlElement(name = "TwentyFourMonthsPaydex")
    protected List<PaydexScoreType> twentyFourMonthsPaydex;

    /**
     * Gets the value of the threeMonthsPaydex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threeMonthsPaydex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreeMonthsPaydex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaydexScoreType }
     * 
     * 
     */
    public List<PaydexScoreType> getThreeMonthsPaydex() {
        if (threeMonthsPaydex == null) {
            threeMonthsPaydex = new ArrayList<PaydexScoreType>();
        }
        return this.threeMonthsPaydex;
    }

    /**
     * Gets the value of the twelveMonthsPaydex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the twelveMonthsPaydex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTwelveMonthsPaydex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaydexScoreType }
     * 
     * 
     */
    public List<PaydexScoreType> getTwelveMonthsPaydex() {
        if (twelveMonthsPaydex == null) {
            twelveMonthsPaydex = new ArrayList<PaydexScoreType>();
        }
        return this.twelveMonthsPaydex;
    }

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

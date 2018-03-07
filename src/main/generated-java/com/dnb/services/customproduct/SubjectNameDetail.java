
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the names used to identify this supplier.
 *          
 * 
 * <p>Java class for SubjectNameDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectNameDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrimaryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="KnownByName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerPrimaryName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TradeStyleName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectNameDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "primaryName",
    "knownByName",
    "formerPrimaryName",
    "tradeStyleName"
})
public class SubjectNameDetail {

    @XmlElement(name = "PrimaryName", required = true)
    protected String primaryName;
    @XmlElement(name = "KnownByName")
    protected List<String> knownByName;
    @XmlElement(name = "FormerPrimaryName")
    protected List<String> formerPrimaryName;
    @XmlElement(name = "TradeStyleName")
    protected List<String> tradeStyleName;

    /**
     * Gets the value of the primaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryName() {
        return primaryName;
    }

    /**
     * Sets the value of the primaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryName(String value) {
        this.primaryName = value;
    }

    /**
     * Gets the value of the knownByName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownByName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownByName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKnownByName() {
        if (knownByName == null) {
            knownByName = new ArrayList<String>();
        }
        return this.knownByName;
    }

    /**
     * Gets the value of the formerPrimaryName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerPrimaryName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerPrimaryName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFormerPrimaryName() {
        if (formerPrimaryName == null) {
            formerPrimaryName = new ArrayList<String>();
        }
        return this.formerPrimaryName;
    }

    /**
     * Gets the value of the tradeStyleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeStyleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeStyleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradeStyleName() {
        if (tradeStyleName == null) {
            tradeStyleName = new ArrayList<String>();
        }
        return this.tradeStyleName;
    }

}

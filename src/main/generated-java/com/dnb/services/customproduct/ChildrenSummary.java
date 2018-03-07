
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChildrenSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildrenSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChildrenTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="ChildrenQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TerritorialSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}TerritorialSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DirectChildrenIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildrenSummary", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "childrenTypeText",
    "childrenQuantity",
    "territorialSummary",
    "directChildrenIndicator"
})
public class ChildrenSummary {

    @XmlElement(name = "ChildrenTypeText")
    protected DNBDecodedStringType childrenTypeText;
    @XmlElement(name = "ChildrenQuantity")
    protected Integer childrenQuantity;
    @XmlElement(name = "TerritorialSummary")
    protected List<TerritorialSummary> territorialSummary;
    @XmlElement(name = "DirectChildrenIndicator")
    protected Boolean directChildrenIndicator;

    /**
     * Gets the value of the childrenTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getChildrenTypeText() {
        return childrenTypeText;
    }

    /**
     * Sets the value of the childrenTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setChildrenTypeText(DNBDecodedStringType value) {
        this.childrenTypeText = value;
    }

    /**
     * Gets the value of the childrenQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenQuantity() {
        return childrenQuantity;
    }

    /**
     * Sets the value of the childrenQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenQuantity(Integer value) {
        this.childrenQuantity = value;
    }

    /**
     * Gets the value of the territorialSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territorialSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritorialSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerritorialSummary }
     * 
     * 
     */
    public List<TerritorialSummary> getTerritorialSummary() {
        if (territorialSummary == null) {
            territorialSummary = new ArrayList<TerritorialSummary>();
        }
        return this.territorialSummary;
    }

    /**
     * Gets the value of the directChildrenIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectChildrenIndicator() {
        return directChildrenIndicator;
    }

    /**
     * Sets the value of the directChildrenIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectChildrenIndicator(Boolean value) {
        this.directChildrenIndicator = value;
    }

}

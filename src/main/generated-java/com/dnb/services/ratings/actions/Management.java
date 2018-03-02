
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Management complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Management">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/AssessmentProductServiceV2.0}Association">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/AssessmentProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/AssessmentProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "principalName",
    "position"
})
public class Management
    extends Association
{

    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "Position")
    protected List<Position> position;

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectName }
     *     
     */
    public SubjectName getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectName }
     *     
     */
    public void setPrincipalName(SubjectName value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

}


package com.dnb.services.report;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectAttachmentForCompanyReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectAttachmentForCompanyReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/ReportProductServiceV2.0}ObjectAttachmentForResponse">
 *       &lt;sequence>
 *         &lt;element name="DNBProductModuleID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectAttachmentForCompanyReport", namespace = "http://services.dnb.com/ReportProductServiceV2.0", propOrder = {
    "dnbProductModuleID"
})
public class ObjectAttachmentForCompanyReport
    extends ObjectAttachmentForResponse
{

    @XmlElement(name = "DNBProductModuleID")
    protected List<String> dnbProductModuleID;

    /**
     * Gets the value of the dnbProductModuleID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dnbProductModuleID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDNBProductModuleID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDNBProductModuleID() {
        if (dnbProductModuleID == null) {
            dnbProductModuleID = new ArrayList<String>();
        }
        return this.dnbProductModuleID;
    }

}


package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records data on organizations identified by D&B as business competitors for the subject organization. This may include such details as the number of competitors identified by D&B,basic competitor information etc.
 *          
 * 
 * <p>Java class for FindCompetitorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompetitorResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Response">
 *       &lt;sequence>
 *         &lt;element name="FindCompetitorResponseDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompetitorResponseDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompetitorResponse", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findCompetitorResponseDetail"
})
public class FindCompetitorResponse
    extends Response
{

    @XmlElement(name = "FindCompetitorResponseDetail")
    protected FindCompetitorResponseDetail findCompetitorResponseDetail;

    /**
     * Gets the value of the findCompetitorResponseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompetitorResponseDetail }
     *     
     */
    public FindCompetitorResponseDetail getFindCompetitorResponseDetail() {
        return findCompetitorResponseDetail;
    }

    /**
     * Sets the value of the findCompetitorResponseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompetitorResponseDetail }
     *     
     */
    public void setFindCompetitorResponseDetail(FindCompetitorResponseDetail value) {
        this.findCompetitorResponseDetail = value;
    }

}


package com.dnb.services.entitylist;

import javax.xml.bind.annotation.*;


/**
 * 
 * This operation allows the Customer/User to find a potential list of business competitors for the subject organization from the D&B database.
 *          
 * 
 * <p>Java class for FindCompetitorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindCompetitorRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}Request">
 *       &lt;sequence>
 *         &lt;element name="FindCompetitorRequestDetail" type="{http://services.dnb.com/EntityListServiceV2.0}FindCompetitorRequestDetail"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindCompetitorRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "findCompetitorRequestDetail"
})
@XmlRootElement(name = "FindCompetitorRequest", namespace = "http://services.dnb.com/EntityListServiceV2.0")
public class FindCompetitorRequest
    extends Request
{

    @XmlElement(name = "FindCompetitorRequestDetail", required = true)
    protected FindCompetitorRequestDetail findCompetitorRequestDetail;

    /**
     * Gets the value of the findCompetitorRequestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FindCompetitorRequestDetail }
     *     
     */
    public FindCompetitorRequestDetail getFindCompetitorRequestDetail() {
        return findCompetitorRequestDetail;
    }

    /**
     * Sets the value of the findCompetitorRequestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindCompetitorRequestDetail }
     *     
     */
    public void setFindCompetitorRequestDetail(FindCompetitorRequestDetail value) {
        this.findCompetitorRequestDetail = value;
    }

}

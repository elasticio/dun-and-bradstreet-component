
package com.dnb.services.ratings.actions;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records D&amp;B's proprietary analytics information probability that an organization will go out of business in the next 12 months in comparison to all organizations within the same model segment. The score ranges from 1 to 9 where 9 reflects the highest probability and 1 reflects the lowest probability that the organization will go out of business.
 *          
 * 
 * <p>Java class for PortfolioComparisonScoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioComparisonScoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/AssessmentProductServiceV2.0}ViabilityScoreType">
 *       &lt;sequence>
 *         &lt;element name="ModelSegmentDescription" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="SegmentBadRate" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "PortfolioComparisonScoreType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "modelSegmentDescription",
    "segmentBadRate"
})
public class PortfolioComparisonScoreType
    extends ViabilityScoreType
{

    @XmlElement(name = "ModelSegmentDescription")
    protected DNBDecodedStringType modelSegmentDescription;
    @XmlElement(name = "SegmentBadRate")
    protected BigDecimal segmentBadRate;

    /**
     * Gets the value of the modelSegmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getModelSegmentDescription() {
        return modelSegmentDescription;
    }

    /**
     * Sets the value of the modelSegmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setModelSegmentDescription(DNBDecodedStringType value) {
        this.modelSegmentDescription = value;
    }

    /**
     * Gets the value of the segmentBadRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegmentBadRate() {
        return segmentBadRate;
    }

    /**
     * Sets the value of the segmentBadRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegmentBadRate(BigDecimal value) {
        this.segmentBadRate = value;
    }

}


package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * An entry loop which can repeat multiple times to allow the recording of the details of events which have occurred which directly affect the subject&apos;s finances. For example the means by which moneys are obtained by the subject or financial securities which have been filed which affect the subject.
 *          
 * 
 * <p>Java class for OtherFinancingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherFinancingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}FinancialEventBaseType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherFinancingEvent", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
public class OtherFinancingEvent
    extends FinancialEventBaseType
{


}

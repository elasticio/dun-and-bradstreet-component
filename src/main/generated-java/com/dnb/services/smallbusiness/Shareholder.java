
package com.dnb.services.smallbusiness;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Shareholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Shareholder">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/SBRIProductServiceV2.0}Ownership">
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
@XmlType(name = "Shareholder", namespace = "http://services.dnb.com/SBRIProductServiceV2.0")
public class Shareholder
    extends Ownership
{


}

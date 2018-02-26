
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagementResponsibilityCodeTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagementResponsibilityCodeTextType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://services.dnb.com/EntityListServiceV2.0>DNBStringType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementResponsibilityCodeTextType", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlSeeAlso({
    com.dnb.services.entitylist.FindContactResponseDetail.NavigatorDetail.ManagementResponsibilityCodeNavigatorDetail.ManagementResponsibilityCode.ManagementResponsibilityCodeText.class
})
public class ManagementResponsibilityCodeTextType
    extends DNBStringType
{


}

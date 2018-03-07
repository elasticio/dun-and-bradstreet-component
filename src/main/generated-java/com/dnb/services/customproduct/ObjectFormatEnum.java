
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectFormatEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectFormatEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="16"/>
 *     &lt;enumeration value="HTML"/>
 *     &lt;enumeration value="PDF"/>
 *     &lt;enumeration value="XML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ObjectFormatEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum ObjectFormatEnum {

    HTML,
    PDF,
    XML;

    public String value() {
        return name();
    }

    public static ObjectFormatEnum fromValue(String v) {
        return valueOf(v);
    }

}

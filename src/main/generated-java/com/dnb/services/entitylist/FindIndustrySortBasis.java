
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindIndustrySortBasis.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FindIndustrySortBasis">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IndustryCode"/>
 *     &lt;enumeration value="IndustryDescription"/>
 *     &lt;enumeration value="IndustryDescription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FindIndustrySortBasis", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum FindIndustrySortBasis {

    @XmlEnumValue("IndustryCode")
    INDUSTRY_CODE("IndustryCode"),
    @XmlEnumValue("IndustryDescription")
    INDUSTRY_DESCRIPTION("IndustryDescription");
    private final String value;

    FindIndustrySortBasis(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FindIndustrySortBasis fromValue(String v) {
        for (FindIndustrySortBasis c: FindIndustrySortBasis.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

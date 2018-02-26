
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationNavigatorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationNavigatorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="Territory"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationNavigatorTypeEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum LocationNavigatorTypeEnum {

    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("Territory")
    TERRITORY("Territory");
    private final String value;

    LocationNavigatorTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationNavigatorTypeEnum fromValue(String v) {
        for (LocationNavigatorTypeEnum c: LocationNavigatorTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}


package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="Advanced"/>
 *     &lt;enumeration value="EmailLookup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchModeEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum SearchModeEnum {

    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Advanced")
    ADVANCED("Advanced"),
    @XmlEnumValue("EmailLookup")
    EMAIL_LOOKUP("EmailLookup");
    private final String value;

    SearchModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchModeEnum fromValue(String v) {
        for (SearchModeEnum c: SearchModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

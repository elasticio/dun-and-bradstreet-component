
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchModeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Advanced"/>
 *     &lt;enumeration value="Basic"/>
 *     &lt;enumeration value="SBRI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchModeEnum", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum MatchModeEnum {

    @XmlEnumValue("Advanced")
    ADVANCED("Advanced"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    SBRI("SBRI");
    private final String value;

    MatchModeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchModeEnum fromValue(String v) {
        for (MatchModeEnum c: MatchModeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

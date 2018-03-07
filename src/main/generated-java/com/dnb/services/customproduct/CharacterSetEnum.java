
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterSetEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CharacterSetEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="16"/>
 *     &lt;enumeration value="ASCII"/>
 *     &lt;enumeration value="ISO 8859-1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CharacterSetEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum CharacterSetEnum {

    ASCII("ASCII"),
    @XmlEnumValue("ISO 8859-1")
    ISO_8859_1("ISO 8859-1");
    private final String value;

    CharacterSetEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharacterSetEnum fromValue(String v) {
        for (CharacterSetEnum c: CharacterSetEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

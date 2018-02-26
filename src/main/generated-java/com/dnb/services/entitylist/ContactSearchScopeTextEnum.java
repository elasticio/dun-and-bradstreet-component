
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactSearchScopeTextEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactSearchScopeTextEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Bio"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="Both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactSearchScopeTextEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum ContactSearchScopeTextEnum {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Bio")
    BIO("Bio"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    ContactSearchScopeTextEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactSearchScopeTextEnum fromValue(String v) {
        for (ContactSearchScopeTextEnum c: ContactSearchScopeTextEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

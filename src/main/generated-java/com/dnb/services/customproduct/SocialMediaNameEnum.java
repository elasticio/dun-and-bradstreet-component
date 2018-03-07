
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocialMediaNameEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SocialMediaNameEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="Twitter"/>
 *     &lt;enumeration value="Wikipedia"/>
 *     &lt;enumeration value="Youtube"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SocialMediaNameEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum SocialMediaNameEnum {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),
    @XmlEnumValue("Wikipedia")
    WIKIPEDIA("Wikipedia"),
    @XmlEnumValue("Youtube")
    YOUTUBE("Youtube");
    private final String value;

    SocialMediaNameEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SocialMediaNameEnum fromValue(String v) {
        for (SocialMediaNameEnum c: SocialMediaNameEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

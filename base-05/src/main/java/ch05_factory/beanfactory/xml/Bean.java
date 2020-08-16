package ch05_factory.beanfactory.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

/**
 * @author guodd
 * @version 1.0
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bean {
    /**
     * 属性描述：id
     */
    @JacksonXmlProperty(isAttribute = true)
    private String id;
    /**
     * 属性描述：class
     */
    @JacksonXmlProperty(localName = "class",isAttribute = true)
    private String classPath;
}

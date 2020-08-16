package ch05_factory.beanfactory.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

//import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guodd
 * @version 1.0
 */
//@XmlRootElement
@JacksonXmlRootElement(localName = "beans")
@Data
public class Beans {
    /**
     * 功能描述：size
     */
    @JacksonXmlProperty(isAttribute = true)
    private Integer size;
    @JacksonXmlProperty(localName = "bean")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Bean> beans = new ArrayList<>();
}

package ch05_util.apache;

import cn.hutool.core.util.IdUtil;
import jodd.util.RandomStringUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author guodd
 * @version 1.0
 */
public class RandomMain {
    public static void main(String[] args) {
        System.out.println(RandomStringUtils.randomNumeric(24));
        System.out.println(RandomStringUtil.randomNumeric(1));
        System.out.println(IdUtil.fastSimpleUUID());
    }
}

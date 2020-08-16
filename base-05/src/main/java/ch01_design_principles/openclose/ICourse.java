package ch01_design_principles.openclose;

/**
 * 开闭原则，核心是抽象，抽象构建框架，实现扩展细节
 * 接口不应该是经常变化的，应该是稳定、可靠的，是一种契约规范
 *
 * @author guodd
 * @version 1.0
 */
public interface ICourse {
    Integer getId();

    String getName();

    Double getPrice();
}

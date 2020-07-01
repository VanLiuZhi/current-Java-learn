package old.cast;

public interface ConfigurableApplicationContext {
    void refresh();
    Object getBeanFactory() throws IllegalStateException;
}

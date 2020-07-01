package old.cast;

public abstract class AbstractApplicationContext implements ConfigurableApplicationContext {
    @Override
    public abstract Object getBeanFactory() throws IllegalStateException;


    @Override
    public void refresh() {
        Object beanFactory = getBeanFactory();
    }
}

package old.polymoph;

public class Children2 implements Parents {
    @Override
    public void func1() {
        System.out.println("children2 func1");
    }

    @Override
    public void parentsFunc1() {
        System.out.println("children2 parentsFUnc1");
    }

    public void children2Func() {
        System.out.println("children2 my func");
    }
}

package old.learn;

public class ExecutionFlow {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println("My name is " + this.name);
        System.out.println("My age is " + this.age);
    }

    public static void main(String[] args) {
        ExecutionFlow executionFlow = new ExecutionFlow();
        executionFlow.setName("liu zhi");
        executionFlow.setAge(18);
        executionFlow.showInfo();
    }
}



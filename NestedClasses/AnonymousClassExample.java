package NestedClasses;

public class AnonymousClassExample {
    public static void main(String[] args) {
        
        Task task = new Task() {
            @Override
            public void doTask() {
                System.out.println("Task is being executed.");
            }
        };

        task.doTask();
    }
}

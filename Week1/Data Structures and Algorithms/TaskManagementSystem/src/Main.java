public class Main {
    public static void main(String[] args) {
        TaskLinkedList list = new TaskLinkedList();

        //Add tasks
        list.addTask(new Task(1,"Plan","completed"));
        list.addTask(new Task(2,"Design","completed"));
        list.addTask(new Task(3,"Code","Ongoing"));
        list.addTask(new Task(4,"Deploy","Incomplete"));

        //Traverse task lists
        list.traverseTasks();
        System.out.println();

        //Search task
        Task t = list.searchByTaskID(3);
        if(t == null){
            System.out.println("No task found with suitable taskId");
        }
        else{
            System.out.println(t);
        }
        System.out.println();


        //Delete task
        list.deleteTask(2);

        list.traverseTasks();
    }
}
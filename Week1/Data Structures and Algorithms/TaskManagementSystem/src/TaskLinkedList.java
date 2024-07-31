public class TaskLinkedList {
    Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Task searchByTaskID(int taskId)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.task.getTaskId() == taskId)
            {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId)
    {
        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            if(temp.task.getTaskId() == taskId)
            {
                System.out.println("Task deleted successfully");
                if(prev == null)
                {
                    head = temp.next;
                }
                else{
                    prev.next = temp.next;
                }
            }
            prev = temp;
            temp = temp.next;
        }
    }
}

class Node{
    Task task;
    Node next;

    public Node(Task task)
    {
        this.task = task;
        this.next = null;
    }
}

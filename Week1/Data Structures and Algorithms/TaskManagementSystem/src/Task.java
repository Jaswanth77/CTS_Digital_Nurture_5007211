public class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId,String taskName,String status)
    {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    public int getTaskId()
    {
        return this.taskId;
    }

    public String getTaskName()
    {
        return this.taskName;
    }

    public String getStatus()
    {
        return this.status;
    }

    public String toString()
    {
        return "Task (taskId=" + taskId + ", taskName=" + taskName + ", status=" + status + ")";
    }
}

package TaskManagementSystem.frame;

public class TaskModel {
    private String taskName;
    private boolean checked;

    public TaskModel(String taskName) {
        this.taskName = taskName;
        this.checked = false;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}

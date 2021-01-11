package dto;

import util.Priority;
import util.Status;

import java.io.Serializable;

public class TodoItemDTO implements Serializable {
    private int id;
    private String text;
    private Priority priority;
    private Status status;
    private String username;

    public TodoItemDTO() {
    }

    public TodoItemDTO(int id, String text, Priority priority, Status status, String username) {
        this.id = id;
        this.text = text;
        this.priority = priority;
        this.status = status;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "TodoItemDTO{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                ", username='" + username + '\'' +
                '}';
    }
}

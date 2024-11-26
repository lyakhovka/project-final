package com.javarush.jira.bugtracking.task.tag;

import com.javarush.jira.bugtracking.task.Task;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "task_tag")
@Getter
@Setter
@NoArgsConstructor
public class TaskTag {
    @Getter
    @Setter
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;

    @Getter
    @Setter
    private String tag;

}

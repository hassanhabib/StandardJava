package brokers.storages;

import models.students.Student;

public interface IStorageBroker {
    Student insertStudent(Student student);
}

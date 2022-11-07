package brokers.storages;

import models.students.Student;

public class StorageBroker implements IStorageBroker{
    @Override
    public Student insertStudent(Student student) {
        return student;
    }
}

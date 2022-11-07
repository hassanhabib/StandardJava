package services.students;

import brokers.storages.IStorageBroker;
import models.students.Student;
import javax.naming.OperationNotSupportedException;

public class StudentService implements IStudentService{
    private IStorageBroker storageBroker;

    public StudentService(IStorageBroker storageBroker)
    {
        this.storageBroker = storageBroker;
    }

    @Override
    public Student addStudent(Student student) {
        return this.storageBroker.insertStudent(student);
    }
}

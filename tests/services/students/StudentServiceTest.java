package services.students;

import brokers.storages.IStorageBroker;
import models.students.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @Test
    void shouldAddStudent() {
        // given
        Student studentMock = mock(Student.class);
        Student inputStudent = studentMock;
        Student insertedStudent = inputStudent;
        Student expectedStudent = insertedStudent;

        IStorageBroker storageBrokerMock =
                mock(IStorageBroker.class);

        IStudentService studentService =
                new StudentService(storageBrokerMock);

        when(storageBrokerMock.insertStudent(inputStudent))
                .thenReturn(insertedStudent);

        // when
        Student actualStudent =
                studentService.addStudent(inputStudent);

        // then
        assertEquals(expectedStudent, actualStudent);

        verify(storageBrokerMock, times(1))
                .insertStudent(inputStudent);

        verifyNoMoreInteractions(storageBrokerMock);
    }
}
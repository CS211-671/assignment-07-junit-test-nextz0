package ku.cs.models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentListTest {
    @Test
    @DisplayName("testหาไอดี")
    public void TestFindStudentById(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("62xxxxxxx","next1");
        Student student = studentList.findStudentById("62xxxxxxx");
       assertEquals("62xxxxxxx",student.getId());
    }

    @Test
    @DisplayName("testคะแนน")
    public void TestGiveScoreToId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("62xxxxxxx","next1",50);
        studentList.giveScoreToId("62xxxxxxx",50);
        assertEquals(100, studentList.findStudentById("62xxxxxxx").getScore());
    }

    @Test
    @DisplayName("testเกรด")
    public void TestViewGradeOfId(){
        StudentList studentList = new StudentList();
        studentList.addNewStudent("62xxxxxxx","next1",80);
        studentList.giveScoreToId("62xxxxxxx",80);
        assertEquals("A",studentList.viewGradeOfId("62xxxxxxx"));

    }






}
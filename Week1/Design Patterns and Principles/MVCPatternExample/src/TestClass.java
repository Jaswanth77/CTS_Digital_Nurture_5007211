public class TestClass {
    public static void main(String[] args) {

        Student student = new Student("John Abraham", 1, "Z");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Jane Doe");
        controller.setStudentId(2);
        controller.setStudentGrade("B");

        controller.updateView();
    }
}

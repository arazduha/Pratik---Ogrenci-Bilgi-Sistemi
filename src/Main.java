public class Main  {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course mats = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course fiziks = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course kimyas = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("A Hoca", "9000000000", "MAT");
        Teacher t2 = new Teacher("B Hoca", "9000000000", "FZK");
        Teacher t3 = new Teacher("C Hoca", "9000000000", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", mat, fizik, kimya, mats, fiziks, kimyas);
        s1.addBulkExamNote(20,40,50,70,60,30);
        s1.isPass();


        Student s2 = new Student("Guduk Necmi", 4, "2211133", mat, fizik, kimya, mats, fiziks, kimyas);
        s2.addBulkExamNote(100,50,40, 36, 69, 84);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", mat, fizik, kimya, mats, fiziks, kimyas);
        s3.addBulkExamNote(50,20,40, 96, 85 ,25);
        s3.isPass();


    }
}

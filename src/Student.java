public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course mats;
    Course fizik;
    Course fiziks;
    Course kimya;
    Course kimyas;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course mats, Course fiziks, Course kimyas) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.mats = mats;
        this.fizik = fizik;
        this.fiziks = fiziks;
        this.kimya = kimya;
        this.kimyas = kimyas;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int mats, int fiziks, int kimyas) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (mats >= 0 && mats <= 100) {
            this.mats.note = mats;
        }

        if (fiziks >= 0 && fiziks <= 100) {
            this.fiziks.note = fiziks;
        }

        if (kimyas >= 0 && kimyas <= 100) {
            this.kimyas.note = kimyas;
        }

    }


    public void isPass() {
        if ((this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) && (this.mats.note == 0 || this.fiziks.note == 0 || this.kimyas.note == 0)) {
            System.out.println("Notlar tam olarak girilmemis");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sinifi Gecti. ");
            } else {
                System.out.println("Sinifta Kaldi.");
            }
        }
    }

    public void calcAvarage() {

        this.avarage = (((this.fizik.note*0.60)+(this.fiziks.note*0.20)) + ((this.kimya.note*0.60)+(this.kimyas.note*0.20)) + ((this.mat.note*0.60)+(this.mats.note*0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik  Sozlu Notu : " + this.mats.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fiziks.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimyas.note);
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i){
                case 1 -> "mary";
                case 2-> "carol";
                case 3 -> "tim";
                case 4-> "lisa";
                case 5-> "harry";
                        default -> "Anonymous";

                    },
                    "01/08/2002", "java masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S92300", "ANN", "01/08/2002", "JAVA MASTERCLASS");
        LPAStudent recordStudent = new LPAStudent("S923001", "BILL", "05/11/2002", "JAVA MASTERCLASS");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList()+ " , java ocp exam 829");
      //  recordStudent.setClassList(recordStudent.classList() + " ,  java ocp exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking"+ recordStudent.classList());


    }
}

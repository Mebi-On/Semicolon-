class SubjectSummary {
        int[] subjectTotal;
        float[] averageGrade;
        int[] highestGrade;
        int[] highestStudent;
        int[] lowestGrade;
        int[] lowestStudent;
        int[] passes;
        int[] fails;

        public SubjectSummary(int subjects) {
                subjectTotal = new int[subjects];
                averageGrade = new float[subjects];
                highestGrade = new int[subjects];
                highestStudent = new int[subjects];
                lowestGrade = new int[subjects];
                lowestStudent = new int[subjects];
                passes = new int[subjects];
                fails = new int[subjects];
        }

        public static void getStudentSummary(int[][] grades, String[] studentNames) {
                float[] averageScore = new float[grades.length];

                for (int student = 0; student < grades.length; student++) {
                        averageScore[student] = StudentGradeUtils.calculateStudentAverage(grades, student);
                }

                int[] position = StudentFindUtils.findStudentPosition(averageScore);

                for (int rowIndex = 0; rowIndex < grades.length; rowIndex++) {
                        System.out.print(studentNames[rowIndex]);

                        for (int columnIndex = 0; columnIndex < grades[rowIndex].length; columnIndex++) {
                                System.out.print(" \t " + grades[rowIndex][columnIndex]);
                        }

                        System.out.printf(
                                        "\t%d\t%.2f\t%d%n",
                                        StudentGradeUtils.calculateStudentTotal(grades, rowIndex),
                                        StudentGradeUtils.calculateStudentAverage(grades, rowIndex),
                                        position[rowIndex]);
                }
        }

        public static SubjectSummary getSubjectSummary(int[][] grades, String[] subjectNames, String[] studentNames) {
                int subjects = grades[0].length;
                int students = grades.length;
                SubjectSummary summary = new SubjectSummary(subjects);

                for (int subject = 0; subject < subjects; subject++) {
                        int totalGrade = 0;
                        int highestGrade = 0;
                        int highestStudent = 0;
                        int lowestGrade = 100;
                        int lowestStudent = 0;
                        int passes = 0;
                        int fails = 0;

                        System.out.println(subjectNames[subject].toUpperCase());
                        for (int student = 0; student < students; student++) {
                                totalGrade += grades[student][subject];

                                if (grades[student][subject] > highestGrade) {
                                        highestGrade = grades[student][subject];
                                        highestStudent = student;
                                }

                                if (grades[student][subject] < lowestGrade) {
                                        lowestGrade = grades[student][subject];
                                        lowestStudent = student;
                                }

                                if (grades[student][subject] >= 50) {
                                        passes++;
                                } else {
                                        fails++;
                                }

                        }

                        summary.subjectTotal[subject] = totalGrade;
                        summary.averageGrade[subject] = (float) totalGrade / students;
                        summary.highestGrade[subject] = highestGrade;
                        summary.highestStudent[subject] = highestStudent;
                        summary.lowestGrade[subject] = lowestGrade;
                        summary.lowestStudent[subject] = lowestStudent;
                        summary.passes[subject] = passes;
                        summary.fails[subject] = fails;

                        System.out.printf("""
                                        Highest scoring student is: %s scoring %d
                                        Lowest scoring student is: %s scoring %d
                                        Total Score is: %d
                                        Average Grade: %.2f
                                        Number of Passes: %d
                                        Number of Fails: %d

                                        """,
                                        studentNames[highestStudent], highestGrade, studentNames[lowestStudent],
                                        lowestGrade, totalGrade, summary.averageGrade[subject], passes, fails);
                }
                return summary;
        }

        public static void getClassSummary(int[][] grades, SubjectSummary summary, String[] subjectNames,
                        String[] studentNames) {

                int[] hardestAndEasiestSubject = StudentFindUtils.findHardestAndEasiestSubject(summary);
                int[] bestAndWorstStudent = StudentFindUtils.findBestAndWorstStudent(grades);
                int[] overallHighestAndLowest = StudentFindUtils.findOverallHighestAndLowest(grades);
                int classTotal = StudentGradeUtils.calculateClassTotal(grades);

                System.out.println("The hardest subject is " + subjectNames[hardestAndEasiestSubject[0]] + " with "
                                + hardestAndEasiestSubject[2] + " failures");
                System.out.println("The easiest subject is " + subjectNames[hardestAndEasiestSubject[1]] + " with "
                                + hardestAndEasiestSubject[3] + " passes");
                System.out.printf("The overall highest score is scored by %s in %s scoring %d%n",
                                studentNames[overallHighestAndLowest[1]],
                                subjectNames[overallHighestAndLowest[2]],
                                overallHighestAndLowest[0]);
                System.out.printf("The overall lowest score is scored by %s in %s scoring %d%n",
                                studentNames[overallHighestAndLowest[4]],
                                subjectNames[overallHighestAndLowest[5]],
                                overallHighestAndLowest[3]);
                System.out.println("=================================");
                System.out.println("\nCLASS SUMMARY");
                System.out.println("=================================");

                System.out.println("Best Graduating Student is: " + studentNames[bestAndWorstStudent[0]] + " scoring "
                                + bestAndWorstStudent[1]);
                System.out.println("Worst Graduating Student is: " + studentNames[bestAndWorstStudent[2]] + " scoring "
                                + bestAndWorstStudent[3]);

                System.out.println("=================================");
                System.out.println("\nClass total score is: " + classTotal);
                System.out.printf("Class Average score is: %.2f%n", (float) classTotal / grades.length);
        }

}
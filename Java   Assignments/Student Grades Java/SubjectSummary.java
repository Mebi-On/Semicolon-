public class SubjectSummary {
        public int[] subjectTotal;
        public float[] averageGrade;
        public int[] highestGrade;
        public int[] highestStudent;
        public int[] lowestGrade;
        public int[] lowestStudent;
        public int[] passes;
        public int[] fails;


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
}
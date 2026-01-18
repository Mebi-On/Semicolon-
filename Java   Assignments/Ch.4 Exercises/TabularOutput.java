public class TabularOutput{
    public static void main (String[] args){
        System.out.println("N \t N2 \t N3 \t N4 \t");
        for (int index = 1; index <= 5; index ++){
            System.out.println(index + "\t" + (index * index) + "\t" + (index * index * index) + "\t" + (index * index * index * index) + "\t");
        }
    }
}
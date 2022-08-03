import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //Exercise 1
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName+" "+middleName+" "+lastName;
        System.out.println("ФИО сотрудника - "+fullName);

        //Exercise 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullName.toUpperCase());

        //Exercise 3
        System.out.println("Данные ФИО сотрудника для административного отдела - "+fullName.replaceAll(" ", "; "));

        //Exercise 4
        String fullName2 = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника - "+fullName2.replaceAll("ё", "е"));

        //Dop Exercise 5
        String firstName2 = "";
        String middleName2 = "";
        String lastName2 = "";
        String fullName3 = "Ivanov Ivan Ivanovich";
        firstName2 = fullName3.substring(0,fullName3.indexOf(" "));
        middleName2 = fullName3.substring(fullName3.indexOf(" ")+1,fullName3.lastIndexOf(" "));
        lastName2 = fullName3.substring(fullName3.lastIndexOf(" ")+1,fullName3.length());
        System.out.println("Имя сотрудника - "+ middleName2);
        System.out.println("Фамилия сотрудника - "+firstName2);
        System.out.println("Отчество сотрудника - "+lastName2);

        //Dop Exercise 6

        String fullName4 = "ivanov ivan ivanovich";
        char[] chr = fullName4.toCharArray();
        chr[0] = Character.toUpperCase(chr[0]);
        chr[fullName4.indexOf(' ')+1] = Character.toUpperCase(fullName4.charAt(fullName4.indexOf(' ')+1));
        chr[fullName4.lastIndexOf(' ')+1] = Character.toUpperCase(fullName4.charAt(fullName4.lastIndexOf(' ')+1));
        fullName4 = "";
        for (Character ch : chr){
            fullName4 = fullName4 + ch;
        }
        System.out.println("верное написание Ф. И. О. сотрудника с заглавных букв - "+fullName4);

        //Dop Exercise 7
        String st1 = "135";
        String st2 = "246";
        int size = (st1+st2).length();
        int [] arr = new int [size];
        char[] array2 = (st1+st2).toCharArray();
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(String.valueOf(array2[i]));
        }

        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i-1);
                    needIteration = true;
                }
            }
        }
        String st3="";
        for (int ch : arr){
            st3 = st3 + ch;
        }
        System.out.println("данные строки - "+ st3);

        //Dop Exercise 8
        String engSt = "aabccddefgghiijjkk";
        char[] engArr= engSt.toCharArray();
        for(int i =0; i<engArr.length; i++){
            for (int j =i+1; j<engArr.length; j++){
              if(engArr[i] == engArr[j]){
                  System.out.print(engArr[i]);
                  break;
              }
            }
        }
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}

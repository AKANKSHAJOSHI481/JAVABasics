package ArrayList;


import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Java");
        stringArrayList.add("JavaScript");
        stringArrayList.add("Python");
        stringArrayList.add(1, "Swift");
        System.out.println(stringArrayList);

//        access
        String str = stringArrayList.get(1);
        System.out.println(str);

//        change
        stringArrayList.set(1, "c++");
        System.out.println(stringArrayList);

//        remove
        System.out.println(stringArrayList.size());
        stringArrayList.remove(2);
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());

        for(String str1 : stringArrayList){
            System.out.println(str1);
        }
    }
}

package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("Stream API");

        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list2= Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);

        // Find even elements in a list
        List<Integer> evenNum = list1.stream()
                .filter(li-> li%2==0)
                .collect(Collectors.toList());
        System.out.println("Find even elements in a list : "+evenNum);

        // Increment list elements by 10%
        List<Integer> incList = list1.stream()
                .map(li-> li*10)
                .collect(Collectors.toList());
        System.out.println("Increment list elements by 10% : "+incList);

        // Increment list even elements by 100%
        List<Integer> evenListInc = list1.stream()
                .filter(li-> li%2==0)
                .map(evenLi-> evenLi*100)
                .collect(Collectors.toList());
        System.out.println("Increment list even elements by 100% : "+evenListInc);

        // Sort elements of List
        List<Integer> sortList = list2.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sort elements of List : "+sortList);

        // Remove duplicate from List
        List<Integer> removeDuplicate =  list2.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Remove duplicate from List : "+removeDuplicate);

        // Without use of return type Peek operartion

        list1.stream()
                .filter(li-> li%2==0)
                .peek(op-> System.out.println("Without use of return type Peek operartion : "+ op))
                .count();

        // Removing duplicates from list without distinct()

        Set<Integer> distinctLi= list2.stream()
                .collect(Collectors.toSet());
        System.out.println("Removing duplicates from list without distinct() : "+distinctLi);

        // Frequency count of elements in list
        List<Integer> list5= Arrays.asList(1,2,1,3,3,3,9,9,10,12,10);
        Set<Integer> fre = list5.stream().filter(n->Collections.frequency(list5,n)>1).collect(Collectors.toSet());
        System.out.println(fre);













    }
}

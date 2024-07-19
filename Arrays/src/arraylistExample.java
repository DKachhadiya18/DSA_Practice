import java.util.*;
public class arraylistExample
{
    public static void main(String[] args) {
        // 1d ArrayList
// 		ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
// 		list.add(2);
// 		list.add(7);
// 		list.add(11);
// 		list.add(34);
// 		System.out.println(list);
// 		System.out.println(list.contains(4));
// 		System.out.println(list.remove(2));
// 		System.out.println(list.set(0,12));
// 		System.out.println(list);

// 		ArrayList<Integer> list2 = new ArrayList<>();
// 		for(int i = 0; i < 5; i++){
// 		    list2.add(sc.nextInt());
// 		}
// 		System.out.println(list2);
// 		for(int i = 0; i < 5; i++){
// 		    System.out.println(list2.get(i));
// 		}


        // 2d Array List
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
        //need to initalize the list as the list is null initialization put the value 0 in the list
        for(int i = 0; i<3; i++){
            list2d.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                list2d.get(i).add(sc.nextInt()); // get the index and put the value in it
            }
        }
        System.out.println(list2d);
    }
}

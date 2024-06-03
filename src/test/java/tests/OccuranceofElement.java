package tests;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofElement {

    public static void main(String[] args) {

         int[] a= {1,2,2,2,3,3,3,4,4,5,5};

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< args.length;i++){

            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            }
            else {
                hm.put(a[i],1);
            }
            for(Map.Entry<Integer,Integer> entryValue:hm.entrySet()){
                System.out.println(entryValue.getKey()+ ".."+ entryValue.getValue());
            }
        }

    }
}



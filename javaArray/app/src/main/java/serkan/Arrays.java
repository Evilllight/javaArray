package serkan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        //Arrays

        String[] myarray=new String[3];

        myarray[0]="Mahzar";
        myarray[1]="Fuat";
        myarray[2]="Özkan";

        System.out.println(myarray[2]);

        int[] number={10,20,30,40,50};

        System.out.println(number[1]);


        //ArrayList
        ArrayList<String> musizyenler=new ArrayList<String>();

        musizyenler.add("mahzar");
        musizyenler.add("fuat");
        musizyenler.add(1,"özkan");

        System.out.println(musizyenler.get(1));

        //HashSet
        HashSet<String> myset=new HashSet<String>();

        myset.add("mahzar");
        myset.add("mahzar");

        System.out.println(myset.size());


        //HashMap
        HashMap<String,String> myHash=new HashMap<String, String>();

        myHash.put("isim","mahzar");
        myHash.put("enstruman","gitar");

        System.out.println(myHash.get("isim"));

    }
}

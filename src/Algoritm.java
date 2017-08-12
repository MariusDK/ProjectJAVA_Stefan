import java.io.*;
import java.util.ArrayList;

/**
 * Created by MariusDK on 12.08.2017.
 */
public class Algoritm {
    public ArrayList<Integer> list;
    public int size;
    public Algoritm()
    {
        this.size=8;
        list=new ArrayList<>();
        int i=0;
        while (i<size)
        {
            list.add(1);
            i++;
        }
    }
    public void AlgoritmGenerare()
    {
        int numar=0;
        writeFile(list);
        while (!verificare())
        {
         int poz=0;
         while ((list.get(poz)!=1)&&(poz<8))
         {
             list.set(poz,1);
             poz++;
         }
         if (poz<8) {
             list.set(poz, 2);
         }


                writeFile(list);
            System.out.println(list);
         numar++;
        }
        System.out.println(numar);
    }
    public static void writeFile(ArrayList list1)
    {

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("Generat.txt",true));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//        //    bw.append("* * * * * * * * \r\n ");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String numar= " ";
        for (int i=0;i<list1.size();i++)
        {

            numar=numar+" "+list1.get(i);
        }
        try{
        bw.append("\r\n"+numar);
            System.out.println(numar);

        //bw.write("\r\n * * * * * * * *");
        bw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public boolean verificare()
    {
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)==1)
            {
                return false;
            }
        }
        return true;
    }



}

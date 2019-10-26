package javafromthescatching;
import java.util.ArrayList;
import java.util.Random;

public class javafromthescatching {
    static ArrayList<Record> records = new ArrayList();
    public static void main(String[] args) {
        int id=0,kor=0,math=0,eng=0,sci=0;
        int total;
        for(int i=0;i<100;i++)
        {
            id=i+1;
            kor=new Random().nextInt(4)+1;
            math=new Random().nextInt(4)+1;
            eng=new Random().nextInt(4)+1;
            sci=new Random().nextInt(4)+1;
            total=kor+math+eng+sci;
            Record re=new Record(id,kor,math,eng,sci);
            re.sum=total;
            records.add(re);
        }
        System.out.println("ID Number    Korean   Math   English   Science  Sum\t");
        for(int i=0;i<100;i++)
        {
            Record rec=records.get(i);
            id=rec.getIdNumber();
            kor=rec.Korean;
            math=rec.Math;
            eng=rec.English;
            sci=rec.Science;
            total=rec.sum;
            System.out.println("    "+id+"\t\t\t"+kor+"\t\t"+math+"\t\t"+eng+"\t\t"+sci+"\t\t"+total+"\t");
        }
    }
}

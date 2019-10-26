package javafromthescatching;
public class Record {
    int IdNumber;
    int Korean;
    int Math;
    int English;
    int Science;
    int sum;

    public Record(int x, int y, int z, int a, int b) {
        IdNumber = x;
        Korean = y;
        Math = z;
        English = a;
        Science = b;
    }

    public int getIdNumber() {
        return IdNumber;
    }
}


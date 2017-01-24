package learn;

public class StaticClass {
    private String first;
    private String last;
    private static int members = 0;
    
    public StaticClass(String ft, String lt){
        first = ft;
        last = lt;
        members++;
        System.out.printf("Name: %s %s\nMember No. %d\n", first, last, members);
    }
    
    public String getFirst(){
        return first;
    }
    
    public String getLast(){
        return last;
    }
    public static int getMembers(){
        return members;
    }
}

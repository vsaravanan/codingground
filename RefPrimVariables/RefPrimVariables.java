public class RefPrimVariables{

    private String name;
    private int age;

    public static void main(String []args){
        RefPrimVariables rpv = new RefPrimVariables();
        rpv.name = "saravan";
        rpv.age = 47;
        
        System.out.println(rpv.name);
        System.out.println(rpv.age);
        
        rpv.convertt(rpv, rpv.age);
        
        System.out.println(rpv.name);
        System.out.println(rpv.age);
    
    }
     
    public void convertt(RefPrimVariables rpv1, int mAge)
    {
        rpv1.name = "Modified";
        rpv1.age = 50;
        mAge++;
    }
}

import java.util.*;

public class HashCodeTest {
	
     private String name;
     private int age;

     public HashCodeTest() {		
     }

     public HashCodeTest(String name, int age) {
          this.name = name;
          this.age = age;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     @Override
     public boolean equals(Object obj) {
          //Remember: Some Java gurus recommend you avoid using instanceof
          if (obj instanceof HashCodeTest) {
               HashCodeTest emp = (HashCodeTest)obj;
               return (emp.name == name && emp.age == age);
          }
          return false;		
     }

     @Override
     public int hashCode() {
          return name.hashCode() + age;
     }

    // @Override
    // public int hashCode() {
    //      int result = 17;
    //      result = 37*result + name.hashCode();
    //      result = 37*result + age;
    //      return result;
    // }

    // @Override
    // public int hashCode() {
    //      return new HashCodeBuilder(83, 7)
    //           .append(name)
    //           .append(age)
    //           .toHashCode();
    // }



     public static void main(String[] args) {		
          HashCodeTest e = new HashCodeTest("muhammad", 24);
          Map<Object, Object> m = new HashMap<Object, Object>();
          m.put(e, "Muhammad Ali Khojaye");						

          // getting output 
          System.out.println(m.get(e)); 

         System.out.println(m.get(new HashCodeTest("muhammad", 24))); 


          e.name = "abid";
          
          // it fails to get
          System.out.println(m.get(e));		
          
          e.name = "amirrana";

          // it fails again
          System.out.println(m.get(new HashCodeTest("muhammad", 24))); 
     }
}

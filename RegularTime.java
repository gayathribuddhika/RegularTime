
package regulartime;


public class RegularTime {

    
    public static void main(String[] args) {
        RegTime time = new RegTime();
        
        System.out.println("The defaut time format:");
        System.out.println(time.display());
        
        System.out.println("The regular default time format:");
        System.out.println(time.regTime());
        
        System.out.println("The Example of default time format:");
        time.setTime(15, 42, 56);
        System.out.println(time.display());
        
        System.out.println("The Example of regular default time format:");
        time.setTime(15, 36, 59);
        System.out.println(time.regTime());
        
    }
    
}

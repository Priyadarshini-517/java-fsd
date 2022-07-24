
interface car 
{  
    default void show() 
    { 
        System.out.println("inside car : show method"); 
    } 
} 
interface bike 
{  
    default void show() 
    { 
        System.out.println("inside bike"); 
    } 
}  
public class example implements car, bike 
{  
    public void show() 
    {  
        car.super.show(); 
        bike.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        example ob = new example(); 
        ob.show(); 
    } 
}


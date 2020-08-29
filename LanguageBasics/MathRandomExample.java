package LanguageBasics; 

public class MathRandomExample {
        public static void main(String[] args)   
        {  
            // generate random number  between 0 and 1
            double a = Math.random();  
            double b = Math.random();  
            // Output is different every time this code is executed    
            System.out.println(a);  
            System.out.println(b);  
        }  
}  


class RandomExample2 {  
    public static void main(String[] args)   
    {  
        // Generate random number between 0 to 20  
        double a = Math.random() * 20;  
        double b = Math.random() * 20;  
        // Output is different every time this code is executed    
        System.out.println(a);  
        System.out.println(b);  
    }  
}  
// 0.2594036953954201
// 0.08875674000436018


// 19.09244621979338
// 14.762266967495655

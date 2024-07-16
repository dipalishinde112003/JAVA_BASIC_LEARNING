public class switch_as_expression2
{
    public static void main(String[] args) {
        String day="monday";
        String result="dips";
        result=switch(day)
        {
            case "monday","sunday": yield"diplo";
        
            case "tuesday": yield "tau";
        
            default: yield "nooo";
        };
        System.out.println(result);
    }
    
}

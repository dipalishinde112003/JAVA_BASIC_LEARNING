public class switch_as_expression1
{
    public static void main(String[] args) {
        String day="monday";
        String result="dips";
        result=switch(day)
        {
            case "monday","sunday"->"diplo";
        
            case "tuesday"->"tau";
        
            default->"nooo";
        };
        System.out.println(result);
    }
    
}

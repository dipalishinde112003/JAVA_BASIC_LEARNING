public class switch_as_expression
{
    public static void main(String[] args) {
        String day="monday";
        String result="dips";
        switch(day)
        {
            case "monday","sunday"->result="diplo";
        
            case "tuesday"-> result="tau";
        
            default->result="nooo";
        }
        System.out.println(result);
    }
    
}

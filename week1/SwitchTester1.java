class SwitchTester1 {
    public static void main(String args[]) {
        //short a = 8;
        //byte b = 8;
        for (int a=1; a<=5; a++){
            //b = pow(a,2);
            int b=a*a;
            switchExperiment(a, b);
}
        for (int month=1; month<=12; month++){
            String season = "";
            seasonTester(month, season);
}
        //System.out.println(((Object)a).getClass().getName());
        //System.out.println(((Object)b).getClass().getName());
    }
    public static void switchExperiment(int a, int b) {
        switch (a) {
            case 1:
                b -= 4;
                break;
            case 2:
                b += 4;
                break;
            case 3:
                b /= 4;
                break;
            case 4:
                b *= 4;
                break;
            default:
                b = 0;
                break;
        }
        System.out.println("b is " + b);
    }
    public static void seasonTester(int month, String season){
        switch (month){
            case 1:
            case 2:
                season = "Winter!";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring!";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer!";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn!";
                break;
            case 12:
                season = "Winter!";
                break;
            default:
                season = "Unknown invalid input.";
                
        }
        if (month == 1){
            System.out.println(season);
            System.out.println("New Year, New Me!");
        }else if(month == 8){
            System.out.println(season);
            System.out.println("Summer Vacation!");      
         }
        else{
            System.out.println(season);
        }
    }
}

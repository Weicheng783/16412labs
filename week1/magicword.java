class magicword {
    public static String [][] square = {{"C","A","R","A"},{"A","R","E","A"},{"R","E","A","R"},{"D","A","C","T"}};
    public static String [][] square1 = {{"T","O","O"},{"U","R","N"},{"B","E","E"}};
    public static String [][] square2 = {{"S","C","E","N","T"},{"C","A","N","O","E"},{"A","R","S","O","N"},{"R","O","U","S","E"},{"F","L","E","E","T"}};

    public static void main(String args[]) {
        //short a = 8;
        //byte b = 8;
        
        String word = "square";
        int row = 0;
        int column = 0;
        boolean lefttoright = false;

        //printRow(word, row);
        //printColumn(word, column);
        //printDiagonal(word, lefttoright);
        
        wordsRepeated();
    }
    public static void printRow(String word, int row) {
                
            if (word == "square"){
        for(int i=0; i < square[row].length; i++){
                System.out.print(square[row][i]);
            }
}else if(word == "square1"){
        for(int i=0; i < square1[row].length; i++){
                System.out.print(square1[row][i]);
            }
                
}else if(word == "square2"){
        for(int i=0; i < square2[row].length; i++){
                System.out.print(square2[row][i]);
            }
}
         System.out.println();   
    }
    
    public static void wordsRepeated (){
       //if(square.length != square[i].length){} 
       int i = 0;
       int o = 0;
       do{
        //System.out.println(square[0][i]);
        do{
            if(square[i][o].equals(square[o][i])){
                
                if(o == square.length-1){
                    int m = 0;
                   do{  
                        
                        System.out.print(square[i][m]);
                        m ++;
                        if(m == square.length){
                            System.out.println();
                        }                
                    }while(m < square.length); 
                }
                
                o ++;
            }else{
                o ++;
                break;
}
            
            }while(o < square.length);
        i ++;
        o = 0;
    }while(i < square.length);
        i = 0;
        System.out.println("All lines/words have been scanned.");
}
    public static void printDiagonal(String word, boolean lefttoright) {
            //if(square.length != square[i].length){}    
            if (word == "square"){
                if (lefttoright == true){
        for(int i=0; i < square.length; i++){
                System.out.print(square[i][i]);
    }
            }else{
        for(int i=square.length-1; i >= 0; i--){
                System.out.print(square[square.length-1-i][i]);
    }
}
       }else if(word == "square1"){
        if (lefttoright == true){
        for(int i=0; i < square1.length; i++){
                System.out.print(square1[i][i]);
    }
            }else{
        for(int i=square1.length-1; i >= 0; i--){
                System.out.print(square1[square1.length-1-i][i]);
    }
}
                
       }else if(word == "square2"){
        if (lefttoright == true){
        for(int i=0; i < square2.length; i++){
                System.out.print(square2[i][i]);
    }
            }else{
        for(int i=square2.length-1; i >= 0; i--){
                System.out.print(square2[square2.length-1-i][i]);
    }
}
        }
         System.out.println();   
    }
    public static void printColumn(String word, int column) {
                
        //String [][] square = {{"L","I","M","B"},{"A","R","E","A"},{"C","O","R","K"},{"K","N","E","E"}};
            if (word == "square"){
        for(int i=0; i < square.length; i++){
                System.out.print(square[i][column]);
            }
}else if(word == "square1"){
        for(int i=0; i < square1.length; i++){
                System.out.print(square1[i][column]);
            }
                
}else if(word == "square2"){
        for(int i=0; i < square2.length; i++){
                System.out.print(square2[i][column]);
            }
}
         System.out.println();   
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

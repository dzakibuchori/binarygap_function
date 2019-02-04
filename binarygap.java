class BinaryGap {
    public int binaryGap(int N) {
        int bg=0;
        boolean lastZero = false ; 
        
        // another method to un-count last zero number
        // while (N % 2 == 0){
        //     N /= 2;
        // }
        
        for(int j = 0; N > 0; N /=2){
            if (N % 2 == 0){
                j++;
            } else {
                if (j>bg&&lastZero==true){
                    bg = j;
                }
                lastZero = true;
                j = 0;
            }
        }
        
        return bg;
    }
}

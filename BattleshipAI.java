//JAMES BEHNKE

public class BattleshipAI
{
    public static String makeGuess(char[][] guesses)
    {
        char [][] guessBoard = new char [10][10];
        int [][] probBoard = new int [10][10];
        boolean isBurning = false;
        int hitRow = 0;
        int hitCol = 0;
        int patrolBoat = 0;
        int submarine = 0;
        int destroyer = 0;
        int battleship = 0;
        int aircraftCarrier = 0;
        String guess = "a1";

        for(int row = 0; row < guesses.length; row++){ 
            for(int col = 0; col < guesses.length; col++){
                if(guesses[row][col] == 'X'){
                    isBurning = true;
                    hitRow = row; 
                    hitCol = col;
                   
                    if(hitCol + 1 < guesses.length && guesses[hitRow][hitCol +1] == '.'){
                        char a = (char)((int)'A' + hitRow);

                        guess = a + Integer.toString(hitCol+2);
                        return guess;
                    }else if(hitCol -1 >=  0 && guesses[hitRow][hitCol -1] == '.'){
                        char a = (char)((int)'A' + hitRow);

                        guess = a + Integer.toString(hitCol);
                        return guess;

                    }else if(hitRow + 1 < guesses.length && guesses[hitRow +1][hitCol] == '.'){
                        char a = (char)((int)'A' + hitRow + 1);

                        guess = a + Integer.toString(hitCol + 1);
                        return guess;

                    }else if(hitRow - 1 >= 0 && guesses[hitRow - 1][hitCol] == '.'){
                        char a = (char)((int)'A' + hitRow - 1);

                        guess = a + Integer.toString(hitCol + 1);
                        return guess;

                    }
                }

            }
        }

        if(isBurning == false){
            for(int row = 0; row < guesses.length; row++){
                for( int col = 0; col < guesses.length; col += 2){// scans board
                    if(row%2 == 1 && col == 0){ // if the row is not even
                        col++;
                      
                    }
                    if(guesses[row][col] == '.'){

                        char a = (char)((int)'A' + row);

                        guess = a + Integer.toString(col+1);
                        System.out.println(guess);
                        return guess;

                    }

                }
            }
        }
        return guess;
    }

}


class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0; //left/right
        int y = 0; //up/down
        for(char move:moves.toCharArray()){
            if(move == 'U'){//up
                y++;
            }
            else if(move == 'D'){//down
                y--;
            }
            else if(move == 'L'){//left
                x--;
            }
            else if(move == 'R'){//right
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}
public class GamePiece
{
    private int row;
    private int col;
    private int direction; //0 - left, 1 - right, up - 2, down - 3
    private String name;
    private int maxColumns = 8;
    private int maxRows = 8;
    
    public GamePiece()
    {
        row = 0;
        col = 0;
    }
  
    public GamePiece(int r, int c, String n)
    {
        row = r;
        col = c;
        name = n;

    }

    //add behaviors(methods) to get and set the name

    public int getRow()
    {
        return row;
    }
    
    public int getCol()
    {
        return col;
    }
    

    public void moveTo(int r, int c)
    {
        row = r;
        col = c;
    }
    
    public void moveLeft() {
        direction = 0;
        col--;
    }
    
    public void moveLeft(int x) {
        col -= x;
    }
    
    public void moveRight() {
        direction = 1;
        col++;
    }
    
    public void moveRight(int x) {
        col += x;
    }
    
    public void moveUp() {
        direction = 2;
        row--;
    }
    
    
    public void moveUp(int y) {
        row -= y;
    }
  
    public void moveDown() {
        direction = 3;
        row++;
    }
    
    public void moveDown(int y) {
        row += y;
    }
    
    public void move() {
        if(direction == 0) {
            if (col > 0 ) {
              moveLeft();
            }
            else {
              moveUp();
            }
        } else if(direction == 1){
            if (col < maxColumns) {
              moveRight();
            } else {
              moveDown();
            }
        } else if(direction == 2){
            if (row > 0) {
              moveUp();
            } else {
              moveRight();
            } 
        } else if(direction == 3){
            if (row < maxRows) {
              moveDown();
            } else {
              moveLeft();
            } 
        }
    }   
}
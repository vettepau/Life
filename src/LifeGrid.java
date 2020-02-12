public class LifeGrid
{
    private boolean grid[][];

    public LifeGrid(int w, int h) {
        grid = new boolean[h][w];
    }

    @Override
    public String toString() {
        String out = "";
        for(boolean[] row: grid){
            for(boolean cell: row){
                out += "[" + (cell?"X":" ") + "]";
            }
            out += "\n";
        }
        return out;
    }

    public int rows(){
        return grid.length;
    }

    public int cols(){
        return grid[0].length;
    }

    public void place(int row, int col) {
        grid[row][col] = true;
    }

    public void next() {
        
    }
}

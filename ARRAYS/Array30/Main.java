package ARRAYS.Array30;

public class Main {
    public static void main(String[] args) {

        // [[[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]],[0,2],[0,0,3,2,5],[0,2],[3,1],[3,0,3,2,10],[3,1],[0,2]]

        int[][] rectangle = { { 1, 2, 1 }, { 4, 3, 4 }, { 3, 2, 1 }, { 1, 1, 1 } };
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);

        subrectangleQueries.getValue(0, 2);
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        subrectangleQueries.getValue(0, 2);
        subrectangleQueries.getValue(3, 1);
        subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
        subrectangleQueries.getValue(3, 1);
        subrectangleQueries.getValue(0, 2);
    }

    static class SubrectangleQueries {

        public int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    rectangle[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return rectangle[row][col];
        }
    }

    /**
     * Your SubrectangleQueries object will be instantiated and called as such:
     * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
     * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
     * int param_2 = obj.getValue(row,col);
     */
}

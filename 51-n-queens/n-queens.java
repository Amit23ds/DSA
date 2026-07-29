class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        if(n==0) return result;
        List<String> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder row= new StringBuilder();
            for(int j=0;j<n;j++){
                row.append('.');
            }
            board.add(row.toString());
        }
        //solve(board,0);
        int startRow =0;
        HashSet<Integer> cols = new HashSet<>();
        HashSet<Integer> diags = new HashSet<>();
        HashSet<Integer> antiDiags = new HashSet<>();
        solve(board,startRow,cols,diags,antiDiags);

        return result;
    }
    void solve(List<String> board,int row,HashSet<Integer> cols, HashSet<Integer> diags,HashSet<Integer> antiDiags){
        if(row==board.size()){
            result.add(new ArrayList<>(board));
            return;
        }
        for(int col=0;col<board.size();col++){
            int diagId=row-col;
            int antiDiagId=row+col;
            if(cols.contains(col) || diags.contains(diagId) || antiDiags.contains(antiDiagId)){
                continue;
            }
            cols.add(col);
            diags.add(diagId);
            antiDiags.add(antiDiagId);
            StringBuilder newRow= new StringBuilder(board.get(row));
            newRow.setCharAt(col,'Q');
            board.set(row,newRow.toString());
            solve(board,row+1,cols,diags,antiDiags);
            cols.remove(col);
            diags.remove(diagId);
            antiDiags.remove(antiDiagId);
            newRow.setCharAt(col,'.');
            board.set(row,newRow.toString());
        }
    }


    // private void solve(List<String> board,int row){
    //     if(row==board.size()){
    //         result.add(new ArrayList<>(board));
    //         return;
    //     }
    //     for(int i=0;i<board.size();i++){
    //         if(isValid(board,row,i)){
    //             StringBuilder newRow = new StringBuilder(board.get(row));
    //             newRow.setCharAt(i,'Q');
    //             board.set(row,newRow.toString());
    //             solve(board,row+1);
    //             newRow.setCharAt(i,'.');
    //             board.set(row,newRow.toString());
    //         }
    //     }
    // }
    // boolean isValid(List<String> board,int row,int col){
    //     for(int i=row;i>=0;i--){
    //         if(board.get(i).charAt(col)=='Q'){
    //             return false;
    //         }
    //     }
    //     for(int i=row,j=col; i>=0 && j>=0; i--,j--){
    //         if(board.get(i).charAt(j)=='Q'){
    //             return false;
    //         }
    //     }
    //     for(int i=row,j=col; i>=0 && j<board.size(); i--,j++){
    //         if(board.get(i).charAt(j)=='Q'){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
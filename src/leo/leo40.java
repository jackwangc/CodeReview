//class Solution {
//    public void solve(char[][] ch) {
//        if (  ch.length == 0||ch == null ) return;
//        int a = ch.length;
//        int b = ch[0].length;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                boolean edgeFlag =   i == a - 1 || j == b - 1||i == 0 || j == 0;
//                if (edgeFlag && ch[i][j] == 'O') {
//                    dfs(ch, i, j);
//                }
//            }
//        }
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                if (ch[i][j] == 'O') {
//                    ch[i][j] = 'X';
//                }
//                if (ch[i][j] == '#') {
//                    ch[i][j] = 'O';
//                }
//            }
//        }
//    }
//
//    public void dfs(char[][] ch, int i, int j) {
//        if (i < 0 || j < 0 || i >= ch.length  || j >= ch[0].length || ch[i][j] == 'X' || ch[i][j] == '#') {
//            return;
//        }
//        ch[i][j] = '#';
//        dfs(ch, i - 1, j);
//        dfs(ch, i + 1, j);
//        dfs(ch, i, j - 1);
//        dfs(ch, i, j + 1);
//    }
//}

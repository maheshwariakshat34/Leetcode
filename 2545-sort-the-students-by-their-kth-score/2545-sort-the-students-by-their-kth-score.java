class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {

        int n = score.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (score[i][k] < score[j][k]) {

                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        return score;



        
        

    }
}
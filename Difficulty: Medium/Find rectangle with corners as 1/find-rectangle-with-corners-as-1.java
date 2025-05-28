class Solution {
    public boolean ValidCorner(int mat[][]) {
        // Code here
                HashMap<Integer, Set<Integer>> map = new HashMap<>();
        int rows = mat.length;
        if (rows == 0) return false;
        int cols = mat[0].length;
        
        for (int i = 0; i < rows; i++) {
            Set<Integer> columns = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    columns.add(j);
                }
            }
            Integer[] columnArray = columns.toArray(new Integer[0]);
            for (int k = 0; k < columnArray.length; k++) {
                for (int l = k + 1; l < columnArray.length; l++) {
                    int c1 = columnArray[k];
                    int c2 = columnArray[l];
                    if (map.containsKey(c1) && map.get(c1).contains(c2)) {
                        return true;
                    }
                }
            }
            for (int k = 0; k < columnArray.length; k++) {
                for (int l = k + 1; l < columnArray.length; l++) {
                    int c1 = columnArray[k];
                    int c2 = columnArray[l];
                    if (!map.containsKey(c1)) {
                        map.put(c1, new HashSet<>());
                    }
                    map.get(c1).add(c2);
                }
            }
        }
        return false;
    }
}
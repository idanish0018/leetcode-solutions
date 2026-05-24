// Problem: Pascal's Triangle
// LeetCode Problem No: 118
// Difficulty: Easy
// Topic: Arrays

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        answer.add(new ArrayList<>(firstRow));

        int middleElements = 0;

        for(int i=1; i<numRows; i++)
        {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            
            //middleElements
            for(int j=1; j<=middleElements; j++)
            {
                int element = answer.get(i-1).get(j) + answer.get(i-1).get(j-1);
                currentRow.add(element);
            }
            currentRow.add(1);
            answer.add(new ArrayList<>(currentRow));
            middleElements++;
        }
        return answer;
    }
}

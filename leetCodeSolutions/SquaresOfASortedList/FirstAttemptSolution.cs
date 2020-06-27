public class FirstAttemptSolution {
    // TODO there likely is a way to do it in one pass; current solution O(Nlog(N))
    public int[] SortedSquares(int[] A) {
        // square each number in the list: O(n)
        for(int i = 0; i < A.GetLength(0); ++i){
            A[i] = A[i] * A[i];
        }
        // sort using built in library for log(n) sorting
        Array.Sort(A);
        // return squared and sorted list
        return A;
    }
}

public class RectangleOverlap {
    public bool IsRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.Min(rec1[2],rec2[2])>Math.Max(rec1[0],rec2[0])&&Math.Min(rec1[3],rec2[3])>Math.Max(rec1[1],rec2[1]);
    }
}

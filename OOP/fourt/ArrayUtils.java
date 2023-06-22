package OOP.fourt;

public class ArrayUtils {
    public static <T> T[] replaceTwoElements(T [] array, int index1, int index2){
        if (index1<0 || index1>=array.length || index2<0 || index2>array.length)
        throw new IndexOutOfBoundsException();
        T[] bufArray = array.clone();
        T buf = bufArray[index1];
        bufArray[index1]=bufArray[2];
        bufArray[index2] = buf;
        return bufArray;
    }
}

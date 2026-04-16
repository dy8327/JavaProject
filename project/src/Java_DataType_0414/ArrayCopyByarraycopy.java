package Java_DataType_0414;

public class ArrayCopyByarraycopy {
    public static void main(String[] args) {
        String[] oldStrArray = { "Java", "Array", "Copy" };
        String[] newStrArray = new String[5];

        // System.arraycopy를 이용한 배열 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }

}

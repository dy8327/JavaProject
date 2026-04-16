package Java_DataType_0414;

public class ArrayCopybyFor {
    public static void main(String[] args) {
        int[] oldIntArray={1,2,3};
        int[] newIntArray=new int[5]; //5칸짜리 새로운 배열

        for(int i=0; i<oldIntArray.length;i++){
        newIntArray[i]=oldIntArray[i]; //배열 복사
    }
    for(int i=0; i<newIntArray.length;i++){
        System.out.print(newIntArray[i]+", ");
    }
}
}
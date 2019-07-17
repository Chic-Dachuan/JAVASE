package cn.edu360.javase24.day03;

public class ArrayDemoInit {
    public static void main(String[] args){
        int[] Arr = new int[5];

        // 数组初始化
        /**
         * 简化格式：
         * 	数据类型[] 数组名称 = {值, 值, …};
         * 完整格式（推荐）:
         * 	数据类型[] 数组名称 = new 数据类型[]{值, 值, …};
         */
        // int[] arrays = {1, 2, 3, 4, 5};
        int[] arrays = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arr[2]);
    }
}

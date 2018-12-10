package com.task_2;

public class MergeArrays {

    public static int[] mergeArraysToOne(int[] a1, int[] a2) {
        int r[] = new int[a1.length + a2.length];
        int a1Iterator = 0;
        int a2Iterator = 0;

        for (int i = 0; i < r.length; i++) {
            boolean a1Turn = false;
            if (a1.length > a1Iterator) {
                if ((a2.length > a2Iterator && a1[a1Iterator] <= a2[a2Iterator])
                        || (a2.length <= a2Iterator)) {
                    r[i] = a1[a1Iterator];
                    a1Iterator++;
                    a1Turn = true;
                }
            }
            if (!a1Turn) {
                r[i] = a2[a2Iterator];
                a2Iterator++;
            }
        }
        return r;
    }
}

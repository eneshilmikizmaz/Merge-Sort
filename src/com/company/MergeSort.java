package com.company;

/* Java program for Merge Sort */
class MergeSort {
    void merge(int arr[], int leftInd, int middleInd, int rightInd) {
        int n1 = middleInd - leftInd + 1;
        int n2 = rightInd - middleInd;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[leftInd + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[middleInd + 1 + j];

        int i = 0, j = 0;

        int k = leftInd;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int leftInd, int rightInd) {
        if (leftInd < rightInd) {
            int middleInd = leftInd + (rightInd - leftInd) / 2;

            sort(arr, leftInd, middleInd);
            sort(arr, middleInd + 1, rightInd);

            merge(arr, leftInd, middleInd, rightInd);
        }
    }
}

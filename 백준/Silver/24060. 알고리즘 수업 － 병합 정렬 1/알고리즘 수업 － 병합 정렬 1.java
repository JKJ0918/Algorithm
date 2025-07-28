import java.util.Scanner;

public class Main {

    static int[] arr;       // 입력 배열
    static int[] temp;      // 임시 배열 (병합에 사용)
    static int saveCount = 0;  // 저장 횟수 카운터
    static int K;           // K번째 저장 값을 찾기 위함
    static int result = -1; // 정답 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int N = sc.nextInt();  // 배열 길이
        K = sc.nextInt();      // 목표 저장 횟수
        arr = new int[N];
        temp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 병합 정렬 시작
        mergeSort(0, N - 1);

        // 결과 출력
        System.out.println(result);
    }

    // 병합 정렬 함수
    public static void mergeSort(int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // 왼쪽 절반 정렬
            mergeSort(left, mid);
            // 오른쪽 절반 정렬
            mergeSort(mid + 1, right);

            // 병합
            merge(left, mid, right);
        }
    }

    // 병합 함수 (왼쪽과 오른쪽을 합쳐 정렬된 배열로 만든다)
    public static void merge(int left, int mid, int right) {
        int i = left;     // 왼쪽 시작 인덱스
        int j = mid + 1;  // 오른쪽 시작 인덱스
        int t = 0;        // temp 배열 인덱스

        // 양쪽을 비교하며 작은 값을 temp에 저장
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }

        // 왼쪽에 남은 값 복사
        while (i <= mid) {
            temp[t++] = arr[i++];
        }

        // 오른쪽에 남은 값 복사
        while (j <= right) {
            temp[t++] = arr[j++];
        }

        // temp의 내용을 원래 arr에 복사하면서 저장 횟수를 세기
        t = 0;
        for (int k = left; k <= right; k++) {
            arr[k] = temp[t++];
            saveCount++;

            if (saveCount == K) {
                result = arr[k];  // K번째 저장된 값
                return;
            }
        }
    }
}


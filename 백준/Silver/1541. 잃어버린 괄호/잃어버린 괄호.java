import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// 백준 1541_ 잃어버린 괄호
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		// '-' 기준으로 분류
		String[] groups = input.split("-");
		
		int result = 0;
		
		// 첫번째 그룹은 모두 더하기
		result = sumGroup(groups[0]);
		
		// 두 번째 그룹은 모두 더한 후 result 에서 빼기
		
		for(int i=1; i<groups.length; i++) {
			
			int groupSum = sumGroup(groups[i]);
			result -= groupSum;
		}
		
		System.out.println(result);
		
	}
	
	// 문자열을 계산하는 함수
	private static int sumGroup(String group) {
		int sum = 0;
		
		// '+' 기준으로 나누기
		String[] nums = group.split("\\+"); // '+' 는 특수 문자
		
		for(int i=0; i< nums.length; i++) {
			
			sum += Integer.parseInt(nums[i]);
		}
		
		return sum;
		
	}// sumGroup
	
}

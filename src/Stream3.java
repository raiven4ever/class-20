import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect = list.stream().filter(t -> t > 5).collect(Collectors.toList());
		System.out.println(collect); // [6, 7, 8, 9, 10]
	}

}

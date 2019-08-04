import org.testng.annotations.Test;

public class AlphaOrderLoop {
	@Test
	public void main() {
		char givenChar = 'z';
		int ansi_givenchar = givenChar, cap_min = 65, cap_max = 90, sm_min = 97, sm_max = 122;
		if (cap_min <= (ansi_givenchar <= cap_max ? ansi_givenchar : 0)) {
			print(cap_min, cap_max, ansi_givenchar);
		}
		if (sm_min <= (ansi_givenchar <=  sm_max? ansi_givenchar : 0)) {
			print(sm_min, sm_max, ansi_givenchar);
		}
	}

	public void print(int start, int end, int ansi_givenchar) {
		int row, col;
		for (row = start; row <= ansi_givenchar;) {
			for (col = start; col <= row;) {
				System.out.print((char) col + " ");
				col++;
			}
			System.out.println();
			row++;
			if (row > ansi_givenchar) {
				for (row = ansi_givenchar - 1; row >= start;) {
					for (col = start; col <= row;) {
						System.out.print((char) col + " ");
						col++;
					}
					System.out.println();
					--row;
					if (row < start)
						System.exit(0);
				}
			}
		}

	}
}

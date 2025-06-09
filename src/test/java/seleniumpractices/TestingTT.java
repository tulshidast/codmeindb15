package seleniumpractices;

public class TestingTT {

	    static String[] months = {"Ra", "Ta", "Ut", "Ip", "Ok", "Py", "Ar", "Sy", "Du", "Fi", "Gr"};
	    static int[] monthDays = {36, 39, 26, 29, 31, 29, 33, 34, 35, 27, 43};
	    static String[] weekDays = {"Za", "Xo", "Cu", "Vo", "Bi", "Ne", "Ma", "Lu", "Ki"};

	    public static void main(String[] args) {
	        printCalendar(2618, 9, 4);
	    }

	    public static boolean isEnYear(int y) {
	        return y % 11 == 0;
	    }

	    public static int getMonthDays(int y, int i) {
	        int days = monthDays[i];
	        if (i == 8 && isEnYear(y)) {
	            return days - 1;
	        }
	        return days;
	    }

	    public static void printCalendar(int startYear, int startMonth, int numOfMonths) {
	        int year = startYear;
	        int month = startMonth - 1;
	        int tDays = 0;

	        // Calculate total days up to the given year
	        for (int i = 0; i < startYear; i++) {
	            for (int j = 0; j < 11; j++) {
	                tDays += getMonthDays(i, j);
	            }
	        }

	        // Add days for months before startMonth in startYear
	        for (int i = 0; i < startMonth - 1; i++) {
	            tDays += getMonthDays(startYear, i);
	        }

	        int curr = (1 + tDays) % 9;
	        System.out.println(curr + " Curr");

	        for (int i = 0; i < numOfMonths; i++) {
	            String mName = months[month];
	            int mDays = getMonthDays(year, month);

	            System.out.printf("\n  %s %d\n", mName, year);

	            for (String d : weekDays) {
	                System.out.print(d + " |");
	            }
	            System.out.println();

	            for (int j = 0; j < curr; j++) {
	                System.out.print("    ");
	            }

	            for (int k = 1; k <= mDays; k++) {
	                if (k == mDays && isEnYear(year) && month == 8) {
	                    System.out.printf("+%2d", k);
	                } else {
	                    System.out.printf("%2d", k);
	                }

	                curr = (curr + 1) % 9;

	                if (curr == 0) {
	                    System.out.println();
	                } else {
	                    System.out.print(" |");
	                }
	            }

	            if (curr != 0) {
	                System.out.println();
	            }

	            System.out.println();
	            month++;

	            if (month == 11) {
	                month = 0;
	                year++;
	            }
	        }
	    }
	}

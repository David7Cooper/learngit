package newDay;
/**StringBuffer,线程同步,因此安全,速度慢*/
/**StringBuilder,线程异步,因此不安全,速度快*/
public class My_StringBuffer{
	    public static void main(String[] args) {
	        int N = 77777777;
	        long t;

	        {
	            StringBuffer sb = new StringBuffer();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	                sb.append("");
	            }
	            System.out.println(System.currentTimeMillis() - t);
	        }

	        {
	            StringBuilder sb = new StringBuilder();
	            t = System.currentTimeMillis();
	            for (int i = N; i --> 0 ;) {
	                sb.append("");
	            }
	            System.out.println(System.currentTimeMillis() - t);
	        }
	    }
	}

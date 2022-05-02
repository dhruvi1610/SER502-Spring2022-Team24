package runtime;

/**
 * This class
 * @author
 * @since April-28-2022
 * @version 1.0
 */

public interface GJRuntimeConstants
{
		public static final String JO_TOH_START = "JO_TOH_START"; 			//	if-else start
		public static final String JO_START = "JO_START";					//	if start
		public static final String NAHITOH_JO_START = "NAHITOH_JO_START";	//	else-if start
		public static final String NAHITOH_START = "NAHITOH_START";			//  else start
		public static final String JO_TOH_END = "JO_TOH_END";				//  if-else end
		public static final String JO_END = "JO_END";						//	if end
		public static final String NAHITOH_JO_END = "NAHITOH_JO_END";		//	else-if end
		public static final String NAHITOH_END = "NAHITOH_END";				// 	else end

		public static final String ACCUMULATOR = "ACC";						// 	accumulator
		public static final String BIJU_REGISTER = "KA";					// 	second accumulator represented by Gujarati Alphabets
		public static final String TIJU_REGISTER = "KHA";					// 	third accumulator represented by Gujarati Alphabets
		public static final String CHOTHU_REGISTER = "GA";					// 	fourth accumulator represented by Gujarati Alphabets

		public static final String TARK_DEFAULT = "NA";						// Boolean default
		public static final String ANK_DEFAULT = "0";						// Intger default
		public static final String VAKYA_DEFAULT = "NULL"; 					//	String initial value

		public static final String OR = "ATHVA";							// 	Or in Gujarati
		public static final String AND = "ANE";								// 	And in Gujarati


		public static final String START_CONDITION = "START_CONDITION";		// 	Start Condition
		public static final String END_CONDITION = "END_CONDITION";			// 	End Condition

		public static final String SUDHI_START = "SUDHI_START";				// 	While Start
		public static final String SUDHI_END = "SUDHI_END";					// 	While End

		public static final String SACHAV = "SACHAV";						// 	Store instruction
		public static final String LAKH = "LAKH";							// 	Write Instruction

		public static final String ADDITION = "SARVALO";
		public static final String SUBTRACTION = "BADBAKI";
		public static final String MULTIPLY = "GUNAKAR";
		public static final String DIVIDE = "BHAGAKAR";

		public static final String UNARY_MINUS = "UNARY";

		public static final String VADHARE = "VADHARE";						// Greater than
		public static final String VADHARE_K_SARKHU = "VKS";				// Greater than or equal to
		public static final String OCHHU = "OCHHU";							// Less than
		public static final String OCHHU_K_SARKHU= "OKS";					// Less than or equal to
		public static final String SARKHU = "SARKHU";						// Equal to
		public static final String SARKHU_NAHI = "SARKHU_NAHI";				// Not Equal to
		public static final String PAKKU = "PAKKU";							// Question mark (For ternary operation)
		public static final String COLON = "COLON";							// Colon (For ternary operation)
}

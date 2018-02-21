package memory;

public class RegisterBank {
	
	/*
	 * Register Breakdown
	 * 
	 * Integer registers (reg_i)
	 * 
	 * #r0 	- #r1	-> reg_i 2,3				return values
	 * #a0 	- #a3 	-> reg_i 4-7				argument values
	 * #t0 	- #t7 	-> reg_i 8-15				temporary/non-reserved values
	 * #s0 	- #s7 	-> reg_i 16-23				saved/reserved values
	 * 
	 * Double registers (reg_d)
	 * 
	 * #dr0	- #dr1	-> reg_d 2,3
	 * #da2	- #da3	-> reg_d 4-7
	 * #dt0 - #dt3	-> reg_d 8-10
	 * #ds0 - #dt4	-> reg_d 11-15
	 * 
	 * Long registers (reg_p)
	 * 
	 * #gp        	-> reg_p 0      			global memory pointer
	 * #sp		  	-> reg_p 1				stack pointer
	 * #fp		  	-> reg_p 2				frame pointer
	 * #ra		  	-> reg_p 3				return address
	 * 
	 * 
	 */
	
	final int 	C_GEN_I = 32;
	final int 	C_GEN_D = 16;
	final int 	C_ADR_P	= 4;
	
	int 		R_GEN_I []; //general integer registers
	double 		R_GEN_D []; //general double registers
	long 		R_ADR_P []; //address pointers
	
	public RegisterBank() {
		R_GEN_I = new int[C_GEN_I];
		R_GEN_D = new double[C_GEN_D];
		R_ADR_P = new long [C_ADR_P];
	}
	
	public int getRegOffset(String reg) {
		
		
		
		return 0;
	}
	
}

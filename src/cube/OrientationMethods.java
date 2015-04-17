@@ -0,0 +1,639 @@
package cube;

public class OrientationMethods {
	
	public void left(int[] array){//performs a left slice clock-wise quarter turn.
		int temp = array[0];
		array[0] = array[45];
		array[45] = array[36];
		array[36] = array[12];
		array[12] = temp;
		
		temp = array[3];
		array[3] = array[48];
		array[48] = array[39];
		array[39] = array[21];
		array[21] = temp;
		
		temp = array[6];
		array[6] = array[51];
		array[51] = array[42];
		array[42] = array[30];
		array[30] = temp;
		
		temp = array[9];
		array[9] = array[27];
		array[27] = array[29];
		array[29] = array[11];
		array[11] = temp;
		
		temp = array[10];
		array[10] = array[18];
		array[18] = array[28];
		array[28] = array[20];
		array[20] = temp;	
	}
	
	public void leftPrime(int[] array){//performs a left slice counter-clock-wise quarter turn.
		int temp = array[0];
		array[0] = array[12];
		array[12] = array[36];
		array[36] = array[45];
		array[45] = temp;
		
		temp = array[3];
		array[3] = array[21];
		array[21] = array[39];
		array[39] = array[48];
		array[48] = temp;
		
		temp = array[6];
		array[6] = array[30];
		array[30] = array[42];
		array[42] = array[51];
		array[51] = temp;
		
		temp = array[9];
		array[9] = array[11];
		array[11] = array[29];
		array[29] = array[27];
		array[27] = temp;
		
		temp = array[10];
		array[10] = array[20];
		array[20] = array[28];
		array[28] = array[18];
		array[18] = temp;	
	}
	
	public void right(int[] array){//performs a right slice clock-wise quarter turn.
		int temp = array[53];
		array[53] = array[8];
		array[8] = array[32];
		array[32] = array[44];
		array[44] = temp;
		
		temp = array[50];
		array[50] = array[5];
		array[5] = array[23];
		array[23] = array[41];
		array[41] = temp;
		
		temp = array[47];
		array[47] = array[2];
		array[2] = array[14];
		array[14] = array[38];
		array[38] = temp;
		
		temp = array[33];
		array[33] = array[35];
		array[35] = array[17];
		array[17] = array[15];
		array[15] = temp;
		
		temp = array[24];
		array[24] = array[34];
		array[34] = array[26];
		array[26] = array[16];
		array[16] = temp;	
	}
	
	public void rightPrime(int[] array){//performs a right slice counter-clock-wise quarter turn.
		int temp = array[53];
		array[53] = array[44];
		array[44] = array[32];
		array[32] = array[8];
		array[8] = temp;
		
		temp = array[50];
		array[50] = array[41];
		array[41] = array[23];
		array[23] = array[5];
		array[5] = temp;
		
		temp = array[47];
		array[47] = array[38];
		array[38] = array[14];
		array[14] = array[2];
		array[2] = temp;
		
		temp = array[33];
		array[33] = array[15];
		array[15] = array[17];
		array[17] = array[35];
		array[35] = temp;
		
		temp = array[24];
		array[24] = array[16];
		array[16] = array[26];
		array[26] = array[34];
		array[34] = temp;	
	}
	
	public void up(int[] array){//performs an up slice clock-wise quarter turn.
		int temp = array[17];
		array[17] = array[51];
		array[51] = array[11];
		array[11] = array[14];
		array[14] = temp;
		
		temp = array[16];
		array[16] = array[52];
		array[52] = array[10];
		array[10] = array[13];
		array[13] = temp;
		
		temp = array[15];
		array[15] = array[53];
		array[53] = array[9];
		array[9] = array[12];
		array[12] = temp;
		
		temp = array[0];
		array[0] = array[6];
		array[6] = array[8];
		array[8] = array[2];
		array[2] = temp;
		
		temp = array[1];
		array[1] = array[3];
		array[3] = array[7];
		array[7] = array[5];
		array[5] = temp;	
	}
	
	public void upPrime(int[] array){//performs an up slice counter-clock-wise quarter turn.
		int temp = array[17];
		array[17] = array[14];
		array[14] = array[11];
		array[11] = array[51];
		array[51] = temp;
		
		temp = array[16];
		array[16] = array[13];
		array[13] = array[10];
		array[10] = array[52];
		array[52] = temp;
		
		temp = array[15];
		array[15] = array[12];
		array[12] = array[9];
		array[9] = array[53];
		array[53] = temp;
		
		temp = array[0];
		array[0] = array[2];
		array[2] = array[8];
		array[8] = array[6];
		array[6] = temp;
		
		temp = array[1];
		array[1] = array[5];
		array[5] = array[7];
		array[7] = array[3];
		array[3] = temp;	
	}
	
	public void down(int[] array){//performs a down slice clock-wise quarter turn.
		int temp = array[27];
		array[27] = array[47];
		array[47] = array[33];
		array[33] = array[30];
		array[30] = temp;
		
		temp = array[28];
		array[28] = array[46];
		array[46] = array[34];
		array[34] = array[31];
		array[31] = temp;
		
		temp = array[29];
		array[29] = array[45];
		array[45] = array[35];
		array[35] = array[32];
		array[32] = temp;
		
		temp = array[36];
		array[36] = array[42];
		array[42] = array[44];
		array[44] = array[38];
		array[38] = temp;
		
		temp = array[37];
		array[37] = array[39];
		array[39] = array[43];
		array[43] = array[41];
		array[41] = temp;	
	}
	
	public void downPrime(int[] array){//performs a down slice counter-clock-wise quarter turn.
		int temp = array[27];
		array[27] = array[30];
		array[30] = array[33];
		array[33] = array[47];
		array[47] = temp;
		
		temp = array[28];
		array[28] = array[31];
		array[31] = array[34];
		array[34] = array[46];
		array[46] = temp;
		
		temp = array[29];
		array[29] = array[32];
		array[32] = array[35];
		array[35] = array[45];
		array[45] = temp;
		
		temp = array[36];
		array[36] = array[38];
		array[38] = array[44];
		array[44] = array[42];
		array[42] = temp;
		
		temp = array[37];
		array[37] = array[41];
		array[41] = array[43];
		array[43] = array[39];
		array[39] = temp;	
	}
	
	public void front(int[] array){//performs a front slice clock-wise quarter turn.
		int temp = array[11];
		array[11] = array[36];
		array[36] = array[33];
		array[33] = array[8];
		array[8] = temp;
		
		temp = array[20];
		array[20] = array[37];
		array[37] = array[24];
		array[24] = array[7];
		array[7] = temp;
		
		temp = array[29];
		array[29] = array[38];
		array[38] = array[15];
		array[15] = array[6];
		array[6] = temp;
		
		temp = array[12];
		array[12] = array[30];
		array[30] = array[32];
		array[32] = array[14];
		array[14] = temp;
		
		temp = array[13];
		array[13] = array[21];
		array[21] = array[31];
		array[31] = array[23];
		array[23] = temp;	
	}
	
	public void frontPrime(int[] array){//performs a front slice counter-clock-wise quarter turn.
		int temp = array[11];
		array[11] = array[8];
		array[8] = array[33];
		array[33] = array[36];
		array[36] = temp;
		
		temp = array[20];
		array[20] = array[7];
		array[7] = array[24];
		array[24] = array[37];
		array[37] = temp;
		
		temp = array[29];
		array[29] = array[6];
		array[6] = array[15];
		array[15] = array[38];
		array[38] = temp;
		
		temp = array[12];
		array[12] = array[14];
		array[14] = array[32];
		array[32] = array[30];
		array[30] = temp;
		
		temp = array[13];
		array[13] = array[23];
		array[23] = array[31];
		array[31] = array[21];
		array[21] = temp;	
	}
	
	public void back(int[] array){//performs a back slice clock-wise quarter turn.
		int temp = array[2];
		array[2] = array[35];
		array[35] = array[42];
		array[42] = array[9];
		array[9] = temp;
		
		temp = array[1];
		array[1] = array[26];
		array[26] = array[43];
		array[43] = array[18];
		array[18] = temp;
		
		temp = array[0];
		array[0] = array[17];
		array[17] = array[44];
		array[44] = array[27];
		array[27] = temp;
		
		temp = array[53];
		array[53] = array[47];
		array[47] = array[45];
		array[45] = array[51];
		array[51] = temp;
		
		temp = array[52];
		array[52] = array[50];
		array[50] = array[46];
		array[46] = array[48];
		array[48] = temp;	
	}
	
	public void backPrime(int[] array){//performs a back slice counter-clock-wise quarter turn.
		int temp = array[2];
		array[2] = array[9];
		array[9] = array[42];
		array[42] = array[35];
		array[35] = temp;
		
		temp = array[1];
		array[1] = array[18];
		array[18] = array[43];
		array[43] = array[26];
		array[26] = temp;
		
		temp = array[0];
		array[0] = array[27];
		array[27] = array[44];
		array[44] = array[17];
		array[17] = temp;
		
		temp = array[53];
		array[53] = array[51];
		array[51] = array[45];
		array[45] = array[47];
		array[47] = temp;
		
		temp = array[52];
		array[52] = array[48];
		array[48] = array[46];
		array[46] = array[50];
		array[50] = temp;	
	}
	
	public void m(int[] array){//performs a middle layer (between L and R) clock-wise(as L) quarter turn.
		int temp = array[1];
		array[1] = array[46];
		array[46] = array[37];
		array[37] = array[13];
		array[13] = temp;
		
		temp = array[4];
		array[4] = array[49];
		array[49] = array[40];
		array[40] = array[22];
		array[22] = temp;
		
		temp = array[7];
		array[7] = array[52];
		array[52] = array[43];
		array[43] = array[31];
		array[31] = temp;
	}
	
	public void mPrime(int[] array){//performs a middle layer(between L and R) counter-clock-wise(as L) quarter turn.
		int temp = array[1];
		array[1] = array[13];
		array[13] = array[37];
		array[37] = array[46];
		array[46] = temp;
		
		temp = array[4];
		array[4] = array[22];
		array[22] = array[40];
		array[40] = array[49];
		array[49] = temp;
		
		temp = array[7];
		array[7] = array[31];
		array[31] = array[43];
		array[43] = array[52];
		array[52] = temp;
	}
	
	public void s(int[] array){//performs a middle layer(between F and B) clock-wise(as F) quarter turn.
		int temp = array[3];
		array[3] = array[28];
		array[28] = array[41];
		array[41] = array[16];
		array[16] = temp;
		
		temp = array[4];
		array[4] = array[19];
		array[19] = array[40];
		array[40] = array[25];
		array[25] = temp;
		
		temp = array[5];
		array[5] = array[10];
		array[10] = array[39];
		array[39] = array[34];
		array[34] = temp;
	}
	
	public void sPrime(int[] array){//performs a middle layer(between F and B) counter-clock-wise(as F) quarter turn.
		int temp = array[3];
		array[3] = array[16];
		array[16] = array[41];
		array[41] = array[28];
		array[28] = temp;
		
		temp = array[4];
		array[4] = array[25];
		array[25] = array[40];
		array[40] = array[19];
		array[19] = temp;
		
		temp = array[5];
		array[5] = array[34];
		array[34] = array[39];
		array[39] = array[10];
		array[10] = temp;
	}
	
	public void e(int[] array){//performs a middle layer(between U and D) clock-wise(as D) quarter turn.
		int temp = array[26];
		array[26] = array[23];
		array[23] = array[20];
		array[20] = array[48];
		array[48] = temp;
		
		temp = array[25];
		array[25] = array[22];
		array[22] = array[19];
		array[19] = array[49];
		array[49] = temp;
		
		temp = array[24];
		array[24] = array[21];
		array[21] = array[18];
		array[18] = array[50];
		array[50] = temp;
	}
	
	public void ePrime(int[] array){//performs a middle layer(between U and D) counter-clock-wise(as D) quarter turn.
		int temp = array[26];
		array[26] = array[48];
		array[48] = array[20];
		array[20] = array[23];
		array[23] = temp;
		
		temp = array[25];
		array[25] = array[49];
		array[49] = array[19];
		array[19] = array[22];
		array[22] = temp;
		
		temp = array[24];
		array[24] = array[50];
		array[50] = array[18];
		array[18] = array[21];
		array[21] = temp;
	}
	
	public void x(int[] array){//rotate the entire cube clockwise on R
		leftPrime(array);
		mPrime(array);
		right(array);
	}
	
	public void xPrime(int[] array){//rotate the entire cube counter-clockwise on R
		left(array);
		m(array);
		rightPrime(array);
	}
	
	public void y(int[] array){//rotate the entire cube clockwise on U
		up(array);
		ePrime(array);
		downPrime(array);
	}
	
	public void yPrime(int[] array){//rotate the entire cube counter-clockwise on U
		upPrime(array);
		e(array);
		down(array);
	}
	
	public void z(int[] array){//rotate the entire cube clockwise on F
		front(array);
		s(array);
		backPrime(array);
	}
	
	public void zPrime(int[] array){//rotate the entire cube counter-clockwise on F
		frontPrime(array);
		sPrime(array);
		back(array);
	}
	
	public void reorient(int[] array){//orient the cube to standard form
		//4, 19
		if(array[4] == 0 && array[19] == 2)
			yPrime(array);
		else if(array[4] == 0 && array[19] == 3){
			yPrime(array);
			yPrime(array);
		}
		else if(array[4] == 0 && array[19] == 5)
			y(array);
		else if(array[4] == 1 && array[19] == 4)
			zPrime(array);
		else if(array[4] == 2 && array[19] == 4){
			xPrime(array);
			zPrime(array);
		}
		else if(array[4] == 3 && array[19] == 4){
			xPrime(array);
			xPrime(array);
			zPrime(array);
		}
		else if(array[4] == 5 && array[19] == 4){
			x(array);
			zPrime(array);
		}
		else if(array[4] == 5 && array[19] == 1)
			y(array);
		else if(array[4] == 1 && array[19] == 2){
			zPrime(array);
			y(array);
		}
		else if(array[4] == 2 && array[19] == 3){
			zPrime(array);
			zPrime(array);
			y(array);
		}
		else if(array[4] == 3 && array[19] == 5){
			z(array);
			y(array);
		}
		else if(array[4] == 3 && array[19] == 0)
			z(array);
		else if(array[4] == 2 && array[19] == 0){
			yPrime(array);
			z(array);
		}
		else if(array[4] == 1 && array[19] == 0){
			yPrime(array);
			yPrime(array);
			z(array);
		}
		else if(array[4] == 5 && array[19] == 0){
			y(array);
			z(array);
		}
		else if(array[4] == 2 && array[19] == 1)
			yPrime(array);
		else if(array[4] == 1 && array[19] == 5){
			zPrime(array);
			yPrime(array);
		}
		else if(array[4] == 5 && array[19] == 3){
			zPrime(array);
			zPrime(array);
			yPrime(array);
		}
		else if(array[4] == 3 && array[19] == 2){
			z(array);
			yPrime(array);
		}
		else if(array[4] == 4 && array[19] == 1){
			y(array);
			y(array);
		}
		else if(array[4] == 4 && array[19] == 5){
			xPrime(array);
			y(array);
			y(array);
		}
		else if(array[4] == 4 && array[19] == 3){
			xPrime(array);
			xPrime(array);
			y(array);
			y(array);
		}
		else if(array[4] == 4 && array[19] == 2){
			x(array);
			y(array);
			y(array);
		}
		else if(array[4] == 0 && array[19] == 1){
			
		}
	}
}

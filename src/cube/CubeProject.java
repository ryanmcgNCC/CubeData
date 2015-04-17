@@ -0,0 +1,474 @@
package cube;

public class CubeProject {
	static OrientationMethods methods = new OrientationMethods();//allows the orientation methods to be called
	//counters
	static int zeromoves = 0;
	static int onemove = 0;
	static int twomoves = 0;
	static int threemoves = 0;
	static int fourmoves = 0;
	static int fivemoves = 0;
	static int sixmoves = 0;
	static int sevenmoves = 0;
	static int eightmoves = 0;
	static int ninemoves = 0;
	static int tenmoves = 0;
	static int elevenmoves = 0;
	static int twelvemoves = 0;
	static int thirteenmoves = 0;
	static int fourteenmoves = 0;
	static int fifteenmoves = 0;
	static int sixteenmoves = 0;
	static int seventeenmoves = 0;
	static int eightteenmoves = 0;
	static int nineteenmoves = 0;
	static int twentymoves = 0;
	static int uniquecount = 0;
	
	public static void resetCounts(){//resets all the counts
		zeromoves = 0;
		onemove = 0;
		twomoves = 0;
		threemoves = 0;
		fourmoves = 0;
		fivemoves = 0;
		sixmoves = 0;
		sevenmoves = 0;
		eightmoves = 0;
		ninemoves = 0;
		tenmoves = 0;
		elevenmoves = 0;
		twelvemoves = 0;
		thirteenmoves = 0;
		fourteenmoves = 0;
		fifteenmoves = 0;
		sixteenmoves = 0;
		seventeenmoves = 0;
		eightteenmoves = 0;
		nineteenmoves = 0;
		twentymoves = 0;
		uniquecount = 0;
	}
	
	public static void printResults(int i){//prints the results
		System.out.println("When there are " + i + " moves, ");
		System.out.println("there were " + uniquecount + " unique cases that took " + i + " moves to solve, ");
		System.out.println("there were " + zeromoves + " cases that took 0 moves to solve, ");
		System.out.println("there were " + onemove + " cases that took 1 moves to solve, ");
		System.out.println("there were " + twomoves + " cases that took 2 moves to solve, ");
		System.out.println("there were " + threemoves + " cases that took 3 moves to solve, ");
		System.out.println("there were " + fourmoves + " cases that took 4 moves to solve, ");
		System.out.println("there were " + fivemoves + " cases that took 5 moves to solve, ");
		System.out.println("there were " + sixmoves + " cases that took 6 moves to solve, ");
		System.out.println("there were " + sevenmoves + " cases that took 7 moves to solve, ");
		System.out.println("there were " + eightmoves + " cases that took 8 moves to solve, ");
		System.out.println("there were " + ninemoves + " cases that took 9 moves to solve, ");
		System.out.println("there were " + tenmoves + " cases that took 10 moves to solve, ");
		System.out.println("there were " + elevenmoves + " cases that took 11 moves to solve, ");
		System.out.println("there were " + twelvemoves + " cases that took 12 moves to solve, ");
		System.out.println("there were " + thirteenmoves + " cases that took 13 moves to solve, ");
		System.out.println("there were " + fourteenmoves + " cases that took 14 moves to solve, ");
		System.out.println("there were " + fifteenmoves + " cases that took 15 moves to solve, ");
		System.out.println("there were " + sixteenmoves + " cases that took 16 moves to solve, ");
		System.out.println("there were " + seventeenmoves + " cases that took 17 moves to solve, ");
		System.out.println("there were " + eightteenmoves + " cases that took 18 moves to solve, ");
		System.out.println("there were " + nineteenmoves + " cases that took 19 moves to solve, ");
		System.out.println("there were " + twentymoves + " cases that took 20 moves to solve");
	}
	
	public static void switcher(int i, int[] array){//intakes the i value and performs the appropriate orientation method on the array/cube
		switch(i){
		case 1: methods.left(array);
		break;
		case 2: methods.leftPrime(array);
		break;
		case 3: methods.right(array);
		break;
		case 4: methods.rightPrime(array);
		break;
		case 5: methods.up(array);
		break;
		case 6: methods.upPrime(array);
		break;
		case 7: methods.down(array);
		break;
		case 8: methods.downPrime(array);
		break;
		case 9: methods.back(array);
		break;
		case 10: methods.backPrime(array);
		break;
		case 11: methods.front(array);
		break;
		case 12: methods.frontPrime(array);
		break;
		case 13: methods.e(array);
		break;
		case 14: methods.ePrime(array);
		break;
		case 15: methods.m(array);
		break;
		case 16: methods.mPrime(array);
		break;
		case 17: methods.s(array);
		break;
		case 18: methods.sPrime(array);
		break;
		default: break;
		}
	}
	
	public static void main(String[] args){
		
		//adding all cube results after 0 moves
		int[] zeroCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
						  1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
						  4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,0};//represents a solved cube.
		//the 0 in the last index of the array remains unchanged throughout, and is used
		//later to represent how many moves this case can be solved in when it is searched for as a match
		switcher(0, zeroCube);
		methods.reorient(zeroCube);
		//order.insert(zeroCube); //into the database
		
		//adding all cube results after 1 move
		for(int i = 1; i < 19; i++){
			int[] oneCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
							 1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
							 4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,1};//represents a solved cube.
			//the 1 in the last index of the array remains unchanged throughout, and is used
			//later to represent how many moves this case can be solved in when it is searched for as a match
			switcher(i, oneCube);//perform every combination of 1 move
			methods.reorient(oneCube);//reorient the cube for continuities sake when searching for a match
			//insert(oneCube) into the database.
			//and increment the appropriate count
		}
		printResults(1);
		resetCounts();
		//adding all cube results after 2 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				int[] twoCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
						  		 1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
						  		 4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,2};//represents a solved cube.
				//the 2 in the last index of the array remains unchanged throughout, and is used
				//later to represent how many moves this case can be solved in when it is searched for as a match
				switcher(i, twoCube);
				switcher(j, twoCube);
				methods.reorient(twoCube);
				//do search for match of twoCube.
				//if match is found, increment the appropriate count
				//if no match is found, insert(twoCube) into the database
				//and increment the appropriate count
			}
		}
		printResults(2);
		resetCounts();
		//adding all cube results after 3 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					int[] threeCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
							  		   1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
							  		   4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,3};//represents a solved cube.
					//the 3 in the last index of the array remains unchanged throughout, and is used
					//later to represent how many moves this case can be solved in when it is searched for as a match
					switcher(i, threeCube);
					switcher(j, threeCube);
					switcher(k, threeCube);
					methods.reorient(threeCube);
					//do search for match of threeCube.
					//if match is found, increment the appropriate count
					//if no match is found, insert(threeCube) into the database
					//and increment the appropriate count
				}
			}
		}
		printResults(3);
		resetCounts();
		//adding all cube results after 4 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						int[] fourCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
										  1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
										  4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,4};//represents a solved cube.
						//the 4 in the last index of the array remains unchanged throughout, and is used
						//later to represent how many moves this case can be solved in when it is searched for as a match
						switcher(i, fourCube);
						switcher(j, fourCube);
						switcher(k, fourCube);
						switcher(l, fourCube);	
						methods.reorient(fourCube);
						//do search for match of fourCube.
						//if match is found, increment the appropriate count
						//if no match is found, insert(fourCube) into the database
						//and increment the appropriate count
					}
				}
			}
		}
		printResults(4);
		resetCounts();
		//adding all cube results after 5 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							int[] fiveCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
											  1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
											  4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5};//represents a solved cube.
							//the 5 in the last index of the array remains unchanged throughout, and is used
							//later to represent how many moves this case can be solved in when it is searched for as a match
							switcher(i, fiveCube);
							switcher(j, fiveCube);
							switcher(k, fiveCube);
							switcher(l, fiveCube);
							switcher(m, fiveCube);
							methods.reorient(fiveCube);
							//do search for match of fiveCube.
							//if match is found, increment the appropriate count
							//if no match is found, insert(fiveCube) into the database
							//and increment the appropriate count
						}
					}
				}
			}
		}
		printResults(5);
		resetCounts();
		//adding all cube results after 6 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								int[] sixCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
										  		 1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
										  		 4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,6};//represents a solved cube.
								//the 6 in the last index of the array remains unchanged throughout, and is used
								//later to represent how many moves this case can be solved in when it is searched for as a match
								switcher(i, sixCube);
								switcher(j, sixCube);
								switcher(k, sixCube);
								switcher(l, sixCube);
								switcher(m, sixCube);
								switcher(n, sixCube);
								methods.reorient(sixCube);
								//do search for match of sixCube.
								//if match is found, increment the appropriate count
								//if no match is found, insert(sixCube) into the database
								//and increment the appropriate count
							}
						}
					}
				}
			}
		}
		printResults(6);
		resetCounts();
		//adding all cube results after 7 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								for(int o = 1; o < 19; o++){
									int[] sevenCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
											  		   1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
											  		   4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,7};//represents a solved cube.
									//the 7 in the last index of the array remains unchanged throughout, and is used
									//later to represent how many moves this case can be solved in when it is searched for as a match
									switcher(i, sevenCube);
									switcher(j, sevenCube);
									switcher(k, sevenCube);
									switcher(l, sevenCube);
									switcher(m, sevenCube);
									switcher(n, sevenCube);
									switcher(o, sevenCube);
									methods.reorient(sevenCube);
									//do search for match of sevenCube.
									//if match is found, increment the appropriate count
									//if no match is found, insert(sevenCube) into the database
									//and increment the appropriate count
								}
							}
						}
					}
				}
			}
		}
		printResults(7);
		resetCounts();
		//adding all cube results after 8 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								for(int o = 1; o < 19; o++){
									for(int p = 1; p < 19; p++){
										int[] eightCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
												  		   1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
												  		   4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,8};//represents a solved cube.
										//the 8 in the last index of the array remains unchanged throughout, and is used
										//later to represent how many moves this case can be solved in when it is searched for as a match
										switcher(i, eightCube);
										switcher(j, eightCube);
										switcher(k, eightCube);
										switcher(l, eightCube);
										switcher(m, eightCube);
										switcher(n, eightCube);
										switcher(o, eightCube);
										switcher(p, eightCube);
										methods.reorient(eightCube);
										//do search for match of eightCube.
										//if match is found, increment the appropriate count
										//if no match is found, insert(eightCube) into the database
										//and increment the appropriate count
									}
								}
							}
						}
					}
				}
			}
		}
		printResults(8);
		resetCounts();
		//adding all cube results after 9 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								for(int o = 1; o < 19; o++){
									for(int p = 1; p < 19; p++){
										for(int q = 1; q < 19; q++){
											int[] nineCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
													  		  1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
													  		  4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,9};//represents a solved cube.
											//the 9 in the last index of the array remains unchanged throughout, and is used
											//later to represent how many moves this case can be solved in when it is searched for as a match
											switcher(i, nineCube);
											switcher(j, nineCube);
											switcher(k, nineCube);
											switcher(l, nineCube);
											switcher(m, nineCube);
											switcher(n, nineCube);
											switcher(o, nineCube);
											switcher(p, nineCube);
											switcher(q, nineCube);
											methods.reorient(nineCube);
											//do search for match of nineCube.
											//if match is found, increment the appropriate count
											//if no match is found, insert(nineCube) into the database
											//and increment the appropriate count
										}
									}
								}
							}
						}
					}
				}
			}
		}
		printResults(9);
		resetCounts();
		//adding all cube results after 10 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								for(int o = 1; o < 19; o++){
									for(int p = 1; p < 19; p++){
										for(int q = 1; q < 19; q++){
											for(int r = 1; r < 19; r++){
												int[] tenCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
														  		 1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
														  		 4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,10};//represents a solved cube.
												//the 10 in the last index of the array remains unchanged throughout, and is used
												//later to represent how many moves this case can be solved in when it is searched for as a match
												switcher(i, tenCube);
												switcher(j, tenCube);
												switcher(k, tenCube);
												switcher(l, tenCube);
												switcher(m, tenCube);
												switcher(n, tenCube);
												switcher(o, tenCube);
												switcher(p, tenCube);
												switcher(q, tenCube);
												switcher(r, tenCube);
												methods.reorient(tenCube);
												//do search for match of tenCube.
												//if match is found, increment the appropriate count
												//if no match is found, insert(tenCube) into the database
												//and increment the appropriate count
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		printResults(10);
		resetCounts();
		//adding all cube results after 11 moves
		for(int i = 1; i < 19; i++){
			for(int j = 1; j < 19; j++){
				for(int k = 1; k < 19; k++){
					for(int l = 1; l < 19; l++){
						for(int m = 1; m < 19; m++){
							for(int n = 1; n < 19; n++){
								for(int o = 1; o < 19; o++){
									for(int p = 1; p < 19; p++){
										for(int q = 1; q < 19; q++){
											for(int r = 1; r < 19; r++){
												for(int s = 1; s < 19; s++){
												int[] elevenCube = {0,0,0,0,0,0,0,0,0,1,1,1,2,2,2,3,3,3,
																	1,1,1,2,2,2,3,3,3,1,1,1,2,2,2,3,3,3,
																	4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,11};//represents a solved cube.
												//the 11 in the last index of the array remains unchanged throughout, and is used
												//later to represent how many moves this case can be solved in when it is searched for as a match
												switcher(i, elevenCube);
												switcher(j, elevenCube);
												switcher(k, elevenCube);
												switcher(l, elevenCube);
												switcher(m, elevenCube);
												switcher(n, elevenCube);
												switcher(o, elevenCube);
												switcher(p, elevenCube);
												switcher(q, elevenCube);
												switcher(r, elevenCube);
												switcher(s, elevenCube);
												methods.reorient(elevenCube);
												//do search for match of elevenCube.
												//if match is found, increment the appropriate count
												//if no match is found, insert(elevenCube) into the database
												//and increment the appropriate count
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		printResults(11);
		resetCounts();
	}
}

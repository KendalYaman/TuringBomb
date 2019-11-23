public class Bombe {//Pour Q

	public static void main(String[] args) {

		char tableCaractere[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
				,'P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		//Rotor N(x) 
		char tableNx[] = {'B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y'
				,'E','I','W','G','A','K','M','U','S','Q','O'};
		
		//Rotor M(x) 
		char tableMx[] = {'A','J','D','K','S','I','R','U','X','B','L','H','W','T'
				,'M','C','Q','G','Z','N','P','Y','F','V','O','E'};
				
		//Rotor L(x) 
		char tableLx[] = {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X'
				,'U','S','P','A','I','B','R','C','J'};
		
		char Reflector[] = {'Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E'
				,'B','F','Z','C','W','V','J','A','T'};
		
		
		//My Ciphertext
		//char Ciphertext[] = {'H','L','T','A','D','A','I','D','B','I','B','A','I','I'};
		
		//My Plaintext
		//char Plaintext [] = {'B','T','Q','M','O','D','D','H','E','M','F','O','D','M'};
		
		
		
		
		
		//BruteForce
		int s;//This variable will contain the number of rotation and we will add 1 at the start meaning that 1 rotation before the forst type
		
		for (int i = 0 ; i < 26 ; i++) {//ROTOR L
			for (int j = 0 ; j < 26 ; j++) {//ROTOR M
				for (int k = 0 ; k < 26 ; k++) {//ROTOR N
					
					for(int l = 0; l < 26 ; l++) {//WE CHECK FOR EACH LETTER
						
						
						
						
						/*
						 * As Explain on the answer paper, all cycles are hard coded.
						 * Here, I did an example for Letter D
						 * */
						

						////////FIRST CYCLE
						s = (4)%26;//R4 : rotation of 4
						
						char rotN = tableNx[(s+k+l)%26];
						rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
						
						char rotM = tableCaractere[(getPosition(rotN)+j)%26];
						rotM = tableMx[getPosition(rotM)];
						rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
						
						char rotL = tableCaractere[(getPosition(rotM)+i)%26];
						rotL = tableLx[getPosition(rotL)];
						rotL = tableCaractere[(((getPosition(rotL)-i)%26)+26)%26];
						
						char Ref = tableCaractere[(getPosition(rotL))%26];
						Ref = Reflector[getPosition(Ref)];
						
						rotL = tableCaractere[(getPosition(Ref)+i)%26];
						rotL = tableCaractere[((new String(tableLx).indexOf(rotL))-i+26)%26];
						
						
						rotM = tableCaractere[(getPosition(rotL)+j)%26];
						rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
						
						
						rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
						rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
						
						
						////////////////////////
						
						
						s = 9 ;//R9
						rotN = tableNx[(s+k+getPosition(rotN))%26];
						rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
						
						rotM = tableCaractere[(getPosition(rotN)+j)%26];
						rotM = tableMx[getPosition(rotM)];
						rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
						
						rotL = tableCaractere[(getPosition(rotM)+i)%26];
						rotL = tableLx[getPosition(rotL)];
						rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
						
						Ref = tableCaractere[(getPosition(rotL))%26];//F
						Ref = Reflector[getPosition(Ref)];
						
						rotL = tableCaractere[(getPosition(Ref)+i)%26];
						rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
						
						rotM = tableCaractere[(getPosition(rotL)+j)%26];
						rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];


						rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
						rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
						
						
						////////SECOND CYCLE
						if(tableCaractere[l] == rotN) {

							s = (4)%26;//R4
							
							rotN = tableNx[(s+k+l)%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(((getPosition(rotL)-i)%26)+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((new String(tableLx).indexOf(rotL))-i+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 12 ;//R12
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];//F
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 6 ;//R6
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];//F
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 8 ;//R8
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];//F
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							}////////THIRD CYCLE
							if(tableCaractere[l] == rotN) {
							
							s = (4)%26;//R4
							
							rotN = tableNx[(s+k+l)%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(((getPosition(rotL)-i)%26)+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((new String(tableLx).indexOf(rotL))-i+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 11 ;//R11
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 6 ;//R6
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];//F
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							

							////////////////////////
							
							
							s = 8 ;//R8
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];//F
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							}
							////////FOUFTH CYCLE
							if(tableCaractere[l] == rotN) {
							
							s = ( 10)%26;//R10
							
							rotN = tableNx[(s+k+l)%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(((getPosition(rotL)-i)%26)+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((((new String(tableMx).indexOf(rotM))-j)%26)+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];

							////////////////////////
							
							
							s = 2 ;//R2
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((((new String(tableMx).indexOf(rotM))-j)%26)+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							////////////////////////
							
							
							s = 3 ;//FOR R3
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((new String(tableMx).indexOf(rotM))-j+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 6 ;//R6
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((((new String(tableMx).indexOf(rotM))-j)%26)+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							
							////////////////////////
							
							
							s = 8 ;//R8
							rotN = tableNx[(s+k+getPosition(rotN))%26];
							rotN = tableCaractere[(((getPosition(rotN)-s-k)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotN)+j)%26];
							rotM = tableMx[getPosition(rotM)];
							rotM = tableCaractere[(((getPosition(rotM)-j)%26)+26)%26];
							
							rotL = tableCaractere[(getPosition(rotM)+i)%26];
							rotL = tableLx[getPosition(rotL)];
							rotL = tableCaractere[(getPosition(rotL)-i+26)%26];
							
							Ref = tableCaractere[(getPosition(rotL))%26];
							Ref = Reflector[getPosition(Ref)];
							
							rotL = tableCaractere[(getPosition(Ref)+i)%26];
							rotL = tableCaractere[((((new String(tableLx).indexOf(rotL))-i)%26)+26)%26];
							
							rotM = tableCaractere[(getPosition(rotL)+j)%26];
							rotM = tableCaractere[((((new String(tableMx).indexOf(rotM))-j)%26)+26)%26];
							
							rotN = tableCaractere[(getPosition(rotM)+s+k)%26];
							rotN = tableCaractere[((((new String(tableNx).indexOf(rotN))-s-k)%26)+26)%26];
							
							if(tableCaractere[l] == rotN) {
								System.out.println("Key: L:"+tableCaractere[i]+ " M:"+ tableCaractere[j] + " N:"+ tableCaractere[k]+ " . With the letter: "+tableCaractere[l]);
								
							}
						}
					}
				}
			}
		}
	}
	
	static public int getPosition(char c) {
		
		int temp = (int)c;
		int temp_integer = 64; //for upper case
		return (temp-temp_integer-1);
	}
	
}